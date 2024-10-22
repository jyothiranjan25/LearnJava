package J3Classes.MultipleClasses;

public class FirstClass {
    // class attributes example
    String name = "John";
    char grade = 'A';
    boolean isJavaFun = true;
    double myDouble = 19.99d;
    float myFloat = 5.75f;
    long myLong = 15000000000L;
    int myInt = 100000;
    short myShort = 5000;

    // class method example
    // The static keyword means that the method belongs to the class, not an object of the class.
    static void myStaticMethod() {
        System.out.println("Hello from the FirstClass static method");
    }
    // The public keyword is an access modifier, meaning that the method is accessible from outside the class.
    public void myPublicMethod() {
        System.out.println("Hello from the FirstClass public method");
    }


}
