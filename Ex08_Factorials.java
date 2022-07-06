import java.util.Scanner;

public class Ex08_Factorials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int temp = 1;

        System.out.println("Enter a number: ");
        int N = input.nextInt();
        input.nextLine();

        for (int index = 1; index <= N; index++) temp *= index;

        System.out.println(temp);

        input.close();
    } // main
    
} // class
