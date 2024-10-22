package J3Classes;

import java.util.Vector;

public class Java17Vector {
    // The Vector class is a part of Java's collection framework.
    // It is similar to the ArrayList class, but it is synchronized.
    // The Vector class is a legacy
    public static void main(String[] args) {
        Vector<String> myVector = new Vector<String>();
        myVector.add("Apple");
        myVector.add("Banana");
        myVector.add("Cherry");
        myVector.add("Date");
        myVector.add("Elderberry");

        // Display the Vector
        System.out.println("Vector : " +myVector);

        // add element at specific index
        myVector.add(2, "Grapes");

        // addAll method
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("Kiwi");
        list.add("Lemon");
        myVector.addAll(list);

        // get element at specific index
        System.out.println("Element at index 0 : " +myVector.get(1));

        // set element at specific index
        myVector.set(1, "Mango");

        // remove elements from the Vector
        myVector.remove(1);

        // removeAll method
        myVector.removeAll(list);

        // size method
        System.out.println("Size of Vector : " +myVector.size());

        // toArray method
        Object[] array = myVector.toArray();

        // contains method
        System.out.println("Contains element : " +myVector.contains("Apple"));

        // Display the Vector with iterator
        System.out.println("Display the Vector with iterator");
        java.util.Iterator<String> iterator = myVector.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit : " +iterator.next());
        }

        System.out.println("\n");

        // Display the Vector with listIterator
        System.out.println("Display the Vector with listIterator");
        java.util.ListIterator<String> listIterator = myVector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Fruit : " +listIterator.next());
        }

        // clear method
        myVector.clear();
    }

}
