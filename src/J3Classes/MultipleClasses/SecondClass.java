package J3Classes.MultipleClasses;

public class SecondClass {
    public static void main(String[] args) {
        FirstClass myObj = new FirstClass();

        // Accessing class attributes
        System.out.println("Name: " + myObj.name);
        System.out.println("Grade: " + myObj.grade);
        System.out.println("Java is fun: " + myObj.isJavaFun);
        System.out.println("Double: " + myObj.myDouble);
        System.out.println("Float: " + myObj.myFloat);
        System.out.println("Long: " + myObj.myLong);
        System.out.println("Int: " + myObj.myInt);
        System.out.println("Short: " + myObj.myShort);

        // Accessing class methods
        FirstClass.myStaticMethod(); // accessing static method
        myObj.myPublicMethod(); // accessing public method
    }
}
