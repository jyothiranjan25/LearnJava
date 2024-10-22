package J3Classes;

abstract class Abstraction {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

public class Java11Abstraction extends Abstraction {
    // Data abstraction is the process of hiding certain details and showing only essential information to the user.
    // Abstraction can be achieved with either abstract classes or interfaces.
    // An abstract class is a class that is declared abstract—it may or may not include abstract methods.
    // Abstract classes cannot be instantiated, but they can be subclassed.
    // An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon).
    // Subclasses of an abstract class must provide implementations for all abstract methods.
    // An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
    // Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
    // Method bodies exist only for default methods and static methods.
    // Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.
    // An interface can extend multiple interfaces.
    // An interface cannot extend a class.
    // An interface can extend multiple interfaces.


    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: bow wow");
    }

    public static void main(String[] args) {
        Java11Abstraction myDog = new Java11Abstraction(); // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
    }


}
