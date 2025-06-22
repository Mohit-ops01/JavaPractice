public class LogicalOperators {

    public static void main(String[] args) {
//        ---------- Logical Operators ----------
//        These operators perform logical AND, OR, and NOT operations.

        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Given values:");
        System.out.println("int a = " + a);
        System.out.println("int b = " + b);
        System.out.println("int c = " + c);
        System.out.println();


        // '&&' (Logical AND) operator
        // Returns true only if BOTH conditions are true.
        System.out.println("---------- Logical AND (&&) ----------");
        // Exmpl 1: (a < b) is true, (b > c) is true. Since both are true, the result is true.
        System.out.println("Is (a < b) && (b > c)? " + ((a < b) && (b > c))); // true && true -> true

        // Exmpl 2: (a > b) is false. The second condition is not even checked (short-circuiting). Result is false.
        System.out.println("Is (a > b) && (b > c)? " + ((a > b) && (b > c))); // false && (not evaluated) -> false
        System.out.println();


        // '||' (Logical OR) operator
        // Returns true if AT LEAST ONE of the conditions is true.
        System.out.println("---------- Logical OR (||) ----------");
        // Exmpl 1: (a > b) is false, but (b > c) is true. Since one is true, the result is true.
        System.out.println("Is (a > b) || (b > c)? " + ((a > b) || (b > c))); // false || true -> true

        // Exmpl 2: (a < b) is true. The second condition is not checked (short-circuiting). Result is true.
        System.out.println("Is (a < b) || (b < c)? " + ((a < b) || (b < c))); // true || (not evaluated) -> true

        // Exmpl 3: Both conditions are false, so the result is false.
        System.out.println("Is (a > b) || (b < c)? " + ((a > b) || (b < c))); // false || false -> false
        System.out.println();


        // '!' (Logical NOT) operator
        // Inverts the boolean value. Turns true to false and false to true.
        System.out.println("---------- Logical NOT (!) ----------");
        boolean condition = (a < b); // (10 < 20) is true
        System.out.println("Original condition (a < b) is: " + condition);
        System.out.println("Result of !(a < b) is: " + !condition); // !true -> false
        System.out.println();

        boolean anotherCondition = (a > b); // (10 > 20) is false
        System.out.println("Original condition (a > b) is: " + anotherCondition);
        System.out.println("Result of !(a > b) is: " + !anotherCondition); // !false -> true
        System.out.println();


        // Combining Operators
        System.out.println("---------- Combining Operators ----------");
        // This checks if a is less than b AND b is NOT greater than 30.
        // (10 < 20) is true. (20 > 30) is false. !(false) is true.
        // So, (true && true) results in true.
        boolean combined = (a < b) && !(b > 30);
        System.out.println("Result of (a < b) && !(b > 30) is: " + combined);
    }
}