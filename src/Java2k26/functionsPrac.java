package Java2k26;
import java.util.Scanner;

public class functionsPrac {
    //find factorial of the number
    public static int PrintFactorial(int a){
        int factorial = 1;
        for(int i=a ; i>=1; i--){
            factorial= factorial*i;
        }
        return factorial;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(PrintFactorial(a));

    }
}
