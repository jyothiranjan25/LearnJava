package J1Basics;

public class Java11BreakAndContinue {
    public static void main(String[] args) {
        //The break statement can also be used to jump out of a loop.
        //This example jumps out of the loop when i is equal to 4:
        System.out.println("Break Statement");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        //This example skips the value of 4:
        System.out.println("Continue Statement");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
