package Java2k26;
import java.util.*;

public class PatternPrint {
    public static void main(String[] args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        //VARIABLES
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);

        int age = 22;
        double salary = 100.00;
        System.out.println("MY salary is $ " +salary +" per hour");

        //INPUT/OUTPUT
        Scanner A = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = A.nextLine();
        System.out.println("your name is " + name);


        Scanner B = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int y = B.nextInt();
        System.out.print("Enter second number: ");
        int z = B.nextInt();

        int sumo = y+z;
        System.out.println("Sum of first and second number is :"+sum);
    }
}
