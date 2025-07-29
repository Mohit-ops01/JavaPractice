import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Ask for user's city
        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        // Extra variables (float, char, boolean)
        float weight = 65.4f;
        char grade = 'A';
        boolean isLearning = true;

        // Display all inputs
        System.out.println("\n==== OUTPUT ====");
        System.out.println("Hello " + name + " from " + city + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Learning Java? " + isLearning);
    }
}
