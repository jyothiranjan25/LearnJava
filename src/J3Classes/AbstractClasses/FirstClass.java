package J3Classes.AbstractClasses;

// FirstClass class extends AbstractClass
// This class is called by the main method in the AbstractClasses.java file
// This class is in the AbstractClasses package
// This class is a subclass of the AbstractClass class
// This class is a concrete class
public class FirstClass extends AbstractClass{
    // Abstract method implementation
    // This method is implemented in the FirstClass
    // This method is called by the main method in the AbstractClasses.java file
    @Override
    void myMethod() {
        System.out.println("This is implemented abstract method");
    }

    public String name = "FirstClass";
    public int age = 20;
    public double salary = 20000.58;
}
