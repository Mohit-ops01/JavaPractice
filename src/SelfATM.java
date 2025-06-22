import java.util.Scanner;

public class SelfATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("\n--- Welcome to Mini ATM ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn.");
                    }
                    else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Visit again.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}