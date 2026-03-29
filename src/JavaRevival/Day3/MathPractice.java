package JavaRevival.Day3;
import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {

        //to use PYTHAGORAS THEOREM; --(H² = P² + B²)

        Scanner rain = new Scanner(System.in);
        double P;
        double B;
        double H;

        System.out.print("enter the base: ");
        B = rain.nextDouble();

        System.out.print("enter the perpendicular: ");
        P = rain.nextDouble();

        H = Math.sqrt(Math.pow(P , 2) + Math.pow(B , 2));
        System.out.println("the reqd hypotenuse side is: " + H);

        rain.close();

    }
}
