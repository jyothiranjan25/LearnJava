package J3Classes;

public class Java4Constructors {
    // Constructors
    // A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created.
    // It can be used to set initial values for object attributes:
    int x; // Create a class attribute
    String name; // Create a class attribute

    // Create a class constructor
    public Java4Constructors() {
        x = 5; // Set the initial value for the class attribute x
    }

    public Java4Constructors(int y) {
        x = y; // Set the initial value for the class attribute x
    }

    public Java4Constructors(String name, int y) {
        x = y; // Set the initial value for the class attribute x
        this.name = name; // Set the initial value for the class attribute name
    }

    public static void main(String[] args) {
        Java4Constructors myObj = new Java4Constructors(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x

        Java4Constructors myObj2 = new Java4Constructors(10); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj2.x); // Print the value of x

        Java4Constructors myObj3 = new Java4Constructors("John", 15); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj3.x + " " +  myObj3.name); // Print the value of x
    }
    // Note: The constructor has the same name as the class, it is always public, and it does not have a return type.
    // If you do not create a constructor for your class, Java will automatically create one.
    // However, Java will not create a constructor if you create any other constructor.
    // There can be multiple constructors in a class.
    // They can be overloaded, meaning they have the same name but different parameters.
    // If you want to create a constructor with parameters, you need to create a parameterized constructor:
}
