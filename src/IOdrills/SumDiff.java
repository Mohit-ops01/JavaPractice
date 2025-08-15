package IOdrills;
import java.util.*;

public class SumDiff {
    public static void main(String[] args){

    /* Sum and difference of two integers
    Input:Two integers a and b (same line or separate lines)
    Output:Sum and difference in separate lines */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;

        System.out.println("Sum = " + sum);
        System.out.println("Diff = " + diff);
        sc.close();
    }
}
