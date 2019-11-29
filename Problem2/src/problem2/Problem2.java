package problem2;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            int mark = keyboard.nextInt();

            if (mark >= 50 && mark <= 53) {
                System.out.println("D-");
            } else if (mark >= 54 && mark <= 57) {
                System.out.println("D");
            } else if (mark >= 58 && mark <= 61) {
                System.out.println("D+");
            } else if (mark >= 62 && mark <= 65) {
                System.out.println("C-");
            } else if (mark >= 66 && mark <= 69) {
                System.out.println("C");
            } else if (mark >= 70 && mark <= 73) {
                System.out.println("C+");
            } else if (mark >= 74 && mark <= 77) {
                System.out.println("B-");
            } else if (mark >= 78 && mark <= 81) {
                System.out.println("B");
            } else if (mark >= 82 && mark <= 85) {
                System.out.println("B+");
            } else if (mark >= 86 && mark <= 89) {
                System.out.println("A-");
            } else if (mark >= 90 && mark <= 94) {
                System.out.println("A");
            } else if (mark >=95 && mark <=99){
                System.out.println("A+");
            }

        }
    }
}
