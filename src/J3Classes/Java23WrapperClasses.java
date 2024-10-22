package J3Classes;

public class Java23WrapperClasses {
    // Wrapper classes are used to convert primitive data types into objects
    // Wrapper classes are used to store primitive data types in an object
    // Wrapper classes provide a way to use primitive data types as objects
    // Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects)
    // All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number
    public static void main(String[] args) {
        Byte byteValue = 127;
        Short shortValue = 32767;
        Integer intValue = 2147483647;
        Long longValue = 9223372036854775807L;
        Float floatValue = 3.4028235E38f;
        Double doubleValue = 1.7976931348623157E308;
        Character charValue = 'A';
        Boolean boolValue = true;

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);

        // Autoboxing: Automatic conversion of primitive data types to the object of their corresponding wrapper classes is known as autoboxing
        // Unboxing: Automatic conversion of wrapper class objects to the primitive data types is known as unboxing

        // Autoboxing
        Integer intObj = 10;
        System.out.println("Autoboxing: " + intObj);

        // Unboxing
        int intValue2 = intObj;
        System.out.println("Unboxing: " + intValue2);

        // Converting String to primitive data types
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Converting String to int: " + num);

        // Converting primitive data types to String
        int num2 = 123;
        String str2 = Integer.toString(num2);
        System.out.println("Converting int to String: " + str2);

        // Converting primitive data types to String using valueOf() method
        int num3 = 123;
        String str3 = String.valueOf(num3);
        System.out.println("Converting int to String using valueOf(): " + str3);

        // get values of the primitive data types
        System.out.println("Byte: " + byteValue.byteValue());
        System.out.println("Short: " + shortValue.shortValue());
        System.out.println("Integer: " + intValue.intValue());
        System.out.println("Long: " + longValue.longValue());
        System.out.println("Float: " + floatValue.floatValue());
        System.out.println("Double: " + doubleValue.doubleValue());
        System.out.println("Character: " + charValue.charValue());
        System.out.println("Boolean: " + boolValue.booleanValue());




    }
}
