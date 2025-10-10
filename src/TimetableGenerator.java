import java.util.*;
import java.util.stream.Collectors;

/**
 * Enhanced TimetableGenerator
 * - Supports lab sessions (consecutive slots)
 * - Supports variable break/rest periods per teacher per day
 * - Enforces max consecutive lectures per teacher per day
 * - Uses MRV + constraint-aware backtracking with simple heuristics to produce compact, human-friendly timetables
 *
 * How this addresses "real life chaos":
 * - Teachers can have specific unavailable periods per day (breaks, meetings).
 * - Teachers also have a maxConsecutiveLectures setting to force rests.
 * - Lab sessions are allocated only where consecutive periods are available and lab rooms exist.
 * - Tasks are placed in order of strictness (fixed slots → limited-slot subjects → flexible subjects).
 *
 * Usage: edit sample data in main(), compile and run.
 */
public class TimetableGenerator {

    static final String[] DAYS = {"Mon","Tue","Wed","Thu","Fri","Sat"};
    static final int PERIODS_PER_DAY = 8;

    // --- Models ---
    static class Teacher {
        String id;
        String name;
        // Unavailable periods per day (dayIndex -> set of period numbers). Represents breaks/meetings that vary by day.
        Map<Integer, Set<Integer>> unavailablePerDay = new HashMap<>();
        int maxConsecutive = 3; // max lectures teacher can take consecutively without forced rest

        Teacher(String id, String name) { this.id = id; this.name = name; }

        boolean isAvailable(int day, int period) {
            Set<Integer> s = unavailablePerDay.get(day);
            if (s == null) return true;
            return !s.contains(period);
        }

        void setUnavailable(int day, Integer... periods) {
            unavailablePerDay.put(day, new HashSet<>(Arrays.asList(periods)));
        }
    }

    enum RoomType { THEORY, LAB }
    static class Room { String id; RoomType type; Room(String id, RoomType t){this.id=id;this.type=t;} }

    enum SubType { THEORY, LAB }
    static class Subject {
        String id; String name; String teacherId; SubType type; int duration; int weeklyCount; // duration = consecutive periods
        // allowed period numbers within a day (null => any)
        Set<Integer> allowedPeriods;
        Set<Integer> fixedDaysPeriods; // optional encoding of fixed slots: day*100 + period (e.g., Mon(0),period3 -> 0*100+3)

        Subject(String id, String name, String teacherId, SubType type, int duration, int weeklyCount, Set<Integer> allowedPeriods) {
            this.id=id;this.name=name;this.teacherId=teacherId;this.type=type;this.duration=duration;this.weeklyCount=weeklyCount;this.allowedPeriods=allowedPeriods;
            this.fixedDaysPeriods = new HashSet<>();
        }

        void addFixedSlot(int day, int period){ fixedDaysPeriods.add(day*100 + period); }
    }

    static class Section { String id; String name; Section(String id,String name){this.id=id;this.name=name;} }

    static class Assignment { String subjId; String teacherId; String roomId; Assignment(String s,String t,String r){this.subjId=s;this.teacherId=t;this.roomId=r;} }

    static class Task {
        Subject subject; String sectionId; int remaining; // remaining sessions to place
        Task(Subject s, String sec){ this.subject=s;this.sectionId=sec; this.remaining=s.weeklyCount; }
    }

    // --- Core generator ---
    static Map<String, Map<Integer, Map<Integer, Assignment>>> generate(
            List<Teacher> teachers, List<Room> rooms, List<Section> sections, List<Subject> subjects) {

        Map<String, Teacher> teacherMap = teachers.stream().collect(Collectors.toMap(t->t.id,t->t));
        Map<String, Room> roomMap = rooms.stream().collect(Collectors.toMap(r->r.id,r->r));

        // timetable: sectionId -> dayIndex -> period -> Assignment
        Map<String, Map<Integer, Map<Integer, Assignment>>> timetable = new HashMap<>();
        for (Section s: sections) {
            Map<Integer, Map<Integer, Assignment>> dmap = new HashMap<>();
            for (int d=0; d<DAYS.length; d++) dmap.put(d, new HashMap<>());
            timetable.put(s.id, dmap);
        }

        // Expand tasks per section
        List<Task> tasks = new ArrayList<>();
        for (Section sec: sections) {
            for (Subject sub: subjects) {
                // assume subject applies to all sections for MVP; you can refine later
                tasks.add(new Task(sub, sec.id));
            }
        }

        // Sort tasks: more constrained first (fixed slots -> limited allowed periods -> labs -> longer duration)
        tasks.sort(Comparator.<Task>comparingInt(t -> t.subject.fixedDaysPeriods.size() > 0 ? 0 : 1)
                .thenComparingInt(t -> (t.subject.allowedPeriods==null?100:t.subject.allowedPeriods.size()))
                .thenComparingInt(t -> -t.subject.duration)
                .thenComparing(t->t.subject.id));

        boolean ok = backtrackPlace(0, tasks, teachers, rooms, sections, timetable, teacherMap);
        if (!ok) return null;
        return timetable;
    }

