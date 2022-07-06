import java.util.Scanner;

public class Ex04_SumToN {
    public static void main(String[] args) {

        int temp = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = input.nextInt();
        input.nextLine();

        for (int index = 1; index <= N; index++) {
           
           temp += index;
    
           System.out.println(temp);
        }
        input.close();
 
    } // main
} // class 
