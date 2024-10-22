package J3Classes;

public class Java26Threads extends Thread implements Runnable {
    // Threads are a way to run multiple tasks concurrently.
    // Threads are lightweight processes within a process.
    // Threads share the same memory space.
    // Threads are used to perform time-consuming tasks without blocking the main thread.
    // Threads are used to perform multiple tasks at the same time.
    // Threads are used to perform background tasks.
    // Threads are used to perform non-blocking I/O operations.
    // Threads are created by extending the Thread class.
    // Threads are created by implementing the Runnable interface.
    // Threads are created by using the Executor framework.
    // Threads are created by using the ForkJoin framework.
    // Threads are created by using the CompletableFuture class.
    public static void main(String[] args) {
            //There are two ways to create a thread.
            //1. By extending the Thread class.
            //2. By implementing the Runnable interface.
            //The Thread class provides constructors and methods to create and perform operations on a thread.
            //The Runnable interface provides a single method run() that is used to perform the task of the thread.
            //The Thread class provides a method start() to start the thread.
            //The Thread class provides a method run() to perform the task of the thread.
            //The Thread class provides a method sleep() to pause the thread for a specified time.
            //The Thread class provides a method join() to wait for the thread to finish.
            //The Thread class provides a method yield() to pause the thread and give a chance to other threads.
            //The Thread class provides a method interrupt() to interrupt the thread.
            //The Thread class provides a method isAlive() to check if the thread is alive.
            //The Thread class provides a method setName() to set the name of the thread.
            //The Thread class provides a method getName() to get the name of the thread.
            //The Thread class provides a method setPriority() to set the priority of the thread.
            //The Thread class provides a method getPriority() to get the priority of the thread.
            //The Thread class provides a method setDaemon() to set the thread as a daemon thread.
            //The Thread class provides a method isDaemon() to check if the thread is a daemon thread.
            //The Thread class provides a method setUncaughtExceptionHandler() to set the exception handler for the thread.
            //The Thread class provides a method getUncaughtExceptionHandler() to get the exception handler for the thread.
    }
    public void run() {
        System.out.println("Thread is running.");
    }
    public void start() {
        System.out.println("Thread is started.");
    }
    public void sleep() {
        System.out.println("Thread is sleeping.");
    }
}
