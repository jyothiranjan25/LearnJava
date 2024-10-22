package J4FileHandling.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static J4FileHandling.IOStream.FileProperties.FILE_NAME;

public class Java3FileInputStreamClass {
    // The FileInputStream class is a subclass of InputStream that reads data from a file.
    // The FileInputStream class is used for reading data from a file as a stream of bytes.
    public static void main(String[] args) {
        try{
            // input stream
            FileInputStream input = new FileInputStream(FILE_NAME);

            //Skip n bytes of data from the input stream
//            input.skip(5);

            // read byte from input stream
            int data = input.read();
            // read byte by byte until end of file
            while(data != -1) {
                System.out.print((char) data);
                // read next byte
                data = input.read();
            }
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
