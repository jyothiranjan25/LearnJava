package J1Basics;

public class Java7IfElse {
    public static void main(String[] args) {
        /*
         Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
         */

        int time = 20;
        // if statement
        if (time < 18) {
            System.out.println("Good day.");
        }

        // else statement
        else {
            System.out.println("Good evening.");
        }

        // else if statement
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Short Hand If...Else (Ternary Operator)
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
    }
}
