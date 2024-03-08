package academic.cse110.assignment02.tasks;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T05_CountChar {
    public static int count(String str, char a) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == a) {
                count++;
            }
        }
        return count;
    }

    public static void runCountOccurrence(Scanner scanner) {
        scanner.nextLine();
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter a character to count: ");
        char a = scanner.next().charAt(0);

        int charCount = count(str, a);
        System.out.println("The character '" + a + "' occurs " + charCount + " times in the string.");
    }
}
