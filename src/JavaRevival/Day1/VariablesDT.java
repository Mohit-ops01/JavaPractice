package JavaRevival.Day1;

import java.sql.SQLOutput;

public class VariablesDT {
    public static void main(String[] args){

        //int datatype
        int x = 14;
        int y = 14;
        int z = x+y;
        int k = 4;
        System.out.println(z);

        int age = 20;
        System.out.println(age);
        System.out.println("My age is " + age);

        //double datatype
        double amount = 10.98;
        double tax = 50.5;
        double percentage = 99.8;
        System.out.println("The required amount of this order is " + amount + " rupees");
        System.out.println("The percentage obtained is "+ percentage + "%");

        //character (char) datatype
        char grade = 'A';
        char currency = '$';
        char gender = 'M';
        System.out.println("His Grade in the exams are " + grade);
        System.out.print("He went to exchange " + currency + " for euroes \n");
        System.out.println("he is a " + gender);

        //boolean datatype
        boolean isStudent = true;
        boolean isValid = false;
        boolean isPass = true;
        System.out.println("Is Jack a Student ? " + isStudent);
        System.out.println("Is this currency valid ?" + isValid);
        System.out.println("Has he passed ? "+isPass);

        if(isStudent){
            System.out.println("HE is a student");
        }else{
            System.out.println("HE is not a student");
        };

        //String datatype
        String name = "Mohit";
        String Age = "20";
        String Car = "Defender";
        String FavColour = "Blue";
        System.out.print("My name is " + name + ".");
        System.out.print(" My age is "+Age + ".");
        System.out.println(" My fav car is "+ Car + " and my fav colour is " + FavColour + ".");
        System.out.println();

        // combined use of multiple datatypes(para)
        System.out.println("Hello my name is "+name + "." + "My age is " + age + "." + "My fav car is " + Car + " and my favourite colour is " + FavColour + "." );
        System.out.print(Car + " costs about 12000 " + currency + ".");
        System.out.println("Its a " + k + "*" + k + " off-roading car " + ".");


    }
}
