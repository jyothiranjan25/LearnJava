package J1Basics;

public class Java5Strings {
    public static void main(String[] args) {
        //A String variable contains a collection of characters surrounded by double quotes:

        String greeting = "Hello";
        System.out.println(greeting);

        // String Length
        // The length of a String is the number of characters it contains:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // More String Methods
        // There are many string methods available, for example toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        //String Concatenation
        // The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // You can also use the concat() method to concatenate two strings:
        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        // Special Characters
        // Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
        // String txt3 = "We are the so-called "Vikings" from the north.";
        // To solve this problem, you can use the backslash escape character \":
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);

        // Other escape characters used in Java:
        // Code	Result	Description
        // \'	'	Single quote
        // \"	"	Double quote
        // \\	\	Backslash
        // \n	New Line
        // \r	Carriage Return
        // \t	Tab
        // \b	Backspace
        // \f	Form Feed


        // Text Blocks
        // Text blocks are multiple lines of text surrounded by three double quotes:
        String txt4 = """
        Hello
        World
        """;
        System.out.println(txt4);

        // Print the String in reverse order
        String txt5 = "Hello World";
        for (int i = txt5.length() - 1; i >= 0; i--) {
            System.out.print(txt5.charAt(i));
        }


    }
}
