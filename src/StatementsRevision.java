import java.util.*;

public class StatementsRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age>18){
//            System.out.println("Adult");
//        }else {
//            System.out.println("Not Adult");
//        }


//        int a =sc.nextInt();
//        if(a%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }



//        int a = sc.nextInt();
//        if (a == 1) {
//            System.out.println("Helo");
//        } else if (a==2) {
//            System.out.println("Namaste");
//        } else if (a==3){
//            System.out.println("bonjour");
//        }else {
//            System.out.println("invalid input");
//        }



//    int a = sc.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("hello");
//                break;
//            case 2:
//                System.out.println("Namaste");
//                break;
//            case 3:
//                System.out.println("Bonjour");
//                break;
//            default:
//                System.out.println("Invalid");
//        }

        int a= sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();

        switch (operation){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid");

        }
    }
}
