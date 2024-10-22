package J4FileHandling.IOStream;

public class FileProperties {
    final static String NAME = "Stream.txt";
    final static String FILE_CONTENT = "Hello World!";
    final static String currentPath = System.getProperty("user.dir"); // Current directory
    final static String FILE_NAME = currentPath + "/" + NAME;

}
