package J1Basics;

public class Java8Switch {
    public static void main(String[] args) {
        // Instead of writing many if..else statements, you can use the switch statement.
        // The switch statement is used to select one of many code blocks to be executed.
        // The switch expression is evaluated once.
        // The value of the expression is compared with the values of each case.
        // If there is a match, the associated block of code is executed.
        // The default keyword specifies some code to run if there is no case match.
        // The break keyword stops the execution of the block.
        // This will improve the performance of the application.

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
