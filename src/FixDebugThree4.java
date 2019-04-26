// This program calculates tutition bills as credits times rate per credit hour
public class FixDebugThree4
{
    public static void main(String args[])
    {
        double myCredits = 13;
        double yourCredits = 17.0;
        double rate = 75.84;
        System.out.println("My tuition:");
        tuitionBill(myCredits, rate);
        System.out.println("Your tuition:");
        tuitionBill(yourCredits, myCredits);
    }
    public static void tuitionBill(double c, double r)
    {
        System.out.println("Total due " + (r*c));
    }
}