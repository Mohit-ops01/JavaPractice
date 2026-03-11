package Java2k26;
import java.util.Scanner;

public class Functions {

//    public static void PrintMyName(String name){
//        System.out.println(name);
//        return;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        PrintMyName(name); //called fxn here
//    }


//        //Fxn to add 2 nos and print the sum
//
//    public static int CalculateSum(int a , int b){
//        int sum= a+b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum =CalculateSum(a,b);
//        System.out.println("the sum of two numbers is : " + sum);
//    }


    //fxn to multiply two numbers and print their sum

    public static int CalculateProduct(int a , int b){
        int Mul = a*b;
        return Mul;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = CalculateProduct(a,b);
        System.out.println("the product of 2 nos is : " +mul);
    }
}
