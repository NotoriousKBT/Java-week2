import java.util.Scanner;

public class Ex13_ConvertToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp in F: ");
        double userF = input.nextDouble();
        System.out.println("Temp in Celsius: " + toC(userF));

        input.close();
    } // main

    public static double toC (double F) {
        double cels = (F - 32) * 5/9;
        return cels;
    } // method

} // class
