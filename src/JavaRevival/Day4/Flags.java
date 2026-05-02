package JavaRevival.Day4;

public class Flags {
    public static void main(String[] args){

        //Flags
        // + = output a plus
        // , = comma grouping separator
        //() = negative numbers are enclosed within a ()
        // space = display a minus if negative,space is positive

        double amount1 = 123000.45;
        double amount2 = 199000.12;
        double amount3 = 23000.33;
        double amount4 = -987.22;


        System.out.printf("%+.1f \n", amount1); //adding plus sign after % ensures + sign before any number , showing it as positive

        System.out.printf("%,+.2f \n", amount2); //adding comma after % sign gives us comma after every 1000 entry or sorts the amount is decent format

        System.out.printf("% .3f \n", amount3); //adding space after the % gives us space before the output number

        System.out.printf("%(.2f \n", amount4); //adding single bracket after the % gives us the bracket enclosure for any negative number without showing us the negative sign , but this only works for the negative , although we can add for the positive ones as well.
    }
}
