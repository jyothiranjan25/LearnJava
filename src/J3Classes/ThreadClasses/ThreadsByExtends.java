package J3Classes.ThreadClasses;

public class ThreadsByExtends extends Thread{
    // If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method
    // The start() method is used to start the thread.
    // The run() method is used to perform the task of the thread.
    // The sleep() method is used to pause the thread for a specified time.
    // The join() method is used to pause the thread until the specified thread is dead.
    // The yield() method is used to pause the currently executing thread temporarily for giving a chance to the remaining waiting threads of the same priority.
    // The stop() method is used to stop the thread.
    // The isAlive() method is used to check whether the thread is alive or not.
    public static void main(String[] args) {
        ThreadsByExtends thread = new ThreadsByExtends();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}
