package J2Methods;

public class Java3Return {
    static int myMethod(int x) {
        return 5 + x;
    }

    static int myMethod2(int x, int y) {
        return x + y;
    }

    static String myMethod3(String fname) {
        return fname;
    }

    public static void main(String[] args) {
        // You can also return a value from a method.
        // You can use a return statement to send a value back to the caller.
        // A return statement is used to finish the execution of the method, and "returns" the result.
        // The type of the return value must match the method's declared return type; you can't return an integer value from a method declared to return a boolean.
        // If the method is declared to return a value, then it must return a value, using the return keyword.
        // The following example has a method that returns an integer after adding 5 to the parameter:

        int x = myMethod(3);
        int y = myMethod2(6, 5);
        String z = myMethod3("Liam");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
