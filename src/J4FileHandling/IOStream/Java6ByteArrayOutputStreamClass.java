package J4FileHandling.IOStream;

import java.io.ByteArrayOutputStream;

public class Java6ByteArrayOutputStreamClass {
    // The ByteArrayOutputStream class is a subclass of OutputStream that writes data to a byte array.
    // The ByteArrayOutputStream class is used for writing data to a byte array as a stream of bytes.
    public static void main(String[] args) {
        String data = "This is a line of text inside the string.!";
        try {
            // create a new byte array output stream
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] bytes = data.getBytes();

            // write byte to the output stream
            output.write(bytes);

            // Retrieves data from the output stream in string format
            String retrievedData = output.toString();
            System.out.println(retrievedData);

            // close the output stream
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // another example
        try {
            // create a new byte array output stream
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            output.write(data.getBytes());

            // get the byte array
            byte[] byteArray = output.toByteArray();
            for (int i = 0; i < byteArray.length; i++) {
                System.out.print((char)byteArray[i]);
            }
            // close the output stream
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
