/*

UML (Unified Modeling Language) Diagram for this program:
+-------------------------------------+
|              StopWatch              |
+-------------------------------------+
| - startTime: long                   |
| - endTime: long                     |
+-------------------------------------+
| + StopWatch()                       |
| + getStartTime(): long              |
| + getEndTime(): long                |
| + start()                           |
| + stop()                            |
| + getElapsedTime(): long            |
+-------------------------------------+

+-------------------------------------+
|            T08_StopWatch            |
+-------------------------------------+
| + selectionSort(int[] arr)          |
| + getExecutionTime()                |
+-------------------------------------+


*/

package academic.cse110.assignment02.tasks;

class StopWatch {
    private long startTime;
    private long endTime;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StopWatch() {
        start();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

/**
 *
 * @author mrasadatik
 */
public class T08_StopWatch {
    private static final int MAX_NUM_IN_A_ROW = 10;
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void getExecutionTime() {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Stopwatch stared...");
        
        System.out.println("Generating an array of 100000 random integers...");
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        System.out.println("Done.");
        
        System.out.println("Generated 100000 random integers are:");
        for (int i = 0; i < 25; i++) {
            System.out.print(numbers[i] + "\t");
            
            if ((i + 1) % MAX_NUM_IN_A_ROW == 0) {
                System.out.println();
            }
        }
        System.out.println("... ... ... ... ... ... ... ... ... ...");
        
        System.out.println("Starting selection sort...");
        selectionSort(numbers);
        System.out.println("Done.");
        
        System.out.println("Sorted generated 100000 random integers are:");
        for (int i = 0; i < 25; i++) {
            System.out.print(numbers[i] + "\t");
            
            if ((i + 1) % MAX_NUM_IN_A_ROW == 0) {
                System.out.println();
            }
        }
        System.out.println("... ... ... ... ... ... ... ... ... ...");
        
        stopWatch.stop();
        System.out.println("Stopwatch stopped.");
        
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime() + " milliseconds since " + stopWatch.getStartTime() + "milliseconds.");
    }

}
