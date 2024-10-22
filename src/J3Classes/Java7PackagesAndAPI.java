package J3Classes; // This is the package declaration
// import java.util.*; // This is the import of package java.util
import java.util.Scanner; // This is the import of class Scanner from package java.util

public class Java7PackagesAndAPI {
    //A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
    //Built-in Packages (packages from the Java API)
    //User-defined Packages (create your own packages)

    //Built-in Packages
    //The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment. The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/

    //User-defined Packages
    //To create your own package, you need to understand that Java uses a file system directory to store package, which is nothing more than a folder. Just like the folders on your computer, packages are used to store Java classes.
    //The package statement should be the first statement in the source file. There can be only one package statement in each source file, and it applies to all types in the file.
    //If a package statement is not used then the class, interfaces, enumerations, and annotation types will be placed in the default package, which has no name.
    //The package statement defines a namespace in which classes are stored.
    //To create a package, use the package keyword at the top of the file. The package statement should be the first statement in the source file.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
