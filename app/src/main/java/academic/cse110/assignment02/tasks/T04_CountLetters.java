package academic.cse110.assignment02.tasks;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T04_CountLetters {
    public static int countLetters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
    
    public static void runCountLetters(Scanner scanner) {
        scanner.nextLine();
        
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int letterCount = countLetters(s);
        System.out.println("The number of letters in the string is: " + letterCount);
    }
}
