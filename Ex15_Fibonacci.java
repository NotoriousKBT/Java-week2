import java.util.Scanner;

public class Ex15_Fibonacci {
    public static void main(String[] args) {

        int previous = 0;
        int next = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers to generate: ");
        int userN = input.nextInt();

        for (int i = 0; i < userN; i++) {
            System.out.print(previous + ", ");

            int current = previous + next;
            previous = next;
            next = current;
        } // for

        input.close();
    } // main
} // class
