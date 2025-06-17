import java.util.Scanner;

public class InputPractice1 {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("city");
        String city = sc.nextLine();
        //final output
        System.out.println("---USER DETAILS---");
        System.out.println("Hello "+name +", you are " +age + " years old and live in " + city + ".");
        sc.close();
    }
}


