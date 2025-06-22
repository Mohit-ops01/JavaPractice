import java.util.*;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*   int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("NAMASTE");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default:
                System.out.println("not valid");
        } */

        int A = sc.nextInt();
        int B = sc.nextInt();
        int operator = sc.nextInt();
          /*  1 = +
            2 = -
            3 = *
            4 = /
            5 = %   */
                switch (operator) {
                    case 1:
                        System.out.println(A + B);
                        break;
                    case 2:
                        System.out.println(A - B);
                        break;
                    case 3:
                        System.out.println(A * B);
                        break;
                    case 4: if (B == 0){
                        System.out.println("INVALID DIVISION");
                    } else {
                        System.out.println(A / B); }
                        break;
                    case 5: if (B == 0) {
                        System.out.println("INVALID DIVISION");
                    } else {
                        System.out.println(A % B);}
                        break;
                    default:
                        System.out.println("INVALID OPERATOR INPUT");
                }
    }
}
