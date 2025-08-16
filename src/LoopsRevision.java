import java.util.Scanner;

public class LoopsRevision {
    public static void main(String[] args) {

//        // for loop
//        for (int counter = 0; counter < 20; counter = counter + 1) {
//            System.out.println("hello world");
//        }
//

//        //print no's from 0-10 using for loop
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i + " "); //here print is used to print in one line instead of println


//        //while loop :-doing same above problem with while loop
//        int i=0;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

//        //do-while loop:- same prblm with do-while loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);


//        //comparison b/w while and do-while by taking a false condition
//        int i = 12;
//        while (i <= 11) {
//            System.out.println("Hello Mohit");
//            i++;
//        }
//
//        do {
//            System.out.println("Hello Mohit");
//            i++;
//        } while (i <= 10);
//        //here in do while the main differnece is that the loop is running once rather than checking the
//        //condition and ending , but in while loop , the condition checks for the condition at the beginning
//        // and terminate the entire fxn.
//


//        //print the sum of first n natural nos
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        //print table of a no. input by user
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for (int i=1; i<=10; i++){
//            System.out.println(x * i );
//        }

        //print all even nos. till n.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
