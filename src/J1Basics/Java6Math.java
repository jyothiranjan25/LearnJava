package J1Basics;

public class Java6Math {
    public static void main(String[] args) {
        //he Java Math class has many methods that allows you to perform mathematical tasks on numbers.

        // Math.max(x, y) returns the largest of two numbers.
        int x = 10;
        int y = 20;
        System.out.println("Math.max(x, y) = " + Math.max(x, y));

        // Math.min(x, y) returns the smallest of two numbers.
        System.out.println("Math.min(x, y) = " + Math.min(x, y));

        // Math.pow(x, y) returns the value of x to the power of y.
        System.out.println("Math.pow(x, y) = " + Math.pow(x, y));

        // Math.sqrt(x) returns the square root of x.
        System.out.println("Math.sqrt(x) = " + Math.sqrt(x));

        // Math.abs(x) returns the absolute (positive) value of x.
        System.out.println("Math.abs(x) = " + Math.abs(x));

        // Math.random() returns a random number between 0.0 and 1.0.
        System.out.println("Math.random() = " + Math.random());

        // To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("Random number between 0 and 100: " + randomNum);

        // Other methods include:
        // Math.round(x) returns the value of x rounded to the nearest whole number.
        // Math.ceil(x) returns the value of x rounded up to its nearest whole number.
        // Math.floor(x) returns the value of x rounded down to its nearest whole number.
        // Math.sin(x) returns the sine of x (x is in radians).
        // Math.cos(x) returns the cosine of x (x is in radians).
        // Math.tan(x) returns the tangent of an angle.
        // Math.PI returns the value of PI.

        //Examples:
        //Prime Number Checker
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        //  Missing Number in Array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println("Missing number in array: " + sum);

        // Find the GCD of Two Numbers
        int num1 = 18, num2 = 48;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.println("GCD of two numbers: " + num1);

        // Write a program to print the nth Fibonacci number. Fibonacci sequence starts with 0, 1, and the next number is the sum of the previous two numbers.
        int n1 = 6;
        System.out.println("Fibonacci number at index " + n1 + ": " + fibonacci(n1));


    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

