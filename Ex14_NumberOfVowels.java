import java.util.Scanner;

class Ex14_NumberOfVowels {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String userI = input.nextLine();

        for (int i = 0; i < userI.length(); i++) {
            if (userI.charAt(i) == 'a' || userI.charAt(i) == 'e'|| userI.charAt(i) == 'i' || userI.charAt(i) == 'o' || userI.charAt(i) == 'u' )
              counter++;
        } // for

        System.out.println("Total of : " + counter + " vowels");

        input.close();
    } // main
} // class