    static boolean backtrackPlace(int idx, List<Task> tasks, List<Teacher> teachers, List<Room> rooms, List<Section> sections,
                                  Map<String, Map<Integer, Map<Integer, Assignment>>> timetable, Map<String, Teacher> teacherMap) {
        if (idx >= tasks.size()) return true;
        Task t = tasks.get(idx);
        Subject s = t.subject;

        // gather all candidate (day,period) start positions respecting allowedPeriods and fixed slots
        List<int[]> candidates = new ArrayList<>();
        for (int day=0; day<DAYS.length; day++) {
            for (int p=1; p<=PERIODS_PER_DAY; p++) {
                // check fixed slot requirement
                if (!s.fixedDaysPeriods.isEmpty() && !s.fixedDaysPeriods.contains(day*100 + p)) continue;
                if (s.allowedPeriods!=null && !s.allowedPeriods.contains(p)) continue;
                // teacher availability for every period in duration
                Teacher tch = teacherMap.get(s.teacherId);
                boolean teachAvail = true;
                for (int k=0;k<s.duration;k++){
                    int pp = p+k; if (pp>PERIODS_PER_DAY) { teachAvail=false; break; }
                    if (!tch.isAvailable(day, pp)) { teachAvail=false; break; }
                }
                if (!teachAvail) continue;
                candidates.add(new int[]{day,p});
            }
        }

        // sort candidates to prefer middle-of-day placement to leave flexible slots free; also try to minimize gaps for students
        candidates.sort(Comparator.comparingInt(a->Math.abs(a[1]- (PERIODS_PER_DAY/2))));

        for (int[] cand : candidates) {
            int day=cand[0], start=cand[1];
            // check section free & room free & teacher not exceeding maxConsecutive
            List<Integer> needed = new ArrayList<>();
            boolean slotOk=true;
            for (int k=0;k<s.duration;k++) {
                int p = start+k; if (p>PERIODS_PER_DAY) { slotOk=false; break; }
                // check section occupancy
                Map<Integer, Assignment> secDay = timetable.get(t.sectionId).get(day);
                if (secDay.containsKey(p)) { slotOk=false; break; }
                // check teacher uses
                if (!isTeacherFreeAt(s.teacherId, day, p, timetable)) { slotOk=false; break; }
                needed.add(p);
            }
            if (!slotOk) continue;

            // check teacher consecutive constraint: placing these should not create a run > maxConsecutive
            if (createsConsecutiveViolation(s.teacherId, day, needed, timetable, teacherMap)) continue;

            // find an available room matching type for all needed periods
            Room chosen = findRoomFor(s.type, day, needed, rooms, timetable);
            if (chosen==null) continue;

            // assign
            for (int p: needed) timetable.get(t.sectionId).get(day).put(p, new Assignment(s.id,s.teacherId,chosen.id));

            // decrement remaining and proceed
            t.remaining--;
            boolean proceed = true;
            if (t.remaining > 0) {
                // keep same task later in ordering by not advancing idx (simple approach) — but to avoid infinite loops we will reinsert after placement
                // We'll create a shallow copy of tasks with that task moved to end
                List<Task> newTasks = new ArrayList<>(tasks);
                // reduce remaining in copy
                newTasks.get(idx).remaining = t.remaining;
                // move this partially completed task to end
                Task moved = newTasks.remove(idx);
                newTasks.add(moved);
                if (backtrackPlace(idx, newTasks, teachers, rooms, sections, timetable, teacherMap)) return true;
            } else {
                if (backtrackPlace(idx+1, tasks, teachers, rooms, sections, timetable, teacherMap)) return true;
            }

            // rollback
            for (int p: needed) timetable.get(t.sectionId).get(day).remove(p);
            t.remaining++;
        }

        return false; // no candidate worked
    }

    static boolean isTeacherFreeAt(String teacherId, int day, int period, Map<String, Map<Integer, Map<Integer, Assignment>>> timetable){
        for (String sec : timetable.keySet()){
            Assignment a = timetable.get(sec).get(day).get(period);
            if (a!=null && a.teacherId.equals(teacherId)) return false;
        }
        return true;
    }

