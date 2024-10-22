package J4FileHandling.IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java8BufferedInputStreamClass {
    // The BufferedInputStream class in Java is used to read data from a file or stream.
    // The BufferedInputStream class reads data from an underlying input stream and stores it in an internal buffer.
    // The BufferedInputStream class provides buffering capabilities for input streams, which can improve performance when reading data from a file or network connection.
    // The BufferedInputStream class is a subclass of the FilterInputStream class, which provides filtering capabilities for input streams.
    // The BufferedInputStream class has several constructors for creating an instance of the class.
    // The BufferedInputStream class has several methods for reading data from the input stream, such as read(), read(byte[] b), and skip(long n).
    // The read() method reads a byte of data from the input stream and returns the byte as an integer in the range 0 to 255.
    // The read(byte[] b) method reads up to b.length bytes of data from the input stream into an array of bytes.
    // The skip(long n) method skips n bytes of data from the input stream.
    // The BufferedInputStream class is used for reading data from a source such as a file, network connection, or other input stream.
    // The BufferedInputStream class is an example of the Decorator design pattern, which allows behavior to be added to an object dynamically.
    // The following code reads data from a file using the BufferedInputStream class:
    // import java.io.BufferedInputStream;
    // import java.io.FileInputStream;
    // import java.io.IOException;
    // byte[] buffer = new byte[1024];
    public static void main(String[] args) {
        try {
            // Creates a FileInputStream
            FileInputStream input = new FileInputStream(FILE_NAME);
            // Creates a BufferedInputStream
            BufferedInputStream bufferedInput = new BufferedInputStream(input);

            // buffer available in BufferedInputStream
            System.out.println("Available bytes in the file: " + bufferedInput.available());

            // Reads the first byte from the input stream
            int data = bufferedInput.read();

            // Reads data into the buffer
            while (data != -1) {
                System.out.print((char) data);
                // Reads next byte from the file
                data = bufferedInput.read();
            }
            // closes the input stream
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
