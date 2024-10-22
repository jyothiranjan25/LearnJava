package J3Classes.ThreadClasses;

public class SingleThreadedEX {
    public static void main(String[] args) {
        // Record start time
        long startTime = System.nanoTime();

        // Execute the for loop
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i);
        }

        // Record end time
        long endTime = System.nanoTime();

        // Calculate the duration
        long duration = endTime - startTime; // Duration in nanoseconds

        // duration in seconds
        double durationInSeconds = duration / 1_000_000_000.0;

        System.out.println("Execution time: " + durationInSeconds + " seconds");
    }
}
