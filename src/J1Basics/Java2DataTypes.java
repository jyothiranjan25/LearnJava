package J1Basics;

public class Java2DataTypes {
    public static void main(String[] args) {
        /*
        *Data types are divided into two groups:
        *
        *Primitive data types - includes byte, short, int, long, float, double, boolean and char
        *Non-primitive data types - such as String, Arrays and Classes
        */

//        byte	    1 byte	Stores whole numbers from -128 to 127
//        short	    2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	    8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float     4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double    8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean   1 bit	Stores true or false values
//        char	    2 bytes	Stores a single character/letter or ASCII values

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

//        Primitive are two types:
//       1. Numeric
//       2. Non-numeric



/*      Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.
*/
        byte myByte = 100;
//        The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

        short myShort = 5000;
//        The short data type can store whole numbers from -32,768 to 32,767:

        int myInt = 100000;
//        The int data type can store whole numbers from -2,147,483,648 to 2,147,483,647:

        long myLong = 15000000000L;
//        The long data type can store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

        float myFloat = 5.75f;
//        The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f":

        double myDouble = 19.99d;
//        The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":

        boolean isJavaFun = true;
        boolean isFishTasty = false;
//        Boolean data types are used to store two values: true or false.

        char myGrade = 'B';
//        The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

        System.out.println("byte = "+ myByte);
        System.out.println("short = "+ myShort);
        System.out.println("int = "+ myInt);
        System.out.println("long = "+ myLong);
        System.out.println("float = "+ myFloat);
        System.out.println("double = "+ myDouble);
        System.out.println("boolean = "+ isJavaFun);
        System.out.println("boolean = "+ isFishTasty);
        System.out.println("char = "+ myGrade);
    }
}
