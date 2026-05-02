package JavaRevival.Day4;

public class PercisionPractice {
    public static void main(String[] args) {
        //HERE WE'LL MASTER PRECISION CONCEPT IN PRINTf.

        double amount1 = 123.45;
        double amount2 = 199.12;
        double amount3 = -23.33; //float has max 6 digits after decimal , so it shows the rest as zeroes, to fix use .percision

//        System.out.printf("%f \n", amount1);
//        System.out.printf("%f \n", amount2);
//        System.out.printf("%f \n", amount3);

        System.out.printf("%.1f \n", amount1);
        System.out.printf("%.2f \n", amount2);
        System.out.printf("%.4f \n", amount3);
        //to set one digit after the decimal use .1 between % sign and the smallcase letter , for 2 digits after decimal use .2 after the decimal and so on ,

    }
}
