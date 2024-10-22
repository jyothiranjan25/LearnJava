package J2Methods;

public class Java6Recursion {
    public static void main(String[] args) {
        // Recursion
        // Recursion is the technique of making a function call itself.
        // This technique provides a way to break complicated problems down into simple problems which are easier to solve.
        // Recursion should be used when you have a problem that can be broken down into smaller, repetitive problems.
        // Recursion is a common mathematical and programming concept. It means that a function calls itself.
        // This has the benefit of meaning that you can loop through data to reach a result.
        // The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power.
        // However, when written correctly, recursion can be a very efficient and mathematically-elegant approach to programming.
        // In this example, the method returns the sum of all numbers from 1 to n, where n is the parameter:
        int result1 = sum(10);
        System.out.println(result1);
        int result2 = sum(1, 10);
        System.out.println(result2);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
        // The method calls itself with a reduced value of k each time.
        // The method calls itself for k = 10, 9, 8, 7, ... 1, and then returns the sum of all those calls.
        // The method is called with k = 10, which is greater than 0, so it calls itself with k = 9.
        // This process repeats until k = 0, so the final value returned is 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55.
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }


}
