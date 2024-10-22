package J2Methods;

public class Java5Scope {

    public static void main(String[] args) {
        // Scope
        // In Java, variables are only accessible within the region they are created. This is called scope.
        // A variable's scope is the block of code for which it is valid. The scope of a variable is the part of the program where the variable can be used.

        // Local Variables
        // Variables declared inside a method are called local variables.
        // Local variables must be declared and initialized before they are used.
        // They will be destroyed once the method has completed.
        // Accessing local variables before they are initialized will result in a compilation error.

        // Example
        // Create a class named Java5Scope with a local variable x, and try to use it before it is declared:
        int x = 5;
        System.out.println(x);

        // If you try to access a local variable without declaring it, you will get an error:
        //        System.out.println(y);

    }
}
