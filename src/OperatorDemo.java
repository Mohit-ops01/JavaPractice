public class OperatorDemo {
    public static void main(String[] args){
        //operators-

        //ARITHMETIC OPERATORS
        int a = 10;
        int b = 5;

        int sum = a+b;
        int diff = a - b;
        int mul = a*b;
        int div = a/b;

        System.out.println(sum);
        System.out.println(div); //if b is not completely divisible then it returns 0 rather than decimal
                                //as we have defined int instead of float in div class above
        System.out.println(mul);
        System.out.println(diff);

        int x = 12;
        int y = 13;
        float modulo = x%y; //modulo gives us the reminder value of any input i.e on dividing x, y we get
                            //reminder 12.0 , thats why to get accurate value we use float data type here
        System.out.println(modulo);
        //hence +, -, *, /, % these all are arithmetic operators


        //UNARY OPERATORS
        int z = 1;
        z = z +1;
        System.out.println(z);

        //same like z+1, we can use z++, here ++ is unary operator, which only needs single input or number
        int z2 = 1;
        System.out.println(z2++);  //by using ++ after any variable, this means first the number
                                    //will be printed as it is, then its value will be increased from nxttym
        System.out.println(z2); //now its value is increased

        System.out.println(++z2); //by ++ in front;means its value is chnged frst, then its printed😊


        int z3 = 3;
        System.out.println(z3--);
        System.out.println(z3);

        int z4 = 5;
        System.out.println(--z4);
    }
}
