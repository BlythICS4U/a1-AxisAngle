package problem1;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = keyboard.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = keyboard.nextDouble();

        if (number1 > 0 && number2 > 0) {
            double sum = number1 + number2;
            double average = sum / 2;

            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);
        } 
            else {
            System.out.println("GOOD BYE!");
        }

    }

}
