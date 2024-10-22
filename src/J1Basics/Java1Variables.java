package J1Basics;

public class Java1Variables {
    public static void main(String[] args) {

        /*
        *Variables are containers for storing data values.
        *
        *In Java, there are different types of variables, for example:
        *
        *String - stores text, such as "Hello". String values are surrounded by double quotes
        *int - stores integers (whole numbers), without decimals, such as 123 or -123
        *float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        *char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        *boolean - stores values with two states: true or false
        * type variableName = value;
        */

        // Identifiers
        //All Java variables must be identified with unique names.
        //These unique names are called identifiers.
        //The general rules for naming variables are:
        //Names can contain letters, digits, underscores, and dollar signs
        //Names must begin with a letter
        //Names should start with a lowercase letter, and cannot contain whitespace
        //Names can also begin with $ and _ (but we will not use it in this tutorial)
        //Names are case-sensitive ("myVar" and "myvar" are different variables)
        //Reserved words (like Java keywords, such as int or boolean) cannot be used as names.
        int x = 5;
        float y = 3.14f;
        char z = 'a';
        boolean a = true;
        String b = "Text";


//        The println() method is often used to display variables.
        System.out.println("int = " + x);
        System.out.println("float = " + y);
        System.out.println("char = " + z);
        System.out.println("boolean = " + a);
        System.out.println("String = " + b);


    }
}
