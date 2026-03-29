package JavaRevival.Day3;

public class Maths {
    public static void main(String[] args){

        //MATHS EXERCISES
        System.out.println(Math.PI); //this gives ready to use value of pi


        //TO PRINT POWER RAISED OUTPUT -- (base , power)
        double result;
        result = Math.pow(2 ,3);
        System.out.println(result);

        //TO GET MOD
        double MOD;
        MOD = Math.abs(-12);  //abs - absolute , bracket contains input for which MOD is done
        System.out.println(MOD);

        //TO GET SQUARE-ROOT OF ANY NUMBER
        double SqRoot;
        SqRoot = Math.sqrt(16);
        System.out.println(SqRoot);

        //TO ROUND-OFF ANY NUMBER
        double RoundOff;
        RoundOff =Math.round(4.98);
//        RoundOff= Math.round(4.12);
        System.out.println(RoundOff);


        //⭐⭐most IMPT ---- TO ROUND-OFF TO UPPER AND LOWER CUT
        double UpRound;
        UpRound = Math.ceil(9.11);  //ceil -- ROUNDS OFF THE NUMBER TO THE UPPER VALUE IT CAN HAVE --(CEILING)
        System.out.println(UpRound);

        //TO ROUND-OFF SAME TO LOWER CUT ,
        double DownRound;
        DownRound = Math.floor(9.11); //floor -- ROUNDS OFF THE NUMBER TO THE LOWER VALUE IT CAN HAVE --(FLOOR)
        System.out.println(DownRound);

        //TO FIND MAX. AND MIN. VALUE OUT OF NUMBERS --MAX , MIN
        int max;       //we can also use double data type to get max from decimal values
        max = Math.max(12 ,19);
        System.out.println(max);

        double min;
        min = Math.min(12 , 19);
        System.out.println(min);
    }
}
