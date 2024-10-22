package J1Basics;

public class Java9WhileLoops {
    public static void main(String[] args) {
        //Loops can execute a block of code as long as a specified condition is reached.
        //Loops are handy because they save time, reduce errors, and they make code more readable.

        /*
         Java While Loop
The while loop loops through a block of code as long as a specified condition is true:

while (condition) {
  // code block to be executed
}
         */
        System.out.println("Java While Loop");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("\n");

        /*
         Java do while Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

do {
    // code block to be executed
}
while (condition);
         */
        System.out.println("Java do while Loop");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
        System.out.println("\n");

    }
}
