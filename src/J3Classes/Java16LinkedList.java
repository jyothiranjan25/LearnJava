package J3Classes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java16LinkedList {
    // The LinkedList class is a collection class that implements the List interface.
    // The LinkedList class uses a doubly linked list to store the elements.
    // The LinkedList class can contain
    // duplicate elements.
    // null elements.
    // The LinkedList class maintains the insertion order of the elements.
    // The LinkedList class is not synchronized.
    // The LinkedList class is not thread-safe.
    // The LinkedList class is faster than the ArrayList class for deletion and insertion operations.
    // The LinkedList class is slower than the ArrayList class for search operations.
    // The LinkedList class is slower than the ArrayList class for iteration operations.
    // The LinkedList class is slower than the ArrayList class for random access operations.
    // The LinkedList class is slower than the ArrayList class for accessing elements by index.
    // The LinkedList class is slower than the ArrayList class for accessing elements by value.

    //The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
    //The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
    //The LinkedList class has a few of its own methods as well.
    //The LinkedList class is a generic class, which means that you can specify the type of objects that it can store.

    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Apple");
        myLinkedList.add("Banana");
        myLinkedList.add("Cherry");
        myLinkedList.add("Date");
        myLinkedList.add("Elderberry");

        // Display the LinkedList
        System.out.println("LinkedList : " +myLinkedList);

        // Access elements in the LinkedList
        System.out.println("Element at index 0 : " +myLinkedList.get(1));

        // Remove elements from the LinkedList
        myLinkedList.remove(1);

        // Display the LinkedList with iterator
        System.out.println("Display the LinkedList with iterator");
        Iterator<String> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit : " +iterator.next());
        }

        System.out.println("\n");

        // Display the LinkedList with listIterator
        System.out.println("Display the LinkedList with listIterator");
        ListIterator<String> listIterator = myLinkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Fruit : " +listIterator.next());
        }

        System.out.println("\n");

        // Display the LinkedList with for-each loop
        System.out.println("Display the LinkedList with for-each loop");
        for (String fruit : myLinkedList) {
            System.out.println("Fruit : " +fruit);
        }

        System.out.println("\n");

        // Display the LinkedList with forEach() method
        System.out.println("Display the LinkedList with forEach() method");
        myLinkedList.forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the LinkedList with descendingIterator
        System.out.println("Display the LinkedList with descendingIterator");
        Iterator<String> descendingIterator = myLinkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("Fruit : " +descendingIterator.next());
        }

        System.out.println("\n");

        // Display the LinkedList with forEachRemaining() method
        System.out.println("Display the LinkedList with forEachRemaining() method");
        iterator = myLinkedList.iterator();
        iterator.forEachRemaining((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the LinkedList with stream() method
        System.out.println("Display the LinkedList with stream() method");
        myLinkedList.stream().forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the LinkedList with parallelStream() method
        System.out.println("Display the LinkedList with parallelStream() method");
        myLinkedList.parallelStream().forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the LinkedList with for loop
        System.out.println("Display the LinkedList with for loop");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("Fruit : " +myLinkedList.get(i));
        }

        System.out.println("\n");

        // LinkedList with different data types
        LinkedList<Object> myLinkedList2 = new LinkedList<Object>();
        myLinkedList2.add("Apple");
        myLinkedList2.add(10);
        myLinkedList2.add(10.5);
        myLinkedList2.add(true);
        System.out.println("LinkedList with different data types : " +myLinkedList2);
    }
}
