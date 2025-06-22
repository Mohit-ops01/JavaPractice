import java.util.*;

public class LoopsPracticeQnA {
    public static void main(String[] args){

        //print all even nos. till n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1;  i<=n ; i++){
            if(i % 2 == 0 ){
                System.out.println(i);
            }
        }


    }
}
