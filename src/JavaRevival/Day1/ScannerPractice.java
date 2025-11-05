package JavaRevival.Day1;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

//        // to calculate the Area of the rectangle (1st method)*****************************************

//        double Length = 0;
//        double Breadth = 0;
//        double Area = 0;
//
//        Scanner Sc = new Scanner(System.in);
//        System.out.print("Enter the length :");
//        Length = Sc.nextDouble();
//
//        System.out.print("Enter the breadth :");
//        Breadth = Sc.nextDouble();
//
//        Area = Length * Breadth;
//        System.out.println("The ara of the rectangle is :" + Area + " m^2/cm^2");

//        //2nd method****************************************************
//        Scanner Sc = new Scanner(System.in);
//
//        System.out.print("enter the length: ");
//        double length = Sc.nextDouble();
//
//        System.out.print("enter the breadth: ");
//        double breadth = Sc.nextDouble();
//
//        double area = length * breadth;
//        System.out.println("the area of the rectangle is : " + area + " cm².");

        //*************************************************************************************************************

        /* EXCEPTIONAL CASES FOR GETTING A STRING INPUT AFTER ANY DOUBLE , INT OR FLOAT VALUE ⭐⭐⭐

        ⚠️ Note: After using nextInt(), nextDouble(), etc., a newline (\n) remains in the input buffer.
        When nextLine() runs next, it reads that leftover newline and returns an empty string.
        ✅ Fix: Use an extra sc.nextLine() after numeric input to consume the leftover newline.
         */

//        //BELOW CODE IS THE WRONG WAY WHEN WE GET ERROR *********************************
//
//        System.out.print("enter your age: ");
//        int age = Sc.nextInt();
//
//        System.out.print("enter your fav color: ");
//        String color = Sc.nextLine();
//
//        System.out.println("Your are " + age + " years old and your fav color is " + color + ".");

//        //CORRECT VERSION
//
//        System.out.print("enter your age: ");
//        int age = Sc.nextInt();
//
//        Sc.nextLine(); //this next int consumes the leftover line or space buffer giving error to us.
//
//        System.out.print("enter your fav color: ");
//        String color = Sc.nextLine();
//
//        System.out.println("Your are " + age + " years old and your fav color is " + color + ".");


//        Sc.close();
    }
}
