import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         //user to enter any no.
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        //checking if no. is +ve, -ve or 0
        if (num > 0) {
            System.out.println("The no. is positive");
        } else if (num < 0) {
            System.out.println("The no. is negative");
        } else {
            System.out.println("The no. is zero"); }
        sc.close();
    }
}
