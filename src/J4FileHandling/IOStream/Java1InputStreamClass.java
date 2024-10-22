package J4FileHandling.IOStream;

import java.io.FileInputStream;
import java.io.InputStream;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java1InputStreamClass {
    public static void main(String[] args) {
        // The InputStream class is the abstract superclass of all classes representing an input stream of bytes.
        // Applications that need to define a subclass of InputStream must provide an implementation for the method read().
        // The read() method reads a byte of data from the input stream and returns the byte as an integer in the range 0 to 255.
        // If no byte is available because the end of the stream has been reached, the read() method returns -1.
        // The read() method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
        // The InputStream class has several methods for reading bytes from the input stream, such as read(byte[] b), read(byte[] b, int off, int len), and skip(long n).
        // The read(byte[] b) method reads up to b.length bytes of data from the input stream into an array of bytes.
        // The read(byte[] b, int off, int len) method reads up to len bytes of data from the input stream into an array of bytes starting at the specified offset off.
        // The skip(long n) method skips n bytes of data from the input stream.
        // The InputStream class is used for reading data from a source such as a file, network connection, or other input stream.
        // The InputStream class is an abstract class, so it cannot be instantiated directly.
        // Instead, you can create an instance of one of its subclasses, such as FileInputStream, ByteArrayInputStream, or FilterInputStream.
        // The FileInputStream class reads data from a file, the ByteArrayInputStream class reads data from an array of bytes, and the FilterInputStream class provides filtering capabilities for input streams.
        // The following code reads data from a file using the FileInputStream class:
        // import java.io.FileInputStream;
        // import java.io.IOException;
        byte[] buffer = new byte[1024];
        try {
            // input stream
            InputStream input = new FileInputStream(FILE_NAME);
            System.out.println("Available bytes in the file: " + input.available());
            // read byte from the input stream
            input.read(buffer);
            // convert byte to string
            String data = new String(buffer);
            System.out.println("Data read from the file: " + data);
            // close the input stream
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
