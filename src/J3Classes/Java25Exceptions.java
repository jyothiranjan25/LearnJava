package J3Classes;

import java.util.Scanner;

public class Java25Exceptions {
    // Exceptions in Java are objects
    // Exceptions are used to handle errors and other exceptional events in Java
    // Exceptions provide a way to transfer control from one part of a program to another
    // Exceptions in Java are divided into two categories:
    // 1. Checked Exceptions: Checked exceptions are checked at compile-time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword
    // 2. Unchecked Exceptions: Unchecked exceptions are not checked at compile-time, but they are checked at runtime. If an unchecked exception occurs in the code, the program will throw a runtime exception
    // The try statement allows you to define a block of code to be tested for errors while it is being executed
    // The catch statement allows you to define a block of code to be executed, if an error occurs in the try block
    // The finally statement lets you execute code, after try...catch, regardless of the result
    // The throw statement allows you to create a custom error

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            throw e;
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        // The throw statement allows you to create a custom error
//        checkAge(15);

        // try-with-resources
        // The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement
        // Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource
        // The following example reads the first line from a file. It uses an instance of BufferedReader to read data from the file. BufferedReader is a resource that must be closed after the program is finished with it

        // The try-with-resources statement
        try(Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
