package J4FileHandling;
import java.io.File;

import static J4FileHandling.FileProperties.*;
public class Java4DeleteFiles {
    // To delete a file in Java, you can use the File class.
    // The File class is used to create or delete files and directories.
    // Here is an example of how to delete a file in Java:
    public static void main(String[] args) {
        try {
            File obj = new File(FILE_NAME);
            if (obj.delete()) {
                System.out.println("Deleted the file: " + obj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
