package JavaRevival.Day3;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args){

        //TO FIND CIRCUMFERENCE , AREA AND VOL OF CIRCLE
        //circumference = 2 * Pi * radius
        //area = Pi * Radius²
        //volume of sphere = 4/3 * Pi * R³

        Scanner gol = new Scanner(System.in);

        double radius;
        double result;


//        //CIRCUMFERENCE
//        System.out.print("enter radius: ");
//        radius = gol.nextDouble();
//
//        result = 2 * Math.PI * radius;
//
//        System.out.println("circumference is " + result );


//        //AREA
//        System.out.print("enter radius: ");
//        radius = gol.nextDouble();
//        result = Math.PI * Math.pow(radius , 2);
//        System.out.println("your area is " + result);

        //VOLUME OF SPHERE
        System.out.print("enter radius: ");
        radius = gol.nextDouble();
        result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("volume of sphere is " + result);


            gol.close();
    }
}
