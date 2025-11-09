package JavaRevival.Day2;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){

        //IF STATEMENT -- Performs a block of code only if the statement is true

//        int age = 20;  //or we can also accept age by user input
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = sc.nextLine();

        System.out.print("enter age: ");
        int age = sc.nextInt();

        System.out.print("are you a student ? (true/false): ");
        boolean isStudent = sc.nextBoolean();


        //group 1
        if(name.isEmpty()){
            System.out.println("you havent entered your name");
        }else{
            System.out.println("hello " + name + "!");
        }

        //group 2
        if (age >= 18){
            System.out.println("you are an adult ");
        } else if (age <= 0) {
            System.out.println("you havent been born yet ");
        } else{
            System.out.println("You are not an adult ");
        }

        //group 3
        if(isStudent){
            System.out.println("you are a student");
        }else{
            System.out.println("you are not a student");
        }

        sc.close();
    }
}
