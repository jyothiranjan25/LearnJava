package J3Classes.ThreadClasses;

public class MultiThreadedEX {
    public static void main(String[] args) throws InterruptedException {
        // Number of threads to use
        int numThreads = 4;
        // Create and start threads
        Thread[] threads = new Thread[numThreads];
        long startTime = System.nanoTime();

        for (int t = 0; t < numThreads; t++) {
            threads[t] = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1_000_000; i++) {
                        System.out.println(i);
                    }
                }
            });
            threads[t].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // Record end time
        long endTime = System.nanoTime();

        // Calculate the duration
        long duration = endTime - startTime; // Duration in nanoseconds

        // Convert duration to seconds
        double durationInSeconds = duration / 1_000_000_000.0;

        System.out.println("Execution time with " + numThreads + " threads: " + durationInSeconds + " seconds");
    }
}
