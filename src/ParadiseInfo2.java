import java.util.Scanner;

public class ParadiseInfo2 {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter cutoff price for discount >>");
        price = keyboard.nextDouble();

        System.out.print("Enter discount rate as a whole number >>");
        discount = keyboard.nextDouble();
        savings = computeDiscountInfo(price, discount);
        System.out.println("Discount of " + discount + "percent");
        System.out.println("Thats a savings of at least $" + savings);

        public static double computeDiscountInfo;
        {

            savings = pr * dscnt / 100;

        }


    }
}
