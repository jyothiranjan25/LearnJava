package J3Classes;

import java.util.HashSet;
import java.util.Iterator;

public class Java22Iterator {
    // An iterator is an object that can be used to loop through collections, like ArrayList and HashSet
    // It is called an "iterator" because "iterating" is the technical term for looping
    // The Iterator interface has methods for:
    // - hasNext() - returns true if there are more elements
    // - next() - returns the next element
    // - remove() - removes the current element
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // Print the rest of the items
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        // Remove an item
        while (it.hasNext()) {
            String i = it.next();
            System.out.println(i);
            if (i.equals("BMW")) {
                it.remove();
                System.out.println("Removed BMW");
            }
        }
        System.out.println(cars);
    }
}
