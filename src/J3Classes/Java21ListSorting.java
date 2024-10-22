package J3Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java21ListSorting {
    // for sorting lists alphabetically or numerically.
    // The List interface has a sort() method that takes a Comparator object as an argument.
    // The Comparator interface has a compare() method that compares two objects.
    // The compare() method returns a negative integer, zero, or a positive integer if the first object is less than, equal to, or greater than the second object.
    // The sort() method uses the compare() method to sort the list.

    // The following code sorts a list of strings alphabetically:
    // import java.util.ArrayList;
    // import java.util.Collections;
    // import java.util.List;

    public static void main(String[] args) {
         List<String> myString = new ArrayList<>();
            myString.add("John");
            myString.add("Alice");
            myString.add("Bob");
            myString.add("Charlie");
            Collections.sort(myString);
            System.out.println("Sorted List: String");
            System.out.println(myString);

            // sorting in reverse order
            Collections.sort(myString, Collections.reverseOrder());
            System.out.println("Sorted List: String in reverse order");
            System.out.println(myString);

            System.out.println("\n");

            List<Integer> myIntegers = new ArrayList<>();
            myIntegers.add(10);
            myIntegers.add(5);
            myIntegers.add(20);
            myIntegers.add(15);
            Collections.sort(myIntegers);
            System.out.println("Sorted List: Integers");
            System.out.println(myIntegers);
            // sorting in reverse order
            Collections.sort(myIntegers, Collections.reverseOrder());
            System.out.println("Sorted List: Integers in reverse order");
            System.out.println(myIntegers);

            // other methods
//             Collections.reverse(myIntegers); // reverse the order of the elements in the list
//             Collections.shuffle(myIntegers); // shuffle the elements in the list
//             Collections.swap(myIntegers, 0, 1); // swap the elements at the specified indexes
//             Collections.rotate(myIntegers, 1); // rotate the elements in the list by the specified distance
//             Collections.fill(myIntegers, 0); // fill the list with the specified value
//             Collections.replaceAll(myIntegers, 0, 1); // replace all occurrences of the specified value with another value
//             Collections.copy(myIntegers, myIntegers); // copy the elements from one list to another list
//             Collections.min(myIntegers); // get the minimum element in the list
//             Collections.max(myIntegers); // get the maximum element in the list
//             Collections.frequency(myIntegers, 0); // get the frequency of the specified element in the list
//             Collections.disjoint(myIntegers, myIntegers); // check if the two lists have any elements in common
//             Collections.sort(myIntegers, Collections.reverseOrder()); // sort the list in reverse order
    }
}
