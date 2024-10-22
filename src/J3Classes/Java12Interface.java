package J3Classes;

interface Interface1{
    public void myMethod1(); // interface method (does not have a body)
    public void myMethod2(int a, int b); // interface method (does not have a body)
    static void myMethod5() {
        System.out.println("This is a static method of Interface1");
    }

}

interface Interface2{
    public void myMethod3(); // interface method (does not have a body)
    public void myMethod4(int a, int b); // interface method (does not have a body)

    // static method of interface
    // A static method belongs to the class rather than the object of a class.
    // A static method can access only static data. It cannot access non-static data (instance variables).
    static void myMethod6() {
        System.out.println("This is a static method of Interface2");
    }
}

public class Java12Interface implements Interface1, Interface2 {

    // An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
    // Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
    // Method bodies exist only for default methods and static methods.
    // Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.
    // An interface can extend multiple interfaces.
    // An interface cannot extend a class.
    // An interface can extend multiple interfaces.
    // An interface is a completely "abstract class" that is used to group related methods with empty bodies.
    // To access the interface methods, the interface must be "implemented" (kind of like inherited) by another class with the implements keyword (instead of extends).
    // The body of the interface method is provided by the "implement" class.
    // The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.
    // All methods in an interface are implicitly public and abstract.

    @Override
    public void myMethod1() {
        System.out.println("This is implemented abstract method 1 of Interface1");
    }

    @Override
    public void myMethod2(int a, int b) {
        System.out.println("This is implemented abstract method 2 of Interface1" + " " + a + " " + b);
    }

    @Override
    public void myMethod3() {
        System.out.println("This is implemented abstract method 3 of Interface2");
    }

    @Override
    public void myMethod4(int a, int b) {
        System.out.println("This is implemented abstract method 4 of Interface2" + " " + a + " " + b);
    }


    public static void main(String[] args) {
        Java12Interface myObj = new Java12Interface();
        myObj.myMethod1();
        myObj.myMethod2(10, 20);
        myObj.myMethod3();
        myObj.myMethod4(30, 40);
        Interface1.myMethod5();
        Interface2.myMethod6();
    }
}
