package problem5;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author cgallinaro
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type a line of text: ");
        String input = keyboard.nextLine();

        input = input.replaceAll("\'", "\"");
        input = input.replaceAll("(or)\\b", "our");
            
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();          
            if (word.matches("^[A-Z].*")) {
                word = word.toUpperCase();
            }            
            System.out.print(word + " ");
        }        
    }
}

