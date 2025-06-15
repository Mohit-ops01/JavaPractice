public class SwapWithTemp {
    public static void main(String[] args) {
        String x = "cola";
        String y = "fanta";
        x = y;
        y = x;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        //now assigning a new string temp.
        String a = "cola";
        String b = "fanta";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        /* hence with temp we have swapped values of a & b. */
    }
}
