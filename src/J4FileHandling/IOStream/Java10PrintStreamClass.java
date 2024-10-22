package J4FileHandling.IOStream;

import java.io.PrintStream;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java10PrintStreamClass {
    //The PrintStream class of the java.io package can be used to write output data in commonly readable form (text) instead of bytes
    //PrintStream is used to print formatted representations of objects to a text-output stream.
    //This class implements the Appendable interface and extends the OutputStream class.
    //PrintStream class is used to print standard data types such as int, long, string, etc. It is generally associated with System.out standard output stream.
    //It is used to print the formatted representation of objects to the text-output stream.
    //It is used to display the output on the console.
    public static void main(String[] args) {
        // Example 1
        String str = "Hello";
        System.out.print(str); // Hello

        //print() method with PrintStream class
        String data = "This is a text inside the file.";
        try {
            PrintStream printStream = new PrintStream(FILE_NAME);
            printStream.print(data);
            printStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Example 2

        // printf() method
        //The printf() method of PrintStream class in Java is used to write a formatted string to the output stream.
        //The formatted string is specified by the format string and arguments.
        //The format string is a string that contains plain text as well as format specifiers.
        //The format specifiers are used to specify the format in which the arguments are to be printed.
        //The printf() method returns this PrintStream object.
        //The syntax of the printf() method is given below:
        //public PrintStream printf(String format, Object... args)
        int a = 10;
        System.out.printf("I am %d years old", a); // I am 10 years old

        // PrintStream printf() method
        try {
            PrintStream printStream = new PrintStream(FILE_NAME);
            printStream.printf("I am %d years old", a);
            printStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
