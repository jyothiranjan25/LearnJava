package J3Classes.AbstractClasses;

public class SecondClass {
    public static void main(String[] args) {
        // Create an object of the FirstClass class
        FirstClass obj = new FirstClass();
        // Call the myMethod method
        obj.myMethod();
        // Print the name, age, and salary of the object
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Salary: " + obj.salary);
    }
}
