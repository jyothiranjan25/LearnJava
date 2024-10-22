package J4FileHandling.IOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java2OutputStreamClass {
    // The OutputStream class is the abstract superclass of all classes representing an output stream of bytes.
    // Applications that need to define a subclass of OutputStream must provide an implementation for the method write(int b).
    // The write(int b) method writes a byte of data to the output stream.
    // The write(byte[] b) method writes b.length bytes of data from the specified byte array to the output stream.
    // The write(byte[] b, int off, int len) method writes up to len bytes of data from the specified byte array starting at the specified offset off.
    // The flush() method flushes the output stream, ensuring that any buffered data is written to the underlying output stream.
    // The close() method closes the output stream, releasing any system resources associated with the stream.
    // The OutputStream class is used for writing data to a destination such as a file, network connection, or other output stream.
    // The OutputStream class is an abstract class, so it cannot be instantiated directly.
    // Instead, you can create an instance of one of its subclasses, such as FileOutputStream, ByteArrayOutputStream, or FilterOutputStream.
    // The FileOutputStream class writes data to a file, the ByteArrayOutputStream class writes data to an array of bytes, and the FilterOutputStream class provides filtering capabilities for output streams.
    // The following code writes data to a file using the FileOutputStream class:
    // import java.io.FileOutputStream;
    // import java.io.IOException;
    public static void main(String[] args) {
        String data = "Hello, World!";
        try{
            // output stream
            OutputStream output = new FileOutputStream(FILE_NAME);
            // convert string to byte array
            byte[] bytes = data.getBytes();
            // write byte array to output stream
            output.write(bytes);
            // flush the output stream
            output.flush();
            // close the output stream
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
