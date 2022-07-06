import java.util.Scanner;

class Ex09_HighestAndLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter a number: ");
            int N = input.nextInt();

            if (N > max) max = N;
            if (N < min) min = N;

        } // for

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        input.close();
    } // main
} // class