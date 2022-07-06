import java.util.Scanner;

class Ex06_Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, hypo;

        System.out.println("Enter Side 1: ");
        side1 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Side 1: ");
        side2 = input.nextDouble();
        input.nextLine();

        hypo = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("Hypotenuse: " + hypo);

        input.close();

    } // main
} // class