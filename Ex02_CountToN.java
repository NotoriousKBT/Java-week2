import java.util.Scanner;

class Ex02_CountToN { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int N = input.nextInt();
    input.nextLine();

    for (int index = 0; index < N; index++) System.out.println(index);
 
    input.close();

    } // main
} // class