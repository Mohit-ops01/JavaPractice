package JavaRevival.Day4;

public class PrintF {
    public static void main(String[] args){

        //printf() = is a method of output formatting
        // % [flag][width] [.percision] [specifier-character]

        String name = "Chotta Bheem";
        char firstLetter = 'C';
        int age = 100;
        double height = 6.2;
        boolean isMarried = true;

        System.out.printf("How r u %s !! \n" , name);  //string is shown by smallcase 's'
        System.out.printf("Your name starts with a %c \n" , firstLetter);  //character is shown by smallcase 'c'
        System.out.printf("You r %d years old \n" , age);   //integer is shown by smallcase 'd'
        System.out.printf("Your height is %f !! \n" , height);  //double is shown by smallcase 'f'
        System.out.printf("Married: %b \n" , isMarried);  //boolean is shown by smallcase 'b'


        //TO USE ALL THE ABOVE IN SAME LINE WE USE THIS METHOD :
        System.out.printf("%s is %d years old." ,name ,age);


    }
}
