import java.util.Scanner;

public class Ex10_ReverseInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an input: ");
        String userI = input.nextLine();

        String temp = "";

        for (int index = userI.length() - 1; index >= 0 ; index--) temp += userI.charAt(index);
        
        System.out.println("Reverse String: " + temp);

        input.close();
    } // main
} // class
