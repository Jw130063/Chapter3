import java.util.Scanner;

public class ComputeCommision {
    public static void main(String[] args) {
        char vType = 's';
        int value = 23000;
        double commRate = 0.08;
        Scanner imput = new Scanner(System.in);

        computeCommision(value, commRate, vType);
        computeCommision(value 40000, 0.10,  'L');
        System.out.println("Please enter the value of the vehicle>>>> ");
        value = imput.nextInt();
        computeCommision(value, commRate, vType);
        System.out.println("please enter the vehicle type>>>>>");
        vType = input.next();
        System.out.println("Please enter commission rate in decimals>>>>>");







    }
    public static void computeCommision(int value, double rate, char vehicle) {
        double commission;
        commission = value * rate;
        System.out.println("\nThe" + vehicle + "type vehicle is worth $" + commission);

    }
}
