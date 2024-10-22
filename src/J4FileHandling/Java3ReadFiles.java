package J4FileHandling;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

import static J4FileHandling.FileProperties.*;
public class Java3ReadFiles {
    // To read a file in Java, you can use the FileReader class.
    // The FileReader class is used to read characters from a file.
    // Here is an example of how to read a file in Java:
    public static void main(String[] args) {
        Java3ReadFiles obj = new Java3ReadFiles();
        obj.ReadFileUsingFileReaderClass(FILE_NAME);
    }

    // Reader class
    // The Reader class is an abstract class for reading character streams.
    // The FileReader class is a subclass of the Reader class.
    // The Reader class has several
    // methods for reading data from a file.
    // For example:
    public void ReadFileUsingReaderClass(String fileName) {
        try {
            // Creates a Reader using FileReader
            Reader myReader = new FileReader(fileName);

            // Checks if reader is ready
            System.out.println("Is there data in the stream?  " + myReader.ready());

            // Reads the content of the file
            readUsingCharArray(myReader);
//            char[] array = new char[1025];
//            myReader.read(array);
//            System.out.println(array);

            // Closes the reader
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //InputStreamReader Class
    //The InputStreamReader class is a subclass of the Reader class.
    //The InputStreamReader class is used to read bytes from an input stream.
    //Here is an example of how to read a file using the InputStreamReader class:
    public void ReadFileUsingInputStreamReaderClass(String fileName) {
        try {
            // Creates a FileInputStream
            FileInputStream file = new FileInputStream(fileName);

            // // Creates an InputStreamReader with default encoding
            InputStreamReader input1 = new InputStreamReader(file);

            // Reads the content of the file
            readUsingCharArray(input1);

            // Creates an InputStreamReader specifying the encoding
            InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF-8"));

            // Returns the character encoding of the input stream
            System.out.println("Character encoding of input1: " + input1.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            // Closes the reader
            input1.close();
            input2.close();

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // FileReader Class
    // The FileReader class is a subclass of the InputStreamReader class.
    // The FileReader class is used to read characters from a file.
    // The FileReader class has several
    // methods for reading data from a file.
    // For example:
    public void ReadFileUsingFileReaderClass(String fileName) {
        // Creates an array of character
        try {
            // Creates a FileReader
            FileReader file = new FileReader(fileName);

            // Reads the content of the file
            readUsingIntStream(file);

//            int data = file.read();
//            while (data != -1) {
//                System.out.print((char) data);
//                data = file.read();
//            }

            // Closes the reader
            file.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // BufferedReader Class
    // The BufferedReader class is a subclass of the Reader class.
    // The BufferedReader class is used to read text from a character-input stream.
    // The BufferedReader class has several
    // methods for reading data from a file.
    // For example:
    public void ReadFileUsingBufferedReaderClass(String fileName) {
        try {
            // Creates a FileReader
            FileReader file = new FileReader(fileName);

            // Creates a BufferedReader using FileReader
            BufferedReader reader = new BufferedReader(file);

            //Skips the specified number of characters in the input stream
            reader.skip(5);

            // Reads the content of the file
            readUsingString(reader);

            // Closes the reader
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // StringReader Class
    // The StringReader class is a subclass of the Reader class.
    // The StringReader class is used to read characters from a string.
    // The StringReader class has several
    // methods for reading data from a file.
    // For example:
    public void ReadFileUsingStringReaderClass(String fileName) {
        try {
            // Creates a StringReader
            StringReader reader = new StringReader(fileName);

            // Reads the content of the file
            readUsingCharArray(reader);

            // Closes the reader
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    // Using Scanner class
    // The Scanner class is used to read input from various sources like strings, files, etc.
    // The Scanner class has several
    // methods for reading data from a file.
    // For example:
    public void ReadFileUsingScannerClass(String fileName) {
        try {
            // Creates File object
            File obj = new File(FILE_NAME);

            // Creates a Scanner using FileReader
            Scanner reader = new Scanner(obj);

            // Reads the content of the file
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            // Closes the reader
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // ReaderMethod 1
    public void readUsingIntStream(Reader reader) {
        try {
            // Reads the content of the file
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // ReaderMethod 2
    // The readLine() method reads a line of text.
    // The readLine() method returns null when the end of the file is reached.
    // This can be used By BufferedReader class only.
    public void readUsingString(BufferedReader reader) {
        try{
            // Reads the content of the file
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // ReaderMethod 3
    public void readUsingCharArray(Reader reader) {
        try {
            // Creates an array of character
            char[] array = new char[1025];

            // Reads the content of the file
            reader.read(array);

            // Prints the content of the file
            System.out.println("Data in the stream: ");
            System.out.println(array);

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
