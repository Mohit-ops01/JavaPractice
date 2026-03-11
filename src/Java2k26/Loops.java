package Java2k26;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        for(int i=0 ; i<11 ; i++){
//            System.out.println(i);
//        }

//        int i = 0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }

//        int i=0;
//        do{
//            System.out.print(i++ + "  ");
//        } while(i<11);


//        //printing sum of first n natural nos.
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter your number: ");
//        int num1=sc.nextInt();
//
//        int sum=0;
//        for(int i=1 ; i<=num1 ; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);


        //PRINTING TABLE OF NUMBER ENTERED BY THE USER
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int num = sc.nextInt();


        for(int i=1; i<11; i++){
            System.out.println(num*i);
        }

//        int n = 2;
//        for (int i=1; i<11; i++){
//            System.out.println(n*i);
//        }


    }
}
