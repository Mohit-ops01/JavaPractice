import java.util.*;

public class LoopsPractice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            System.out.println("here is your number: "+number );
        } while (number >= 0);

        System.out.println("---THE END---");
        //THIS IS TAKEN TO REPEATEDLY TAKE INT VALUES FROM USER INSIDE THE CODE
        //TO EXIT THIS WE HAVE TO INPUT THE VALUE TO -1, THEN THIS LOOP WILL BE ENDED

    }
}

