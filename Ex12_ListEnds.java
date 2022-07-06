import java.util.Random;
import java.util.Scanner;

public class Ex12_ListEnds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number: ");
            int userN = input.nextInt();
            nums[i] = userN;
        } // end for

        System.out.println("Printing your array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        } // end for
        
       int first = nums[0];
       int last = nums[nums.length - 1];

       int[] newNums = new int[5];

       for (int i = 0; i < newNums.length; i++) {
        newNums[i] = randNo(first, last);
     } // end for

    System.out.println("New array: ");
    for (int i = 0; i < newNums.length; i++) {
            
        System.out.print(newNums[i] + ", ");
    } // end for

    input.close();

    } // main

    public static int randNo (int f, int l) {
        int randomN = new Random().nextBoolean() ? f : l;
        return randomN;
        }

} // class

