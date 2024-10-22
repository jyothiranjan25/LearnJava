package J3Classes;

public class Java5Modifiers {
    // Java Modifiers
    // Modifiers are keywords that you add to those definitions to change their meanings.
    // Java Access Modifiers
    // For classes, you can use either public or default:
    // public: The class is accessible by any other class
    // default: The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
    // For attributes, methods, and constructors, you can use the one of the following:
    // public: The code is accessible for all classes
    // private: The code is only accessible within the declared class
    // default: The code is only accessible in the same package. This is used when you don't specify a modifier.
    // protected: The code is accessible in the same package and subclasses.
    // Note: The default modifier is accessible only within package. It cannot be accessed from outside the package.
    // If you don't use any modifier, it is considered default by default :)
    // The private keyword is an access modifier used for attributes, methods, and constructors, making them only accessible within the declared class.
    // The protected keyword is an access modifier used for attributes, methods, and constructors, making them accessible in the same package and subclasses.
    // The public keyword is an access modifier used for classes, attributes, methods, and constructors, making them accessible by any other class.
    // The default modifier is accessible only within the package. It cannot be accessed from outside the package.
    // If you do not specify any access modifier, it will be the default.

    // Java Non-Access Modifiers
    // For classes, you can use either final or abstract:
    // final: The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)
    // abstract: The class cannot be used to create objects (To access an abstract class, it must be inherited from another class)
    // For attributes and methods, you can use the one of the following:
    // final: Attributes and methods cannot be overridden/modified
    // static: Attributes and methods belong to the class, rather than an object
    // abstract: Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from)
    // transient: Attributes and methods are skipped when serializing the object containing them
    // synchronized: Methods can only be accessed by one thread at a time
    // volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"
    // strictfp: Restrict the precision and rounding of floating point calculations
    // The final keyword is a non-access modifier used for classes, attributes, and methods, which makes them non-changeable (immutable).
    // The abstract keyword is a non-access modifier, used for classes and methods:
    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    // The static keyword is used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.
    // The transient keyword is used to indicate that a field should not be serialized.
    // The synchronized keyword is used to specify critical sections or methods in multithreaded code.
    // The volatile keyword is used to indicate that a variable's value will be modified by different threads.
    // The strictfp keyword is used to restrict the precision and rounding of floating point calculations.

    // The final Keyword
    final int x = 10;
    final double PI = 3.14159;

    // The static Keyword
    static void myStaticMethod() {
        System.out.println("Hello from the Java5Modifiers static method");
    }

    // The public Keyword
    public void myPublicMethod() {
        System.out.println("Hello from the Java5Modifiers public method");
    }

    // The abstract Keyword
    //  abstract void myMethod();
    // Note: Abstract methods do not have a body, for example abstract void myMethod();.
    // The body is provided by the subclass:
    // class MyClass extends Java5Modifiers {
    //   void myMethod() {
    //     System.out.println("Some text...");
    //   }
    // }


    public static void main(String[] args) {
        // The final Keyword
        // The final keyword is a non-access modifier used for classes, attributes, and methods, which makes them non-changeable (immutable).
        // The final keyword is useful when you want a variable to always store the same value, like PI (3.14159).
        // The final keyword is called a "modifier".
        // Variables declared with the final keyword cannot be reassigned.
        Java5Modifiers myObj = new Java5Modifiers();
        // myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        // myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
        System.out.println(myObj.PI);

        // The static Keyword
        // The static keyword is used to create methods and attributes that can be used without creating an object of the class.
        // Static method example
        // The static keyword means that the method belongs to the class, not an object of the class.
        // Static methods can be called without creating objects of the class.
        // Static methods are often used to create utility classes, for example Math class methods, or methods that do not require an object to be created, such as main method.
        // To create a static method, you specify the static keyword in the method declaration.
        // A static method can access and change the value of static variables.
        // Static methods can be accessed without creating an object of the class.
        // Static methods cannot access non-static variables.
        // Static methods cannot use the this keyword.
        // Example:
        Java5Modifiers.myStaticMethod(); // Call the static method

        // The public Keyword
        // The public keyword is an access modifier used for classes, attributes, methods, and constructors, making them accessible by any other class.
        // Example:
        Java5Modifiers myObj2 = new Java5Modifiers();
        myObj2.myPublicMethod(); // Call the public method
    }
}
