package J3Classes;

public class Java13Enums {
    // Enums are a special "class" that represents a group of constants (unchangeable variables, like final variables).
    // You can use enums when you have values that you know aren't going to change, like month days, days, colors, etc.
    // Enums are used when you have a fixed set of constants.

    // Enums are used to create our own data types.
    // Enums are used when we know all possible values at compile time.
    // Enums are used when we have a fixed set of constants.

    // Enums can be declared outside or inside a class, but NOT in a method.
    // Enums are implicitly static and final.
    // Enums can have fields, constructors, and methods.
    // Enums can implement interfaces.
    // Enums can have abstract methods.
    // Enums can have main() method.
    // Enums can be defined as their own class or in a class.
    // Enums can be used in switch statements.
    // Enums can be iterated.

    enum myEnums{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // loop through all the values of an enum
    public static void loopThroughEnums() {
        for (myEnums day : myEnums.values()) {
            System.out.println("Day: " + day);
        }
    }

    public static void main(String[] args) {
        myEnums day = myEnums.MONDAY;
        System.out.println(day);

        // loop through all the values of an enum
        loopThroughEnums();
    }


}
