package J4FileHandling;

import java.io.*;
import java.nio.charset.Charset;


import static J4FileHandling.FileProperties.*;

public class Java2CreateAndWriteToFiles {


    public static void main(String[] args) {
        // To create and write to a file in Java, you can use the FileWriter class.
        // The FileWriter class is used to write characters to a file.
        // Here is an example of how to create and write to a file in Java:
        Java2CreateAndWriteToFiles obj = new Java2CreateAndWriteToFiles();
    }


    public void createFile(String fileName) {
        File myObj = new File(fileName);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Writer class
    // The Writer class is an abstract class for writing to character streams.
    // The PrintWriter class is a subclass of the Writer class.
    // The Writer class has several
    // methods for writing data to a file.
    // For example:
    public void writeFileUsingWriterClass(String fileName, String content) {
        try {
            // Creates a Writer using FileWriter
            Writer myWriter = new FileWriter(fileName);

            // Writes the content to the file
            myWriter.write(content);

            // Closes the writer
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // OutputStreamWriter Class
    // The OutputStreamWriter class is a subclass of the Writer class.
    // The OutputStreamWriter class is used to write characters to an output stream.
    // The OutputStreamWriter class has several methods for writing data to a file.
    public void writeFileUsingOutputStreamWriterClass(String fileName, String content) {
        try {
            // Creates a FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            // Creates an OutputStreamWriter using the FileOutputStream
            OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(fileOutputStream);

            // Creates an output stream reader specifying the encoding
            //The getEncoding() method can be used to get the type of encoding that is used to write data to the output stream.
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream, Charset.forName("UTF8"));

            // Writes the content to the file
            outputStreamWriter1.write(content);
            outputStreamWriter2.write(content);

            // Closes the writer
            outputStreamWriter1.close();
            outputStreamWriter2.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // FileWriter Class
    // The FileWriter class has several methods for writing data to a file.
    // For example:
    public void writeFileUsingFileWriterClass(String fileName, String content) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // BufferedWriter Class
    // The BufferedWriter class is a subclass of the Writer class.
    // The BufferedWriter class is used to write characters to a buffered output stream.
    // The BufferedWriter class has several methods for writing data to a file.
    // For example:
    public void writeFileUsingBufferedWriterClass(String fileName, String content) {
        try {
            // Creates a file writer
            FileWriter fileWriter = new FileWriter(fileName);

            // Creates a buffered writer using the file writer
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Writes the content to the file
            bufferedWriter.write(content);

            // Flushes the writer
            // The flush() method is used to clear the internal buffer of the writer.
            // The flush() method does not close the writer.
            // The flush() method is used to forces the writer to write all data present in the buffer to the destination file.

            bufferedWriter.flush();

            // Closes the writer
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // StringWriter Class
    // The StringWriter class is a subclass of the Writer class.
    // The StringWriter class is used to write characters to a string buffer.
    // The StringWriter class has several
    // methods for writing data to a file.
    // For example:
    public void writeFileUsingStringWriterClass(String content) {
        try {
            // Creates a string writer
            StringWriter stringWriter = new StringWriter();

            // Writes the content to the file
            stringWriter.write(content);

            // prints the content
            System.out.println("Data in the StringWriter: " + stringWriter);

            // Returns the string buffer
            StringBuffer stringBuffer = stringWriter.getBuffer();
            System.out.println("Data in the StringBuffer: " + stringBuffer);

            // Returns the string buffer in string form
            String string = stringWriter.toString();
            System.out.println("Data in the String: " + string);

            // Flushes the writer
            stringWriter.flush();

            // Closes the writer
            stringWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
