public class NumbersDemo {
    public static void main(String [] args){
        int a ;
        int b ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number>>>");
        a = input.nextInt;
        System.out.println("Please enter a whole number>>>");
        b = input.nextInt;

        displayTwiceTheNumbers90( a, b);
        displayNumberPlusFive(a, b);


    }
    public static void displayTwiceTheNumbers90(int a, int b) {
        a = a * 2;
        b = b * 2;
        displayResults("Twice the number is", a);
        displayResults("Twice the number is", b);

    }



    public static void displayNumberPlusFive(int y, int z) {

        y = y + 5;
        z = z + 5;

        displayResults("Plus 5 to the number", y );
        displayResults("Plus 5 to the number", z);


    }
             public static void displayNumberSquared(int c, int d){


             }
    public static void displayResults(String display, int answer){
        System.out.println( display +answer);
    }


}
