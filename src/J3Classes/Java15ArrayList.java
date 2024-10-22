package J3Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Java15ArrayList {
    // The ArrayList class is a resizable array, which can be found in the java.util package.
    // The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The ArrayList class has many useful methods.
    // The ArrayList class is a generic class, which means that you can specify the type of objects that it can store.
    // You can add elements to an ArrayList using the add() method.
    // You can access elements in an ArrayList by their index.
    // You can remove elements from an ArrayList using the remove() method.
    // You can remove all elements from an ArrayList using the clear() method.
    // You can find the number of elements in an ArrayList using the size() method.
    // You can sort an ArrayList using the sort() method.
    // You can copy elements from one ArrayList to another using the clone() method.
    // You can create a shallow copy of an ArrayList using the clone() method.
    // You can create a deep copy of an ArrayList using the clone() method.
    // You can check if an ArrayList is empty using the isEmpty() method.
    // You can check if an ArrayList contains a specific element using the contains() method.
    // You can convert an ArrayList to an array using the toArray() method.
    // You can convert an array to an ArrayList using the asList() method.
    // You can convert an ArrayList to a string using the toString() method.
    // You can iterate through an ArrayList using the for-each loop.
    // You can iterate through an ArrayList using the iterator() method.
    // You can iterate through an ArrayList using the listIterator() method.
    // You can iterate through an ArrayList using the forEach() method.
    // You can iterate through an ArrayList using the forEachRemaining() method.
    // You can iterate through an ArrayList using the stream() method.
    // You can iterate through an ArrayList using the parallelStream() method.

    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<String> myArrayList = new ArrayList<String>();

        // Add elements to the ArrayList
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");
        myArrayList.add("Date");
        myArrayList.add("Elderberry");

        // Display the ArrayList

        System.out.println("ArrayList : " +myArrayList);

        // Access elements in the ArrayList
        System.out.println("Element at index 0 : " +myArrayList.get(1));

        // Remove elements from the ArrayList
        myArrayList.remove(1);

        // Display the ArrayList with iterator
        // Iterator is an interface in collection framework that is used to iterate over a collection.
        // It is used to traverse a collection object elements one by one.
        System.out.println("Display the ArrayList with iterator");
        Iterator<String> iterator = myArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit : " +iterator.next());
        }

        System.out.println("\n");

        // Display the ArrayList with listIterator
        // ListIterator is an interface in collection framework that is used to iterate over a List.
        // It is used to traverse a List object elements one by one in forward and backward directions.
        System.out.println("Display the ArrayList with listIterator");
        ListIterator<String> listIterator = myArrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Fruit : " +listIterator.next());
        }

        System.out.println("\n");

        // Display the ArrayList with for-each loop
        System.out.println("Display the ArrayList with for-each loop");
        for (String fruit : myArrayList) {
            System.out.println("Fruit : " +fruit);
        }

        System.out.println("\n");

        // Display the ArrayList with forEach() method
        System.out.println("Display the ArrayList with forEach() method");
        myArrayList.forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the ArrayList with forEachRemaining() method
        System.out.println("Display the ArrayList with forEachRemaining() method");
        iterator = myArrayList.iterator();
        iterator.forEachRemaining((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the ArrayList with stream() method
        System.out.println("Display the ArrayList with stream() method");
        myArrayList.stream().forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the ArrayList with parallelStream() method
        System.out.println("Display the ArrayList with parallelStream() method");
        myArrayList.parallelStream().forEach((fruit) -> {
            System.out.println("Fruit : " +fruit);
        });

        System.out.println("\n");

        // Display the ArrayList with for loop
        System.out.println("Display the ArrayList with for loop");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Fruit : " +myArrayList.get(i));
        }

        System.out.println("\n");

        // ArrayList with different data types
        ArrayList<Object> myArrayList2 = new ArrayList<Object>();
        myArrayList2.add("Apple");
        myArrayList2.add(10);
        myArrayList2.add(10.5);
        myArrayList2.add(true);
        System.out.println("ArrayList with different data types : " +myArrayList2);

        // The following code demonstrates some of other methods:
        // The List class has several methods to manipulate the elements.
        // The add() method is used to add elements to the list.
        // The addAll() method is used to add all elements of a collection to the list.
        // The get() method is used to get the element at a specific index.
        // The set() method is used to set the element at a specific index.
        // The remove() method is used to remove the element at a specific index.
        // The removeAll() method is used to remove all elements of a collection from the list.
        // The clear() method is used to remove all elements from the list.
        // The size() method is used to get the number of elements in the list.
        // The toArray() method is used to convert the list to an array.
        // The contains() method is used to check if the list contains a specific element.
        // The indexOf() method is used to get the index of a specific element.
        // The lastIndexOf() method is used to get the last index of a specific element.
        // The isEmpty() method is used to check if the list is empty.
        // The sort() method is used to sort the elements of the list.
        // The reverse() method is used to reverse the elements of the list.
        // The shuffle() method is used to shuffle the elements of the list.
        // The swap() method is used to swap the elements at two specific indexes.
        // The fill() method is used to fill the list with a specific element.
        // The copy() method is used to copy the elements of one list to another.
        // The frequency() method is used to get the frequency of a specific element in the list.
        // The disjoint() method is used to check if two lists have any common elements.
        // The min() method is used to get the minimum element of the list.
        // The max() method is used to get the maximum element of the list.
        // The replaceAll() method is used to replace all occurrences of a specific element with another element.
        // The retainAll() method is used to retain only the elements that are present in a specific collection.
        // The removeIf() method is used to remove elements based on a specific condition.
        // The forEach() method is used to perform an action on each element of the list.
        // The forEachRemaining() method is used to perform an action on each remaining element of the list.
        // The iterator() method is used to get an iterator over the elements of the list.
        // The listIterator() method is used to get a list iterator over the elements of the list.
        // The subList() method is used to get a sublist of the list.
        // The spliterator() method is used to get a spliterator over the elements of the list.
        // The stream() method is used to get a stream over the elements of the list.
        // The parallelStream() method is used to get a parallel stream over the elements of the list.



    }
}
