package J3Classes.ThreadClasses;

public class ConcurrencyProblems extends Thread {
    // This is a class that demonstrates the problems that can arise when multiple threads are accessing shared data.
    // The problems that can arise are:
    public static int sharedData = 0;

    public void run() {
        sharedData++;
    }

    public static void main(String[] args) {
        // This is the main method that will be executed when the program is run.
        // The main method creates a new instance of the ConcurrencyProblems class and starts the thread.
        // The main method then increments the sharedData variable and prints it to the console.
        // The main method then interrupts the thread to stop it from running.
        // The main method then exits.
        ConcurrencyProblems thread1 = new ConcurrencyProblems();
        thread1.start();
        try {
            System.out.println(sharedData);
            sharedData++;
            System.out.println(sharedData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            thread1.interrupt(); // This is to stop the thread if it is still running
        }
    }
}
