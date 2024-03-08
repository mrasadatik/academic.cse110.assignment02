package academic.cse110.assignment02;

import java.util.Scanner;
import academic.cse110.assignment02.tasks.*;

public class App {
    public static void main(String[] args) {
        try (Scanner cliInput = new Scanner(System.in)) {
            int taskChoice;
            
            System.out.println();
            System.out.println("Assignment\t: 02");
            System.out.println("\tSubmitted to\t: Ahmed Abdal Shafi Rasel (AASR), Lecturer, Department of CSE");
            System.out.println();
            System.out.println("Name\t\t: Md Asaduzzaman Atik");
            System.out.println("Student ID\t: 2023-1-60-130");
            System.out.println("Couse title\t: Object Oriented Programming");
            System.out.println("Couse code\t: CSE110");
            System.out.println("Section\t\t: 16");
            System.out.println("Semester\t: Spring 2024");
            
            do {
                System.out.println();
                System.out.println();
                System.out.println("Choose a task by entering the corresponding number:");
                System.out.println("\t1. Palindrome Integer");
                System.out.println("\t2. Display Matrix of 0s and 1s");
                System.out.println("\t3. Check Password");
                System.out.println("\t4. Count the Letters in a String");
                System.out.println("\t5. Occurrences of a Specified Character");
                System.out.println("\t6. Stock Class");
                System.out.println("\t7. Use the GregorianCalendar Class");
                System.out.println("\t8. Stopwatch");
                System.out.println("\t9. Algebra: 2 * 2 Linear Equations");
                // System.out.println("\t10. The Location Class");
                
                System.out.println();
                System.out.println("\t\t0. Exit");
                System.out.print("\nEnter your choice: ");
                
                taskChoice = cliInput.nextInt();
                
                System.out.println();
                System.out.println();
                
                switch(taskChoice) {
                    case 1 -> T01_Palindrome.runPalindrome(cliInput);
                    case 2 -> T02_Matrix.runPrintMatrix(cliInput);
                    case 3 -> T03_Password.passwordValidator(cliInput);
                    case 4 -> T04_CountLetters.runCountLetters(cliInput);
                    case 5 -> T05_CountChar.runCountOccurrence(cliInput);
                    case 6 -> T06_Stock.displayStockDetails();
                    case 7 -> T07_CalendarTest.displayDate();
                    case 8 -> T08_StopWatch.getExecutionTime();
                    case 9 -> T09_LinearEquation.runLinearEquationCalculator(cliInput);
                    case 0 -> {
                        System.out.println("Exiting the program...");
                        break;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                
            } while (taskChoice != 0);
        }
    }
}
