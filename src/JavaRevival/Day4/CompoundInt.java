package JavaRevival.Day4;
import java.util.Scanner;

public class CompoundInt {
    public static void main(String[] args){

        //COMPOUND INTEREST CALCULATOR
        Scanner paisa = new Scanner(System.in);

        double PrincipalAmt ;
        double Roi ;  //rate of interest
        int CompoundTime ;
        int Yrs ;
        double FinalAmount;

        System.out.print("Enter the principal amount (in Rs.) : ");
        PrincipalAmt = paisa.nextDouble();

        System.out.print("Enter the Rate of Interest (in %) : ");
        Roi = paisa.nextDouble() / 100;

        System.out.print("Enter the no. of times compounded per year: "); //example -monthly , quaterly , yearly etc.
        CompoundTime =paisa.nextInt();

        System.out.print("Enter no. of years of tenure: ");
        Yrs =paisa.nextInt();

        FinalAmount = PrincipalAmt * Math.pow(1 + Roi / CompoundTime , CompoundTime * Yrs);

        System.out.println("The amount after " + Yrs + " is Rs. " + FinalAmount);
        paisa.close();
    }
}
