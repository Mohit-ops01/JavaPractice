import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*   int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are an ADULT");}
            else {
            System.out.println("Adoloscent");
        }
     */



    /* int X = sc.nextInt();

     if (X % 2 == 0){
         System.out.println("this is an EVEN NO.");}
     else {
         System.out.println("this is an ODD NO.");}          */


    /*    int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("EQUAL");
        } else {
            if (A > B) {
                System.out.println("A is GREATER");
            } else {
                System.out.println("A is SMALLER");
            }
        }              */ // this is if , else statement ;
                          // similarly this can be written in else if statement as--------

        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("EQUAL");
        }
        else if (A > B) {
            System.out.println("A is GREATER");
        }
        else {
            System.out.println("A is SMALLER");
        }
    }
}
