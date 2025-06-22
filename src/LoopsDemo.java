import java.util.*;

public class LoopsDemo {
    public static void main(String[] args){

    /*    for (int counter = 0; counter < 11; counter++){
            // counter++ => (counter = counter+1)
            System.out.println(counter);
        }         */       // // this is called for loop


    /*    int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++ ;      //i++ = i+1
        }              // this is called while loop
    */

    /*   int i = 0 ;
    do {
        System.out.println(i);
        i = i + 1;
        } while (i < 11 );    */

        //printing sum of first n natural nos.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 0; i<=n ; i++ ){
//            sum = sum + i;
//        }
//        System.out.println(sum);

        //print table of any number n.
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for( int i=1 ; i<11 ; i++ ){
         System.out.println(n*i);
     }

        }
    }
