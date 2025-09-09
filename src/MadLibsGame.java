import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){

        //MAD LIBS GAME USING SCANNER

        Scanner sc= new Scanner(System.in);

        String adjective1; //adj are the describing words like cheap, expensive , tall, short etc
        String noun1; //noun is anything like person , place or thing
        String adjective2;
        String verb1; //any action like sleeping , running , walking etc.
        String adjective3;

        System.out.print("Enter an adjective (describing word)");
        adjective1 = sc.nextLine();

        System.out.print("Enter a noun (animal or person)");
        noun1 = sc.nextLine();

        System.out.print("Enter an adjective (describing word)");
        adjective2 = sc.nextLine();

        System.out.print("Enter a verb ending with -ing (action)");
        verb1 = sc.nextLine();

        System.out.print("Enter an adjective (describing word)");
        adjective3 = sc.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo " );
        System.out.println("There i saw a " + noun1 + " in the cage .");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " ! ");
        System.out.println("i was " + adjective3 + " !");

        sc.close();
    }
}
