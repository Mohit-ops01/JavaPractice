public class PatternDemo {
    public static void main(String[] args){

//        // (1.) SQUARE , RECTANGLE PATTERN::
//        for (int i = 1; i<=4; i++) {
//            for (int j = 1; j <= 8; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        // (2.) RIGHT ANGLED TRIANGLE::
//        for (int i = 1; i<=6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        //(3.) NUMBER TRIANGLE::
//        for (int i = 1; i<=6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

          //(4.) INVERTED STAR PATTERN ::
        for (int i = 4; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
