package J3Classes;

public class Java3ClassMethods {
    // Class Methods
    // You will often want to create a class where the methods can be called without having to create an object.
    // To create a class method, use

    // the static keyword:
    // Inside the class, create a method with the static keyword:
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
        // To call a static method, use the class name:
        // ClassName.methodName();
    }

    // static method with parameters
    static void myStaticMethodWithParameters(String fname) {
        System.out.println("name =" + fname);
    }


    // the public keyword:
    // Inside the class, create a method with the public keyword:
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // public method with parameters
    public void myPublicMethodWithParameters(String fname) {
        System.out.println("name =" + fname);
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        myStaticMethodWithParameters("Liam"); // Call the static method with parameters

        Java3ClassMethods myObj = new Java3ClassMethods(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method on the object
        myObj.myPublicMethodWithParameters("Jenny"); // Call the public method with parameters on the object
    }


}
