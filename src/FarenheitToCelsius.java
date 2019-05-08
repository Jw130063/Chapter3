import java.util.Scanner;
public class FarenheitToCelsius {
     public static void main(String[] Args[]){
        Scanner input = new Scanner(System.in);
            int tempAt8, tempAt12, tempAt5;
        System.out.println("Enter the temp at 8 AM");
        tempAt8 = input.nextInt();
         System.out.println("Enter the temp at 12 PM");
        tempAt12 = input.nextInt();
        System.out.println("Enter the temp at 5 PM");
              tempAt5 = input.nextInt();

        int far8, far12, far5;
         far8 = (tempAt8 * (9/5)) + 32;
         far12 = (tempAt8 * (9/5)) + 32;
        far5 = (tempAt8 * (9/5)) + 32;
            System.out.println("The temp at 8 AM was " + far8);
        System.out.println("The temp at 12 PM was " + far12);
        System.out.println("The temp at 5 PM was " + far5);

        if(far8 > 100 || far12 > 100 || far5 > 100){
            System.out.println("It is too hot to go outside!");
        }
             if(far8 < 32 || far12 < 32 || far5 < 32){
                System.out.println("It is freezing outside!");
        }
    }




}
