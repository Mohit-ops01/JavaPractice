public class VariablesDemo {
    public static void main(String[] args) {
        /* int x; this is declaration
        x=123;  this is assignment
         */
        int x = 123; //initialization
        System.out.println(x);
        System.out.println("required number is =" + x);
        //use long in place of int to store large numbers, long no. ends with L
        long y = 123456787909822344L;
        System.out.println(y);
        // float contain decimal values and ends with f
        float z = 1.35f;
        System.out.println(z);
        // we can do the same with double, no need of f at end
        double k=1.345;
        System.out.println(k);
        char symbol ='#';
        System.out.println(symbol);
        String name = "mohit sharma";
        System.out.println(name);
        System.out.println("hello " +name);
        int xo = 15;
        int yo= 20;
        //int sum= xo+yo;
        //int diff= yo-xo;
        int mul= xo*yo;
        System.out.println(mul);
        int az = 10;
        int bz = 5;
        int ans = (az*bz) / (az-bz);
        System.out.println(ans);
    }
}
