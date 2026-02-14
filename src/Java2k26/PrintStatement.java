package Java2k26;
import java.sql.SQLOutput;
import java.util.*;

public class PrintStatement {
    public static void main(String[] args) {

        Scanner button = new Scanner(System.in);
        System.out.println("ENTER NUMBER FROM 1-3");
        int X = button.nextInt();

//        if (X == 1) {
//            System.out.println("HELLO");
//        } else if (X == 2) {
//            System.out.println("Namaste");
//        } else if (X == 3) {
//            System.out.print("Bonjour");
//        } else {
//            System.out.println("INVALID INPUT");
//        }

        switch(X){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default:
                System.out.println("INVALID INPUT");
        }


    }
}
