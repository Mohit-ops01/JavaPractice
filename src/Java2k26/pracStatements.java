package Java2k26;
import java.util.*;

public class pracStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(age>=18){
//            System.out.println("you are an adult");
//        }else{
//            System.out.println("you are an child");
//        }



//        System.out.println("enter your number: ");
//        int num = sc.nextInt();
//
//        if(num % 2==0){
//            System.out.println("even number");
//        }else{
//            System.out.println("odd number");
//        }


//        System.out.println("Enter the first number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number");
//        int num2 = sc.nextInt();
//
//        if(num1>num2){
//            System.out.println("1 is grater than 2");
//        }else if(num1==num2){
//            System.out.println("both numbers are equal");
//        }else{
//            System.out.println("num1 is less than 2");
//        }


        System.out.println("enter button: ");
        int button = sc.nextInt();

//        if(button==1){
//            System.out.println("hello");
//        }else if(button==2){
//            System.out.println("namaste");
//        }else if(button==3){
//            System.out.println("bonjour");
//        }else{
//            System.out.println("invalid input");
//        }

        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");
        }


    }
}
