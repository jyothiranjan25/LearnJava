package J1Basics;

public class Java4Operators {
    public static void main(String[] args) {
//        Operators are used to perform operations on variables and values.

        int x = 5;
        int y = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("x + y = " + (x + y)); // Addition
        System.out.println("x - y = " + (x - y)); // Subtraction
        System.out.println("x * y = " + (x * y)); // Multiplication
        System.out.println("x / y = " + (x / y)); // Division
        System.out.println("x % y = " + (x % y)); // Modulus
        System.out.println("x++ = " + (x++)); // Increment
        System.out.println("x-- = " + (x--)); // Decrement
        System.out.println("++x = " + (++x)); // Pre Increment
        System.out.println("--x = " + (--x)); // Pre Decrement

        System.out.println("\n");

        // Assignment Operators
        System.out.println("Assignment Operators");
        x = 5;
        System.out.println("x = " + x);
        x += 3;
        System.out.println("x += 3 = " + x);
        x -= 3;
        System.out.println("x -= 3 = " + x);
        x *= 3;
        System.out.println("x *= 3 = " + x);
        x /= 3;
        System.out.println("x /= 3 = " + x);
        x %= 3;
        System.out.println("x %= 3 = " + x);

        System.out.println("\n");

        // Comparison Operators
        System.out.println("Comparison Operators");
        System.out.println("x == y = " + (x == y)); // Equal to
        System.out.println("x != y = " + (x != y)); // Not equal to
        System.out.println("x > y = " + (x > y)); // Greater than
        System.out.println("x < y = " + (x < y)); // Less than
        System.out.println("x >= y = " + (x >= y)); // Greater than or equal to
        System.out.println("x <= y = " + (x <= y)); // Less than or equal to

        System.out.println("\n");

        // Logical Operators
        System.out.println("Logical Operators");
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b)); // Logical AND
        System.out.println("a || b = " + (a || b)); // Logical OR
        System.out.println("!a = " + !a); // Logical NOT

        System.out.println("\n");

        // Bitwise Operators
        System.out.println("Bitwise Operators");

        int c = 5;
        int d = 3;
        System.out.println("c & d = " + (c & d)); // Bitwise AND
        System.out.println("c | d = " + (c | d)); // Bitwise OR
        System.out.println("c ^ d = " + (c ^ d)); // Bitwise XOR
        System.out.println("~c = " + ~c); // Bitwise Complement
        System.out.println("c << 1 = " + (c << 1)); // Left Shift
        System.out.println("c >> 1 = " + (c >> 1)); // Right Shift
        System.out.println("c >>> 1 = " + (c >>> 1)); // Zero fill right shift

        System.out.println("\n");

        // Ternary Operator
        System.out.println("Ternary Operator");
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        System.out.println("\n");

        // instanceof Operator
        System.out.println("instanceof Operator");
        String name = "James";
        boolean result2 = name instanceof String;
        System.out.println(result2);

        System.out.println("\n");

        // Java Operator Precedence
        System.out.println("Java Operator Precedence");

        int e = 5;
        int f = 3;
        int g = 4;
        System.out.println("e + f * g = " + (e + f * g));

    }
}
