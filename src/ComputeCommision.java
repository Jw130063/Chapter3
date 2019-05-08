import java.util.Scanner;

public class ComputeCommision {
    public static void main(String[] args) {
        char vType = 's';
        int value = 23000;
        double commRate = 0.08;
        Scanner input = new Scanner(System.in);

        computeCommision(value, commRate, vType);

        System.out.println("Please enter the value of the vehicle>>>> ");
        value = input.nextInt();
        computeCommision(value, commRate, vType);
        System.out.println("please enter the vehicle type>>>>>");

        System.out.println("Please enter commission rate in decimals>>>>>");







    }
    public static void computeCommision(int value, double rate, char vehicle) {
        double commission;
        commission = value * rate;
        System.out.println("\nThe" + vehicle + "type vehicle is worth $" + commission);

    }
}
