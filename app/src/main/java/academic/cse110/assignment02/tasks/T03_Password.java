package academic.cse110.assignment02.tasks;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T03_Password {
    public static void passwordValidator(Scanner scanner) {
        scanner.nextLine();
        
        boolean lengthRequirementFulfilled = true;
        boolean lettersAndDigitsRequirementFulfilled = true;
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (password.length() < 8) {
            lengthRequirementFulfilled = false;
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                lettersAndDigitsRequirementFulfilled = false;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        
        if (lengthRequirementFulfilled && lettersAndDigitsRequirementFulfilled && (digitCount >= 2)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

}
