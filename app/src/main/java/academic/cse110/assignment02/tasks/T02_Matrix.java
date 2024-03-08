package academic.cse110.assignment02.tasks;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T02_Matrix {
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + "\t");
            }
            System.out.println();
        }
    }
    
    public static void runPrintMatrix(Scanner scanner) {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        printMatrix(n);
    }
}
