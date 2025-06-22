public class ComparisonOperators {
    public static void main(String[] args){
//---------- Comparison Operators ----------
//        a == b
//        a != b (a is not equal to b)
//        a > b
//        a < b
//        a <= b (a is less than or equl to b)
//        a >= b (a is grtr thn or eql to b)
//These operators compare two values and return a boolean result (true or false)

        int a = 20;
        int b = 10;
        int c = 20;

        System.out.println("Given values:");
        System.out.println("int a = " + a);
        System.out.println("int b = " + b);
        System.out.println("int c = " + c);
        System.out.println();


        // '==' (Equal to) operator
        // Checks if the value of 'a' is equal to the value of 'b'
        System.out.println("Is a == b? " + (a == b)); // false, because 20 is not equal to 10

        // Checks if the value of 'a' is equal to the value of 'c'
        System.out.println("Is a == c? " + (a == c)); // true, because 20 is equal to 20
        System.out.println();


        // '!=' (Not equal to) operator
        // Checks if the value of 'a' is not equal to the value of 'b'
        System.out.println("Is a != b? " + (a != b)); // true, because 20 is not equal to 10
        System.out.println();


        // '>' (Greater than) operator
        // Checks if the value of 'a' is greater than the value of 'b'
        System.out.println("Is a > b? " + (a > b)); // true, because 20 is greater than 10
        System.out.println();


        // '<' (Less than) operator
        // Checks if the value of 'a' is less than the value of 'b'
        System.out.println("Is a < b? " + (a < b)); // false, because 20 is not less than 10
        System.out.println();


        // '>=' (Greater than or equal to) operator
        // Checks if the value of 'a' is greater than or equal to the value of 'c'
        System.out.println("Is a >= c? " + (a >= c)); // true, because 20 is equal to 20
        System.out.println();


        // '<=' (Less than or equal to) operator
        // Checks if the value of 'a' is less than or equal to the value of 'b'
        System.out.println("Is a <= b? " + (a <= b)); // false, because 20 is not less than or equal to 10
    }
}

