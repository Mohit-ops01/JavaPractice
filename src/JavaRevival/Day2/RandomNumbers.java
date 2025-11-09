package JavaRevival.Day2;

import java.util.Random;


public class RandomNumbers {
    public static void main(String[] args) {

        //here we will learn how to generate random numbers
        Random rd = new Random();

        //this is to generate one random number only
//        int number;
//
////        number = rd.nextInt();
////        System.out.println(number);
////        //so here basically we will get the output of random number between neg. 2 billion to positive 2 billion. although we dont need such a large number
//
//        //to overcome this issue set limits in () like below ----
//        number = rd.nextInt(1 , 6);   //like if we want numbers between 1 to 6
//        System.out.println(number);


//        //to generate 2 or more random numbers ,
//        int number1;
//        int number2;
//        int number3;
//
//        number1 = rd.nextInt(1 , 8);//for eg we want all the three random numbers from 1 to 8 range
//        number2 = rd.nextInt(1 , 8);
//        number3 = rd.nextInt(1 , 8);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);


//        //to generate a number between 0 and 1 , we use double in place of int;
//        double number ;
//        number = rd.nextDouble();
//        System.out.println(number); //here there's no need to specify the limits

        //also we can get boolean output by using boolean datatype
        boolean isHeads;
        isHeads = rd.nextBoolean();
        System.out.println(isHeads);
        //or we can also use if statemnt to get the best desired output like--
        if(isHeads){
            System.out.println("HEADS");
        }else {
            System.out.println("TAILS");
        }

    }
}
