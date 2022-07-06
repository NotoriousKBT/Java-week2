import java.util.Scanner;

class Ex03_MultiplesOfThree { 
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a multiple of 3: ");
    int userN = input.nextInt();
    input.nextLine();

        for (int index = 0; index < userN; index++) {
            if (index % 3 == 0) System.out.println(index);
        } // for 

    input.close();

    } // main
} // class