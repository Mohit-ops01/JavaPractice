import java.util.Scanner;

public class test {
    public static void main(String[] args){

//    Scanner sc = new Scanner(System.in);
//        System.out.print("enter lenth:");
//    int length = sc.nextInt();
//        System.out.print("enter breadth:");
//    int breadth = sc.nextInt();
//        System.out.println("length of your recangle is: "+length +" breadth of ur rec is: "+breadth);
//        int area = length*breadth;
//        System.out.println("area of rectanle is: "+area);


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check your status");

    int age = sc.nextInt();

    if(age >= 65){
        System.out.println("You are a senior citizen");
    }
    else if(age >= 25){
        System.out.println("You are a adult");
    }
    else if (age >=18){
        System.out.println("you are a major");
    }
    else if (age<=0){
        System.out.println("you are a baby");
    }
    else if (age<=17) {
        System.out.println("teen");
    }
    else {
        System.out.println("invalid input");
    }
       sc.close();
    }
}
