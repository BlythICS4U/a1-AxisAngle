package problem3;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double kilometres, litres, fuelEfficiency;

        while(true) {
            System.out.println();
            System.out.print("Type the kilometres: ");
            kilometres = keyboard.nextDouble();
            if (kilometres < 0) {
                System.exit(0);
            }
            System.out.print("Type the litres: ");
            litres = keyboard.nextDouble();
            if (litres < 0) {
                System.exit(0);
            }
            fuelEfficiency = (100 * litres) / kilometres;
            System.out.printf("Fuel efficiency = " + "%.2f", fuelEfficiency);
            System.out.println();
        }
    }

}
