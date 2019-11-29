package problem4;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String input = keyboard.nextLine();
        input = input.replaceAll("[-| |?|!|\"|:|;|(|)|.|,|\']", "");    
        StringBuilder placeHolder = new StringBuilder(input);
        placeHolder = placeHolder.reverse();
        
        String reversedSentence = placeHolder.toString();
        if (reversedSentence.equalsIgnoreCase(input) == true) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");
        }

    }

}
