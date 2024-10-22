package J4FileHandling.IOStream;

import java.io.FileOutputStream;

import static J4FileHandling.IOStream.FileProperties.*;

public class Java4FileOutputStreamClass {
    // The FileOutputStream class is used to write data to a file.
    // The FileOutputStream class is a subclass of the OutputStream class.
    // The FileOutputStream class is used to write bytes to a file.
    // The FileOutputStream class is used to write data to a file in the form of bytes.
    public static void main(String[] args) {
        String s = "Hello, World! 123";
        try {
            // create a new file output stream
            FileOutputStream output = new FileOutputStream(FILE_NAME);
            // write data to the file
            byte[] data = s.getBytes();
            output.write(data);

            // close the file output stream
            output.flush();
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
