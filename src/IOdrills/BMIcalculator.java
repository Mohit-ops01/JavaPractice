package IOdrills;
import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args){

        /* Read weight in kg (double) and height in meters (double).
        Compute BMI = weight / (height*height).
        Print BMI with 1 decimal place.*/
         Scanner sc = new Scanner(System.in);
         double weight = sc.nextDouble();
         double height = sc.nextDouble();

         double BMI = weight / (height*height);

        System.out.println("BMI: "+BMI);



/*
        // IMPROVED VERSION :-
        // Input: weight (kg) and height (m)
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        // Guard against zero/negative heights to avoid division errors
        if (height <= 0) {
            System.out.println("Invalid height");
            sc.close();
            return;
        }

        // Compute BMI
        double bmi = weight / (height * height);

        // Output with 1 decimal
        System.out.printf("BMI = "+ bmi);

        String category;
        if (bmi < 18.5) category = "Underweight";
        else if (bmi < 25) category = "Normal";
        else if (bmi < 30) category = "Overweight";
        else category = "Obese";
        System.out.println("Category = " + category);
*/

        sc.close();
    }
}
