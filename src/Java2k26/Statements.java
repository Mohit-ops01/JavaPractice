package Java2k26;

import java.util.*;


public class Statements {
    public static void main(String[] args) {

//        Scanner A = new Scanner(System.in);
//        System.out.print("Enter your age ");
//
//        int age = A.nextInt();
//
//        System.out.println("Your age is "+ age + " years.");
//
//        if(age>=18){
//            System.out.println("you are an adult.");
//        }else{
//            System.out.println("you are an child");
//        }
//
//        Scanner E = new Scanner(System.in);
//        System.out.print("enter your number ");
//        int number = E.nextInt();
//        System.out.println("Your number is "+ number);
//
//        if(number % 2 ==0){
//            System.out.println("you are an even.");
//        }else {
//            System.out.println("you are an odd.");
//        }

        Scanner T = new Scanner(System.in);
        System.out.print("Enter your FIRST number ");
        int number1 = T.nextInt();

        System.out.print("Enter your SECOND number ");
        int number2 = T.nextInt();

//        if (number1 == number2) {
//            System.out.println("both are equal");
//        } else {
//            if (number1 > number2) {
//                System.out.println("first number is greater than second number");
//            } else {
//                System.out.println("second number is greater than first number");
//            }
//        }

        if(number1>number2){
            System.out.println("number 1 is greater than number 2 ");
        }else if(number1==number2){
            System.out.println("number 1 is equal to number 2");
        }else{
            System.out.println("number1  is less than number2");
        }
    }
}
