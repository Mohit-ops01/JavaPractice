package JavaRevival.Day2;
import java.util.Scanner;

public class ShoppingCartProg {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.print("What item would you like to buy?: ");
//        String food = sc.nextLine();
//
//        System.out.print("What is the price for each ?: ");
//        double price = sc.nextDouble();
//
//        System.out.print("How many would you like to buy?: ");
//        int amount = sc.nextInt();
//
//        double total = amount*price;
//
//        System.out.println("You have bought " + amount + " " + food + "/s");
//        System.out.println("your total is $" + total);


        //ALTERNATE WAY TO SIMPLIFY THIS CODE --
        String item;
        int quantity;
        double price;
        char currency = '$';
        double total ;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price for each ?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = sc.nextInt();

        total = quantity * price;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("your total is "+ currency + total);

        sc.close();
    }
}
