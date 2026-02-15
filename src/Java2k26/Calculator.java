package Java2k26;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("select operation: 1(+) , 2(-) , 3(*) , 4(/) :   ");
        int operation = sc.nextInt();

        switch(operation){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:{
                System.out.println("invalid operation");
            }
        }



    }
}
