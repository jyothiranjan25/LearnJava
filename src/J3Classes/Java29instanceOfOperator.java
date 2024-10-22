package J3Classes;

public class Java29instanceOfOperator {
    // The instanceof operator in Java is used to test if an object is of a specified type.
    // The instanceof in java is also known as type comparison operator because it compares the instance with type.
    // It returns either true or false. If we apply the instanceof operator with any variable that has null value, it returns false.
    public static void main(String[] args) {
        // create a variable of type String
        String name = "John";

        // create a variable of type Integer
        int age = 18;

        // convert age to Integer
        Integer ageInteger = age;

        // check if name is an instance of String
        boolean result1 = name instanceof String;
        System.out.println(result1); // true

        // check if age is an instance of Integer
        boolean result2 = ageInteger instanceof Integer;
        System.out.println(result2); // true
    }
}
