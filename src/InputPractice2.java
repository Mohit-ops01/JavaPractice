import java.util.Scanner;

public class InputPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //import two numbers
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number ");
        int num2 = sc.nextInt();

        // perform add, mul, diff, div operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double Quotient = (num2 != 0)?
        (double) num1 / num2 : 0; //avoided div by 0

        //output
        System.out.println("/n----results----");
        System.out.println("Sum: " + sum);
        System.out.println("Difference " + diff);
        System.out.println("Product " + product);
        System.out.println("Quotient: " + Quotient);
    }
 }
