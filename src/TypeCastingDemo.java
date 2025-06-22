public class TypeCastingDemo {
    public static void main(String[] args) {
        //casting
        double price = 100.00;
        double SellingPrice = price + 18;
        System.out.println(SellingPrice);

        int price2 = 100;
        int SellingP = price2 + (int) 18.0; //explicit concept is used here which allows us to store
        //double type value in int type. like here 18.0 is stored
        System.out.println(SellingP);

        int a = 10;
        float b = a; // implicit as lower size value can fit in larger one, i.e 4bit in 8bit here
        System.out.println(b); //implicit :- int to float

        float x = 10.9f;
        int y = (int) x; //explicit as float cant fit in int type , so we have to define its type as int in ()
        System.out.println(y); // explicit :- float to int
    }
}
