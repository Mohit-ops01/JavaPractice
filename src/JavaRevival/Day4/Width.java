package JavaRevival.Day4;

public class Width {
    public static void main(String[] args){
        // WIDTH

        //0 = zero padding
        // number = right justified padding
        //negative number = left justified padding

        int id1 =1;
        int id2 = 29;
        int id3 = 999;
        int id4 =6878;

        System.out.printf("%d \n" , id1);
        System.out.printf("%d \n" , id2);
        System.out.printf("%d \n" , id3);
        System.out.printf("%d \n" , id4);

        System.out.println();

        //to add padding to the numbers , we can add 0 after % sign
        // after zero we can add , to how many numbers padding is to be done
        System.out.println("PADDED NUMBERS EXAMPLE");
        System.out.printf("%04d \n" , id1);
        System.out.printf("%04d \n" , id2);
        System.out.printf("%04d \n" , id3);
        System.out.printf("%04d \n" , id4);

        System.out.println();

        //WITHOUT ADDING ZERO AFTER % , BY JUST ADDING THE NUMBER OF THE PADDING , WE GET THE JUSTIFICATION - RIGHT JUSTIFICATION
        System.out.println("NON-ZERO PADDING (JUSTIFIED) NUMBERS EXAMPLE");
        System.out.printf("%4d \n" , id1);
        System.out.printf("%4d \n" , id2);
        System.out.printf("%4d \n" , id3);
        System.out.printf("%4d \n" , id4);

        System.out.println();

        //SIMILARLY BY ADDING A MINUS (-) SIGN AFTER % AND BEFORE PADDING NUMBER , WE GET LEFT JUSTIFIED PADDING
        System.out.println("NON-ZERO PADDING (LEFT- JUSTIFIED) NUMBERS EXAMPLE");
        System.out.printf("%-4d \n" , id1);
        System.out.printf("%-4d \n" , id2);
        System.out.printf("%-4d \n" , id3);
        System.out.printf("%-4d \n" , id4);
    }
}
