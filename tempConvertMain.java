
import java.util.Scanner;

public class main {


    static int flag;

    private static void TempConversion(double deg, int flag) {

        if (flag == 1) {
            System.out.println(deg + " in Celsius is: " + (deg - 32) * (5/9));
        }
        else if (flag == 0) {
            System.out.println(deg + " in Fahrenheit is: " + (deg * (5/9)) + 32);
        }
        else {
            System.out.println("Error: enter either 0 or 1 to pick a conversion.");
        }
    }

    public static void main(String[] arg0) {
        
        Scanner key = new Scanner(System.in);

        System.out.println("Enter 1 to convert from Fahrenheit to Celsius, enter 0 to convert from Celsius to Fahrenheit.");
        flag = key.nextInt();

        System.out.println("Enter degrees to be converted.");
        double deg = key.nextDouble();

        TempConversion(deg, flag);

    }

}