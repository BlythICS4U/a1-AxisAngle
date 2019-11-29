package problem6;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author cgallinaro
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String input = keyboard.nextLine();
        input = input.trim();

        StringTokenizer words = new StringTokenizer(input);
        while (words.hasMoreTokens()) {

            if (words.nextToken().length() > 16) {
                System.out.println("The input includes argumentativeness, which is longer than 16 characters.");
                System.exit(0);
            }       

        }
      
        StringBuilder buildString = new StringBuilder(input);
        int start = 16;
        while (input.length() > start) {
            int position = input.lastIndexOf(" ", start);
          
            buildString = buildString.replace(position, position + 1, "\n");
            start = position + 17;  
        }
        System.out.println(buildString.toString());               
    }

}
