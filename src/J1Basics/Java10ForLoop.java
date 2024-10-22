package J1Basics;

public class Java10ForLoop {
    public static void main(String[] args) {
        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        // The for loop has the following syntax:
        // for (statement 1; statement 2; statement 3) {
        //   // code block to be executed
        // }
        // Statement 1 is executed (one time) before the execution of the code block.
        // Statement 2 defines the condition for executing the code block.
        // Statement 3 is executed (every time) after the code block has been executed.


        System.out.println("Java For Loop");
        System.out.println("\n");

        // The example below will print the numbers 0 to 4:
        System.out.println("For Loop Example 1");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("\n");

        // The example below will print the numbers 4 to 0:
        System.out.println("For Loop Example 2");
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("\n");

        // nested for loop
        // You can also use nested loops to loop through two-dimensional arrays or nested data structures.
        // The example below will print the numbers 0 to 2 for x and 0 to 2 for y:
        System.out.println("Nested For Loop");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println("\n");


        // for each loop
        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        // The example below will print the numbers 1 to 5:
        System.out.println("For Each Loop");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
