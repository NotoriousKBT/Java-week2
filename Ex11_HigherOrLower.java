import java.util.Random;
import java.util.Scanner;


class Ex11_HigherOrLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

        Random rand = new Random();
        int randN = rand.nextInt(10) + 1;

        System.out.println("Guess a number between 1 - 10: ");
        int userN = input.nextInt();

        while (userN != randN) {

            if (userN < randN) {
                System.out.println("Your number is too small");
            } else if (userN > randN) {
                System.out.println("Your number is too large");
            }

            System.out.println("Guess another number: ");
            userN = input.nextInt();

            count++;

        } // end while

        System.out.println("You guessed in " + count + " tries");

        input.close();
    } // main

} // class