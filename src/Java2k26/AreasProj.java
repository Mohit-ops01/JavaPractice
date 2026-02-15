package Java2k26;

import java.util.Scanner;

public class AreasProj {
    public static void main(String[] args) {

        //AREAS OF SHAPES
        //CIRCLE
        Scanner C = new Scanner(System.in);
        System.out.print("Enter Radius of Circle (in cm): ");
        float radius = C.nextFloat();
        double pi = 3.14;
        double area = pi * (radius * radius);
        System.out.println("Area of circle is " + area + " cm.");

        //RECTANGLE
        Scanner R = new Scanner(System.in);
        System.out.print("Enter length (in cm): ");
        double length = R.nextDouble();
        System.out.print("Enter width (in cm): ");
        double width = R.nextDouble();

        double RecArea = length * width;
        System.out.println("Area of rectangle is " + RecArea + " cm");
    }
}
