package J2Methods;

public class Java4MethodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        // With method overloading, multiple methods can have the same name with different parameters:
        // You can have multiple methods with the same name as long as the number and/or type of parameters are different.
        // Two methods with the same name and the same parameter types cannot be overloaded.
        // The following example would not work and would cause a compilation error:
        // static int plusMethod(int x, int y) {
        //     return x + y;
        // }
        // static int plusMethod(int x, int y) {
        //     return x + y;
        // }
        // The following example has two methods that add numbers of different types:
        int myInt = plusMethod(8, 5);
        double myDouble = plusMethod(4.3, 6.26);
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDouble);
    }
}
