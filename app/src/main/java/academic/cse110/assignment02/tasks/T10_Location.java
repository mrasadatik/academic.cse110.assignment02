package academic.cse110.assignment02.tasks;

import java.util.Scanner;

class Location {
    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        int rows = a.length;
        int columns = a[0].length;
        Location location = new Location(0, 0, a[0][0]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] > location.getMaxValue()) {
                    location.setRow(i);
                    location.setColumn(j);
                    location.setMaxValue(a[i][j]);
                }
            }
        }

        return location;
    }
}

/**
 *
 * @author mrasadatik
 */
public class T10_Location {
    public static void runMaximalLocator(Scanner scanner) {
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        
        System.out.println("Enter the array:");
        double[][] array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        
        Location location = Location.locateLargest(array);
        
        System.out.printf("The location of the largest element is %.2f at (%d, %d)\n", location.getMaxValue(), location.getRow(), location.getColumn());
    }
}
