package J4FileHandling.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java9BufferedOutputStreamClass {
    // The BufferedOutputStream class in Java is used to write data to a file or stream.
    // The BufferedOutputStream class writes data to an underlying output stream and stores it in an internal buffer.
    // The BufferedOutputStream class provides buffering capabilities for output streams, which can improve performance when writing data to a file or network connection.
    // The BufferedOutputStream class is a subclass of the FilterOutputStream class, which provides filtering capabilities for output streams.
    // The BufferedOutputStream class has several constructors for creating an instance of the class.
    // The BufferedOutputStream class has several methods for writing data to the output stream, such as write(int b), write(byte[] b), and flush().
    // The write(int b) method writes a byte of data to the output stream.
    // The write(byte[] b) method writes the bytes from the specified array to the output stream.
    // The flush() method flushes the output stream, writing any buffered data to the underlying output stream.
    // The BufferedOutputStream class is used for writing data to a destination such as a file, network connection, or other output stream.
    // The BufferedOutputStream class is an example of the Decorator design pattern, which allows behavior to be added to an object dynamically.
    // The following code writes data to a file using the BufferedOutputStream class:
    // import java.io.BufferedOutputStream;
    // import java.io.FileOutputStream;
    // import java.io.IOException;
    public static void main(String[] args) {
        String data = "Hello, World! 1234";
        try{
            // Creates a FileOutputStream
            FileOutputStream output = new FileOutputStream(FILE_NAME);
            // Creates a BufferedOutputStream
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);

            // Writes data to the output stream
            byte[] buffer = data.getBytes();
            bufferedOutput.write(buffer);

            // flushes the output stream
            bufferedOutput.flush();
            // closes the output stream
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
