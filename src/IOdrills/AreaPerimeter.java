package IOdrills;
import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args){

   /*    Read length and breadth as doubles.
       Compute:Area = length × breadth
               Perimeter = 2 × (length + breadth)
       Print both with 2 decimals.
   */
       Scanner sc = new Scanner(System.in);
       double length = sc.nextDouble();
       double breadth = sc.nextDouble();

       double area = length * breadth;
       double perimeter = 2 * (length + breadth);

       System.out.println("Area: "+ area);
       System.out.println("Perimeter: "+ perimeter);


    /*  //IMPROVED VERSION:-
        // Input: length and breadth (can be on one line or separate lines)
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Invalid dimensions");
            sc.close();
            return;
        }

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area ="+ area);
        System.out.printf("Perimeter ="+ perimeter);
     */

        sc.close();
    }
}
