package J3Classes.InheritanceClasses;

public class SecondClass extends FirstClass {
    private final int secondVariable = 20;
    private final String secondString = "Sub class";

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.firstMethod(); // This is the first method of the FirstClass
        System.out.println("The first variable is: " + secondClass.firstVariable); // The first variable is: 10
        System.out.println("The second variable is: " + secondClass.secondVariable); // The second variable is: 20
        System.out.println("The first string is: " + secondClass.firstString); // The first string is: Parent class
        System.out.println("The second string is: " + secondClass.secondString); // The second string is: Child class
    }
}
