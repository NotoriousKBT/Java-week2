import java.util.Scanner;
class Ex05_AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int count = 0;
        double average;
       
        System.out.println("Enter a number: ");
        String userInput = input.nextLine();

        while (userInput.equals("=") == false) {

            double N = Double.parseDouble(userInput);
            
            count++;
            total += N;
            
            System.out.println("Enter another number: ");
            userInput = input.nextLine();
    
        } // end while

        average = total / count;
        System.out.println("The average is: " + average);

        input.close();

    } // main

} // class