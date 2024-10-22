package J3Classes;

import java.util.*;

public class Java20Sets {
    // A HashSet is a collection of items where every item is unique
    // A HashSet is created using the HashSet class
    // HashSet class implements the Set interface
    // HashSet does not maintain the order of the elements
    // If you want to maintain the order of the elements, use LinkedHashSet
    // If you want to sort the elements, use TreeSet
    // HashSet is the best-performing implementation; however, it makes no guarantees concerning the order of iteration
    // HashSet permits the null element
    // HashSet is non-synchronized
    // HashSet allows only one null value
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // To access an element in the HashSet, you can use the get() method
        // However, there is no get() method in the HashSet class
        // To access an element, you must use a loop
//        for (String i : cars) {
//            System.out.println(i);
//        }

        // To remove an element, use the remove() method
//        cars.remove("Volvo");

        // To get the number of items in the HashSet, use the size() method
        System.out.println(cars.size());

        // To remove all items, use the clear() method
//        cars.clear();

        // To check if an item exists in the HashSet, use the contains() method
        System.out.println(cars.contains("Volvo"));

        // To copy all the elements from one HashSet into another, use the addAll() method
        HashSet<String> cars2 = new HashSet<String>();
        cars2.add("Volvo1");
        cars2.add("BMW1");
        cars2.add("BMW");
        cars.addAll(cars2);
        System.out.println(cars);

        // To remove all the elements that are present in another HashSet, use the removeAll() method
//        cars.removeAll(cars2);
//        System.out.println(cars);

        // To remove all the elements that are not present in another HashSet, use the retainAll() method
        cars.retainAll(cars2);
        System.out.println(cars);

        // To convert a HashSet into an array, use the toArray() method
        String[] carsArray = new String[cars.size()];
        cars.toArray(carsArray);

        // To convert a HashSet into a List, use the ArrayList constructor
        // ArrayList<String> carsList = new ArrayList<String>(cars);
        // System.out.println(carsList);

        // To convert a HashSet into a TreeSet, use the TreeSet constructor
        // TreeSet<String> carsTreeSet = new TreeSet<String>(cars);
        // System.out.println(carsTreeSet);

        // To convert a HashSet into a LinkedList, use the LinkedList constructor
        // LinkedList<String> carsLinkedList = new LinkedList<String>(cars);
        // System.out.println(carsLinkedList);

        // To convert a HashSet into a HashMap, use the HashMap constructor
        HashMap<String, Integer> carsHashMap = new HashMap<String, Integer>();
        int i = 0;
        for (String car : cars) {
            carsHashMap.put(car, i);
            i++;
        }
        System.out.println(carsHashMap);

        // HashSet with different types
        HashSet<Object> differentTypes = new HashSet<Object>();
        differentTypes.add("String");
        differentTypes.add(1);
        differentTypes.add(1.0);
        differentTypes.add(true);
        differentTypes.add('c');
        System.out.println(differentTypes);
        
        // HashSet with Object type
        HashSet<JavaSetObject> objectTypes = new HashSet<JavaSetObject>();
        objectTypes.add(new JavaSetObject("John", 20, true, 19.99d));
        objectTypes.add(new JavaSetObject("John", 20, true, 19.99d));
        objectTypes.add(new JavaSetObject("Surya", 21, false, 19.98d));

        for (JavaSetObject object : objectTypes) {
            System.out.println("Name: " + object.name + ", Age: " + object.age);
        }

        // LinkedHashSet
        // LinkedHashSet maintains the order of the elements in which they are inserted
        // LinkedHashSet is slower than HashSet
        // LinkedHashSet is faster than TreeSet
        // LinkedHashSet is faster for searching than ArrayList
        // LinkedHashSet is faster for adding elements than HashSet
        // LinkedHashSet is faster for removing elements than HashSet
        // LinkedHashSet is faster for checking if an element is present than ArrayList
        // LinkedHashSet is faster for checking if an element is present than LinkedList
        // LinkedHashSet is faster for checking if an element is present than TreeSet
        // LinkedHashSet is faster for checking if an element is present than HashMap
        // LinkedHashSet is faster for checking if an element is present than TreeMap
        // LinkedHashSet is faster for checking if an element is present than LinkedHashMap
        // LinkedHashSet is faster for checking if an element is present than LinkedTreeMap
        // LinkedHashSet is faster for checking if an element is present than LinkedTreeSet
        // LinkedHashSet is faster for checking if an element is present than HashSet
        // LinkedHashSet is faster for checking if an element is present than TreeSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Volvo");
        linkedHashSet.add("BMW");
        linkedHashSet.add("Ford");
        linkedHashSet.add("BMW");
        linkedHashSet.add("Mazda");
        System.out.println(linkedHashSet);

        // TreeSet
        // TreeSet is a collection where elements are stored in a sorted and ascending order
        // TreeSet is implemented using a tree structure
        // TreeSet is slower than HashSet
        // TreeSet is faster than LinkedHashSet
        // TreeSet is faster for searching than ArrayList
        // TreeSet is faster for adding elements than HashSet
        // TreeSet is faster for removing elements than HashSet
        // TreeSet is faster for checking if an element is present than ArrayList
        // TreeSet is faster for checking if an element is present than LinkedList
        // TreeSet is faster for checking if an element is present than LinkedHashSet
        // TreeSet is faster for checking if an element is present than HashSet
        // TreeSet is faster for checking if an element is present than TreeSet
        // TreeSet is faster for checking if an element is present than HashMap
        // TreeSet is faster for checking if an element is present than TreeMap
        // TreeSet is faster for checking if an element is present than LinkedHashMap
        // TreeSet is faster for checking if an element is present than LinkedTreeMap
        // TreeSet is faster for checking if an element is present than LinkedTreeSet
        // TreeSet is faster for checking if an element is present than LinkedHashSet
        // TreeSet is faster for checking if an element is present than TreeSet
        // TreeSet is faster for checking if an element is present than HashSet
        // TreeSet is faster for checking if an element is present than LinkedList
        // TreeSet is faster for checking if an element is present than ArrayList
        // TreeSet is faster for removing elements than HashSet
        // TreeSet is faster for adding elements than HashSet
        // TreeSet is faster for searching than HashSet
        // TreeSet is slower than HashSet for searching
        // TreeSet is slower than HashSet for adding elements
        // TreeSet is slower than HashSet for removing elements
        // TreeSet is slower than HashSet for checking if an element is present
        // for object types, you need to implement the Comparable interface
        // for object types, you need to implement the compareTo() method
        // implement comparator for custom sorting
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Volvo");
        treeSet.add("BMW");
        treeSet.add("Ford");
        treeSet.add("BMW");
        treeSet.add("Mazda");
        System.out.println(treeSet);


