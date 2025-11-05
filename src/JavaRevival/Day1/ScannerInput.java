package JavaRevival.Day1;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = Sc.nextLine();
        // System.out.println("Hello " + name);

        System.out.print("Enter your age :");
        int age = Sc.nextInt();
        // System.out.println("Hello " + name + "." + " Your age is " + age + " years.");

        System.out.print("Enter you GPA :");
        double gpa = Sc.nextDouble();
        //System.out.println("Hello " + name + "." + " Your age is " + age + " years." + " You are a good learner and your gpa is " + gpa + ".");

        System.out.print("Are you a Student ? (True/False) :");
        boolean IsStudent = Sc.nextBoolean();
        System.out.println("Hello " + name + "." + " Your age is " + age + " years." + " You are a good learner and your gpa is " + gpa + "." + " He is a Student ? " + IsStudent + ".");
       // Sc.nextLine(); // this is added here to add a line space after this output
        System.out.println(); //or we can use this to add a next line to this after the output

        if(IsStudent){
            System.out.println("You are enrolled as a Student of this college");
        }
        else{
            System.out.println("You are not enrolled as a Student of this college");
        }

        Sc.close();
    }
}
