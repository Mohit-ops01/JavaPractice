public class ArraysBasics {
    public static void main(String[] args){
        int[]marks = new int[3];
//        int marks[] = {10,20,30};     //this is used if we knew elements earlier

        marks[0]=10; //physics
        marks[1]=20; //maths
        marks[2]=30; //english
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        //to avoid writing print statements multiple times, use for loop

        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
