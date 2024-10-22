package J3Classes;

import java.util.Arrays;
import java.util.List;

public class Java27LambdaExpressions {
    // Lambda expressions are a new and important feature included in Java 8.
    // They provide a clear and concise way to represent one method interface using an expression.
    // Lambda expressions also improve the Collection libraries making it easier to iterate through, filter, and extract data from a Collection.
    // In addition, new concurrency features improve performance in multicore environments.
    public static void main(String[] args) {
        // The following is an example of a lambda expression that adds two numbers.
        // The lambda expression is (a, b) -> a + b
        // The lambda expression is a function that adds two numbers.
        // parameter -> expression body

        // Body of lambda
        //        () -> {
        ////Body of no parameter lambda
        //        }

        // Body of One Parameter Syntax
        //        (a) -> {
        ////Body of one parameter lambda
        //        }

        // Body of Two Parameters Syntax
        //        (a, b) -> {
        ////Body of two parameter lambda
        //        }

        // Example 1
        // Lambda expression to add two numbers
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + addition.operation(10, 5));

        // Example 2
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Convert int array to IntStream and use forEach to print each number
        Arrays.stream(numbers).forEach(n -> System.out.println(n));

        // Example 3
        // Create a List of Strings
        List<String> names = Arrays.asList("John", "Doe", "Jane", "Doe");
        names.forEach((str) -> System.out.println(str));

        // Example 4
        // functional interface
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.sayMessage("John");
    }
}

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}

