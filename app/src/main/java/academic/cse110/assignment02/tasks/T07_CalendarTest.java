package academic.cse110.assignment02.tasks;

import java.util.GregorianCalendar;

/**
 *
 * @author mrasadatik
 */
public class T07_CalendarTest {
    private static void displayCurrentDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        
        System.out.println("Current Date (elapsed time January 1, 1970 + " + currentDate.getTimeInMillis() + "millis):");
        System.out.println("Year: " + currentDate.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + currentDate.get(GregorianCalendar.MONTH) + 1);
        System.out.println("Day: " + currentDate.get(GregorianCalendar.DAY_OF_MONTH));
    }

    private static void setElapsedTimeAndDisplay(long elapsedTime) {
        GregorianCalendar specifiedDate = new GregorianCalendar();
        specifiedDate.setTimeInMillis(elapsedTime);
        
        System.out.println("Specified Date (elapsed time January 1, 1970 + " + elapsedTime + "millis):");
        System.out.println("Year: " + specifiedDate.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + specifiedDate.get(GregorianCalendar.MONTH) + 1);
        System.out.println("Day: " + specifiedDate.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
    public static void displayDate() {
        displayCurrentDate();
        System.out.println();
        setElapsedTimeAndDisplay(1234567898765L);
    }
}