        //LinkedTreeSet
        //LinkedTreeSet is a collection where elements are stored in a sorted and ascending order
        //LinkedTreeSet is implemented using a tree structure
        //LinkedTreeSet is slower than HashSet
        //LinkedTreeSet is faster than LinkedHashSet
        //LinkedTreeSet is faster for searching than ArrayList
        //LinkedTreeSet is faster for adding elements than HashSet
        //LinkedTreeSet is faster for removing elements than HashSet
        //LinkedTreeSet is faster for checking if an element is present than ArrayList
        //LinkedTreeSet is faster for checking if an element is present than LinkedList
        //LinkedTreeSet is faster for checking if an element is present than LinkedHashSet
        //LinkedTreeSet is faster for checking if an element is present than HashSet
        //LinkedTreeSet is faster for checking if an element is present than TreeSet
        //LinkedTreeSet is faster for checking if an element is present than HashMap
        //LinkedTreeSet is faster for checking if an element is present than TreeMap
        //LinkedTreeSet is faster for checking if an element is present than LinkedHashMap
        //LinkedTreeSet is faster for checking if an element is present than LinkedTreeMap
        //LinkedTreeSet is faster for checking if an element is present than LinkedTreeSet
        LinkedHashSet<String> linkedTreeSet = new LinkedHashSet<>();
        linkedTreeSet.add("Volvo");
        linkedTreeSet.add("BMW");
        linkedTreeSet.add("Ford");
        linkedTreeSet.add("BMW");
        linkedTreeSet.add("Mazda");
        System.out.println(linkedTreeSet);

        // TreeSet with Object type
        Comparator<JavaSetObject> comparator = new JavaSetObjectComparator();
        TreeSet<JavaSetObject> treeSetObject = new TreeSet<JavaSetObject>(comparator);
        treeSetObject.add(new JavaSetObject("John", 20, true, 19.99d));
        treeSetObject.add(new JavaSetObject("John", 20, true, 19.99d));
        treeSetObject.add(new JavaSetObject("Surya", 21, false, 19.98d));

        for (JavaSetObject object : treeSetObject) {
            System.out.println("Name: " + object.name + ", Age: " + object.age);
        }

        // TreeSet with Object type using Comparable
        TreeSet<JavaSetObject> treeSetObjectComparable = new TreeSet<JavaSetObject>();
        treeSetObjectComparable.add(new JavaSetObject("John", 20, true, 19.99d));
        treeSetObjectComparable.add(new JavaSetObject("John", 20, true, 19.99d));
        treeSetObjectComparable.add(new JavaSetObject("Surya", 21, false, 19.98d));

        for (JavaSetObject object : treeSetObjectComparable) {
            System.out.println("Name: " + object.name + ", Age: " + object.age);
        }

        // EnumSet is a specialized Set implementation for use with enum types
        // EnumSet is a high-performance set implementation, much faster than HashSet
        // EnumSet is a specialized Set implementation for use with enum types
        EnumSet<JavaSetEnum.JavaSetEnums> enumSet = EnumSet.allOf(JavaSetEnum.JavaSetEnums.class);
        for (JavaSetEnum.JavaSetEnums enumValue : enumSet) {
            System.out.println(enumValue);
        }
        // using of() method
        EnumSet<JavaSetEnum.JavaSetEnums> enumSetOf = EnumSet.of(JavaSetEnum.JavaSetEnums.JAVA);
        System.out.println("EnumSet1: " + enumSetOf);
        EnumSet<JavaSetEnum.JavaSetEnums> enumSetOf2 = EnumSet.of(JavaSetEnum.JavaSetEnums.JAVA, JavaSetEnum.JavaSetEnums.PYTHON);
        System.out.println("EnumSet2: " + enumSetOf2);
    }
}
class JavaSetObject implements Comparable<JavaSetObject> {
    String name;
    int age;
    boolean isJavaFun = true;
    double myDouble = 19.99d;

    public JavaSetObject(String name, int age, boolean isJavaFun, double myDouble) {
        this.name = name;
        this.age = age;
        this.isJavaFun = isJavaFun;
        this.myDouble = myDouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaSetObject that = (JavaSetObject) o;
        return age == that.age && isJavaFun == that.isJavaFun && Double.compare(myDouble, that.myDouble) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isJavaFun, myDouble);
    }

    @Override
    public int compareTo(JavaSetObject o) {
        return this.name.compareTo(o.name);
    }
}
class JavaSetObjectComparator implements Comparator<JavaSetObject> {
    @Override
    public int compare(JavaSetObject o1, JavaSetObject o2) {
        return o1.name.compareTo(o2.name);
    }
}
class JavaSetEnum{
enum JavaSetEnums {
    JAVA, PYTHON, JAVASCRIPT
}
}

