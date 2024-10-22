package J4FileHandling.IOStream;

import java.io.ByteArrayInputStream;

public class Java5ByteArrayInputStreamClass {
    // The ByteArrayInputStream class is a subclass of InputStream that reads data from a byte array.
    // The ByteArrayInputStream class is used for reading data from a byte array as a stream of bytes.
    public static void main(String[] args) {
        // create a byte array
        byte[] data = {1, 2, 3, 4, 5};
        try {
            // create a new byte array input stream
            ByteArrayInputStream input = new ByteArrayInputStream(data);
            // read byte from the input stream
            for(int i = 0; i < data.length; i++) {
                int byteData = input.read();
                System.out.println(byteData + ", ");
            }
            // close the input stream
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
