package IOdrills;
import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args){
        /*Read three numbers: Principal (P), Rate% per year (R), and Time in years (T).
        Compute SI = PRT/100.
        Print with 2 decimal places.*/

        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double SI = P*R*T / 100.0;

        System.out.println(SI);
        sc.close();
    }
}
