package Java2k26;
import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[]args){

        Scanner Puma = new Scanner(System.in);

        int age;
        boolean isStudent;
        String name;

        System.out.print("Enter your name: ");
        name = Puma.nextLine();

        System.out.print("Enter your age: ");
        age = Puma.nextInt();

        System.out.print("r u a Student? (true/false): ");
        isStudent = Puma.nextBoolean();

        if(name == "")/*name.isEmpty()*/{
            System.out.println("You hvnt entered ur name yet !!!");
        }
        else{
            System.out.println("hello " + name );
        }

        if(age >= 65){
            System.out.println("app buddhe ho !!");
        }
        else if(age >= 18){
            System.out.println("u r a major (adult) !");
        }
        else if(age <0){
            System.out.println("jammm ta pee pehla !!");
        }
        else if(age == 0){
            System.out.println("u r a newBorn Baby chottee");
        }
        else{
            System.out.println("u r a child!!");
        }

        if(isStudent==true){
            System.out.println("u r student !!");
        }
        else{
            System.out.println("u r nt a student !!");
        }
        Puma.close();
    }
}
