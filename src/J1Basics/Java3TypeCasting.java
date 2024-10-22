package J1Basics;

public class Java3TypeCasting {
    public static void main(String[] args) {
        /*
        *Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */

        // Widening Casting
        byte myByte = 100;
        short myShort = myByte;
        int myInt = myShort;
        long myLong = myInt;
        float myFloat = myLong;
        double myDouble = myFloat;

        System.out.println("Widening Casting");
        System.out.println("byte = " + myByte);
        System.out.println("short = " + myShort);
        System.out.println("int = " + myInt);
        System.out.println("long = " + myLong);
        System.out.println("float = " + myFloat);
        System.out.println("double = " + myDouble);

        System.out.println("\n");
        // Narrowing Casting
        double myDouble2 = 19.99d;
        float myFloat2 = (float) myDouble2;
        long myLong2 = (long) myFloat2;
        int myInt2 = (int) myLong2;
        short myShort2 = (short) myInt2;
        byte myByte2 = (byte) myShort2;

        System.out.println("Narrowing Casting");
        System.out.println("double = " + myDouble2);
        System.out.println("float = " + myFloat2);
        System.out.println("long = " + myLong2);
        System.out.println("int = " + myInt2);
        System.out.println("short = " + myShort2);
        System.out.println("byte = " + myByte2);


    }
}
