package J4FileHandling.IOStream;

import java.io.*;

import static J4FileHandling.IOStream.FileProperties.*;

public class Java7ObjectInputStreamClass {
    // The ObjectInputStream class is a subclass of InputStream that reads objects from an input stream.
    // The ObjectInputStream class is used for reading objects from an input stream.
    // The ObjectInputStream class reads objects that have been previously written to an output stream using the ObjectOutputStream class.
    // The ObjectInputStream class is used for deserializing objects that have been serialized using the ObjectOutputStream class.
    // The ObjectInputStream class reads objects from an input stream in the same order that they were written to the output stream.
    public static void main(String[] args) {
        int data = 100;
        String dataString = "This is a line of text inside the string.!";
        try{
            // create a new object output stream
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);

            // write object to the output stream
            output.writeInt(data);
            output.writeObject(dataString);

            // create a new object input stream
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream input = new ObjectInputStream(fileInputStream);

            //Using the readInt() method
            System.out.println("Read data using readInt() method: " + input.readInt());
            // read object from the input stream
            System.out.println("Read object from the input stream: " + input.readObject());

            // close the output stream
            output.close();
            // close the input stream
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

        // another example with object
        try{
            // create a new object output stream
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);

            // write object to the output stream
            class1Object object = new class1Object("John", "New York");
            output.writeObject(object);

            // create a new object input stream
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream input = new ObjectInputStream(fileInputStream);

            // read object from the input stream
            class1Object object1 = (class1Object) input.readObject();
            System.out.println("Read object from the input stream: " + object1.name + ", " + object1.address);

            // close the output stream
            output.close();
            // close the input stream
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
class class1Object implements Serializable{
    String name;
    String address;

    public class1Object(String name, String address) {
        this.name = name;
        this.address = address;
    }
}