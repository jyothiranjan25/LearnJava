package J4FileHandling;

import java.io.File;
import static J4FileHandling.FileProperties.*;
public class Java1Files {
    // This is a class that will be used to demonstrate file handling in Java
    //File handling is an important part of any application.
    //Java has several methods for creating, reading, updating, and deleting files.
    public static void main(String[] args) {
        File myObj = new File(FILE_NAME);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
    // The File class has many useful methods for creating and getting information about files.
    // For example:
    // - myObj.createNewFile() - creates a new file
    // - myObj.delete() - deletes a file
    // - myObj.exists() - returns true if the file exists
    // - myObj.getName() - returns the name of the file
    // - myObj.getAbsolutePath() - returns the absolute path of the file
    // - myObj.length() - returns the size of the file in bytes
    // - myObj.canWrite() - returns true if the file is writable
    // - myObj.canRead() - returns true if the file is readable
    // - myObj.isDirectory() - returns true if the file is a directory
    // - myObj.list() - returns an array of the files in the directory
    // - myObj.mkdir() - creates a directory
    // - myObj.mkdirs() - creates a directory and any necessary parent directories
    // - myObj.renameTo(newName) - renames the file
    // - myObj.lastModified() - returns the time the file was last modified
    // - myObj.setReadOnly() - sets the file to read-only
    // - myObj.setWritable() - sets the file to writable
    // - myObj.setReadable() - sets the file to readable
    // - myObj.setExecutable() - sets the file to executable
    // - myObj.isHidden() - returns true if the file is hidden
    // - myObj.setLastModified(time) - sets the time the file was last modified
    // - myObj.toPath() - returns a Path object for the file
    // - myObj.toURI() - returns a URI object for the file
}