    static boolean createsConsecutiveViolation(String teacherId, int day, List<Integer> needed, Map<String, Map<Integer, Map<Integer, Assignment>>> timetable, Map<String, Teacher> teacherMap){
        Teacher t = teacherMap.get(teacherId);
        // gather existing periods teacher has on that day
        Set<Integer> existing = new HashSet<>();
        for (String sec : timetable.keySet()){
            existing.addAll(timetable.get(sec).get(day).keySet().stream().collect(Collectors.toSet()));
        }
        existing.addAll(needed);
        // find max consecutive streaks
        List<Integer> list = new ArrayList<>(existing); Collections.sort(list);
        int maxStreak=0, cur=0, prev=-10;
        for (int p:list){
            if (p==prev+1) cur++; else cur=1;
            prev=p; maxStreak=Math.max(maxStreak,cur);
        }
        return maxStreak > t.maxConsecutive;
    }

    static Room findRoomFor(SubType type, int day, List<Integer> periods, List<Room> rooms, Map<String, Map<Integer, Map<Integer, Assignment>>> timetable){
        for (Room r: rooms){
            if ((type==SubType.LAB && r.type!=RoomType.LAB) || (type==SubType.THEORY && r.type!=RoomType.THEORY)) continue;
            boolean ok=true;
            for (String sec : timetable.keySet()){
                for (int p: periods){
                    Assignment a = timetable.get(sec).get(day).get(p);
                    if (a!=null && a.roomId.equals(r.id)) { ok=false; break; }
                }
                if (!ok) break;
            }
            if (ok) return r;
        }
        return null;
    }

    // --- Printing nicely organized timetable ---
    static void print(Map<String, Map<Integer, Map<Integer, Assignment>>> tt, List<Section> sections){
        if (tt==null){ System.out.println("Generation failed — constraints too tight or input inconsistent."); return; }
        for (Section sec: sections){
            System.out.println(" === Timetable for " + sec.name + " ===");
            // header
            System.out.print(String.format("%-6s","Day"));
            for (int p=1;p<=PERIODS_PER_DAY;p++) System.out.print(String.format(" | P%02d ",p));
            System.out.println();
            System.out.println("-".repeat(8*(PERIODS_PER_DAY+2)));
            for (int d=0; d<DAYS.length; d++){
                System.out.print(String.format("%-6s",DAYS[d]));
                for (int p=1;p<=PERIODS_PER_DAY;p++){
                    Assignment a = tt.get(sec.id).get(d).get(p);
                    String cell = (a==null) ? "-----" : a.subjId+"/"+a.teacherId+"@"+a.roomId;
                    System.out.print(String.format(" | %-9s", cell));
                }
                System.out.println();
            }
        }
    }

    // --- Sample data & run ---
    public static void main(String[] args){
        // Teachers
        Teacher A = new Teacher("T1","Prof A"); A.maxConsecutive=2; // needs rest after 2
        // Prof A has variable daily breaks (e.g., Wed has break at 4th period)
        A.setUnavailable(2, 4); // Wednesday (index 2) period 4 unavailable

        Teacher B = new Teacher("T2","Prof B");
        Teacher C = new Teacher("T3","Prof C"); C.setUnavailable(0, 3); C.setUnavailable(4,5); // Mon p3 blocked, Fri p5 blocked

        List<Teacher> teachers = List.of(A,B,C);

        // Rooms
        Room r1 = new Room("R1", RoomType.THEORY); Room r2 = new Room("R2", RoomType.THEORY); Room lab1 = new Room("L1", RoomType.LAB);
        List<Room> rooms = List.of(r1,r2,lab1);

        // Subjects (id, name, teacherId, type, duration, weeklyCount, allowedPeriods)
        Subject s1 = new Subject("DS","DataStructures","T1",SubType.THEORY,1,4,null);
        Subject s2 = new Subject("OS","OperatingSys","T2",SubType.THEORY,1,3,null);
        Subject s3 = new Subject("EXT","External","T3",SubType.THEORY,1,2,new HashSet<>(Arrays.asList(1,2,7,8)));
        Subject lab = new Subject("OSL","OS-Lab","T2",SubType.LAB,2,2,null);
        // fixed example: DS must be on Monday period 3
        s1.addFixedSlot(0,3);

        List<Subject> subjects = List.of(s1,s2,s3,lab);

        Section sec1 = new Section("SEC1","CSE-5A");
        List<Section> sections = List.of(sec1);

        var tt = generate(teachers, rooms, sections, subjects);
        print(tt, sections);

        System.out.println(" Generation complete. If layout still looks suboptimal, we can add soft optimization goals (minimize gaps, balance teacher load).");
    }
}

