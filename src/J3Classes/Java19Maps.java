package J3Classes;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Java19Maps {
    public static void main(String[] args) {
        // The HashMap class is a part of Java's collection framework.
        // It stores elements in key-value pairs.
        // The HashMap class is similar to the Hashtable class, but it is unsynchronized.
        // It allows null values and the null key.
        // The HashMap class is not thread-safe.

        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("John", 25);
        myHashMap.put("Alice", 30);
        myHashMap.put("Bob", 35);
        myHashMap.put("Charlie", 40);
        System.out.println("HashMap: ");
        System.out.println(myHashMap);
        System.out.println("Value for key 'Alice': " + myHashMap.get("Alice"));

        // Print using iterator
        Iterator<Map.Entry<String, Integer>> iterator = myHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        // The following code demonstrates some of these methods:
        myHashMap.put("David", 45);
        myHashMap.get("Bob");
        myHashMap.remove("Alice");
        System.out.println("contains key : " + myHashMap.containsKey("Charlie"));
        System.out.println("contains value : " + myHashMap.containsValue(40));
        System.out.println("Keys in HashMap: ");
        System.out.println(myHashMap.keySet());
        System.out.println("Values in HashMap: ");
        System.out.println(myHashMap.values());
        System.out.println("Key-Value pairs in HashMap: ");
        System.out.println(myHashMap.entrySet());

        // TeeMap is a sorted map that is based on the TreeMap class.
        // TreeMap is a part of Java's collection framework.
        // It stores elements in key-value pairs.
        // The TreeMap class is similar to the HashMap class, but it is sorted.
        // The TreeMap class is unsynchronized.
        // It allows null values and the null key.
        // The TreeMap class is not thread-safe.
        // The TreeMap class is slower than the HashMap class for insertion and deletion operations.
        // The TreeMap class is faster than the HashMap class for search operations.
        // The TreeMap class is faster than the HashMap class for iteration operations.
        // The TreeMap class is faster than the HashMap class for random access operations.
        // The TreeMap class is faster than the HashMap class for accessing elements by index.
        // The TreeMap class is faster than the HashMap class for accessing elements by value.
        // The TreeMap class is faster than the HashMap class for accessing elements by key.
        // The TreeMap class is faster than the HashMap class for accessing elements by key-value pair.
        // The TreeMap class is faster than the HashMap class for accessing elements by key-value pair in ascending order.
        // The TreeMap class is faster than the HashMap class for accessing elements by key-value pair in descending order.
        // The TreeMap class is faster than the HashMap class for accessing elements by key-value pair in natural order.
        // The TreeMap class is faster than the HashMap class for accessing elements by key-value pair in reverse order.

        // The following code demonstrates the TreeMap class:
        TreeMap<Integer,String> myTreeMap = new TreeMap<>();
        myTreeMap.put(1, "One");
        myTreeMap.put(2, "Two");
        myTreeMap.put(3, "Three");
        myTreeMap.put(4, "Four");
        System.out.println("TreeMap: ");
        System.out.println(myTreeMap);

        // iterate using For-Each
        for (Map.Entry<Integer, String> entry : myTreeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // The following code demonstrates some of these methods:
        System.out.println("Value for key 2: " + myTreeMap.get(2));
        myTreeMap.put(5, "Five");
        myTreeMap.get(4);
        myTreeMap.remove(3);
        System.out.println("contains key : " + myTreeMap.containsKey(4));
        System.out.println("contains value : " + myTreeMap.containsValue("Five"));
        System.out.println("Keys in TreeMap: ");
        System.out.println(myTreeMap.keySet());
        System.out.println("Values in TreeMap: ");
        System.out.println(myTreeMap.values());
        System.out.println("Key-Value pairs in TreeMap: ");
        System.out.println(myTreeMap.entrySet());

        // LinkedHashMap is a part of Java's collection framework.
        // It stores elements in key-value pairs.
        // The LinkedHashMap class is similar to the HashMap class, but it maintains the order of elements.
        // The LinkedHashMap class is unsynchronized.
        // It allows null values and the null key.
        // The LinkedHashMap class is not thread-safe.
        // The LinkedHashMap class is slower than the HashMap class for insertion and deletion operations.
        // The LinkedHashMap class is faster than the HashMap class for search operations.
        // The LinkedHashMap class is faster than the HashMap class for iteration operations.
        // The LinkedHashMap class is faster than the HashMap class for random access operations.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by index.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by value.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key-value pair.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key-value pair in insertion order.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key-value pair in access order.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key-value pair in natural order.
        // The LinkedHashMap class is faster than the HashMap class for accessing elements by key-value pair in reverse order.

        // The following code demonstrates the LinkedHashMap class:
        LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();
        myLinkedHashMap.put("John", 25);
        myLinkedHashMap.put("Alice", 30);
        myLinkedHashMap.put("Bob", 35);
        myLinkedHashMap.put("Charlie", 40);
        myLinkedHashMap.put("David",null);
        System.out.println("LinkedHashMap: ");
        System.out.println(myLinkedHashMap);


        //EnumMap is a specialized implementation of the Map interface for enum types.
        //It is a part of Java's collection framework.
        //It stores elements in key-value pairs.
        //The EnumMap class is similar to the HashMap class, but it is optimized for enum types.
        //The EnumMap class is unsynchronized.
        //It does not allow null values or the null key.
        //The EnumMap class is not thread-safe.
        //The EnumMap class is faster than the HashMap class for insertion and deletion operations.
        //The EnumMap class is faster than the HashMap class for search operations.
        //The EnumMap class is faster than the HashMap class for iteration operations.
        //The EnumMap class is faster than the HashMap class for random access operations.
        //The EnumMap class is faster than the HashMap class for accessing elements by index.
        //The EnumMap class is faster than the HashMap class for accessing elements by value.
        //The EnumMap class is faster than the HashMap class for accessing elements by key.
        //The EnumMap class is faster than the HashMap class for accessing elements by key-value pair.
        //The EnumMap class is faster than the HashMap class for accessing elements by key-value pair in natural order.

        //The following code demonstrates the EnumMap class:
        EnumMap<Day.days, String> myEnumMap = new EnumMap<>(Day.days.class);
        myEnumMap.put(Day.days.SUNDAY, "Sunday");
        myEnumMap.put(Day.days.MONDAY, "Monday");
        myEnumMap.put(Day.days.TUESDAY, "Tuesday");
        myEnumMap.put(Day.days.WEDNESDAY, "Wednesday");
        myEnumMap.put(Day.days.THURSDAY, "Thursday");
        myEnumMap.put(Day.days.FRIDAY, "Friday");
        myEnumMap.put(Day.days.SATURDAY, "Saturday");
        System.out.println("EnumMap: ");
        System.out.println(myEnumMap);


        //weakHashMap is a part of Java's collection framework.
        //It stores elements in key-value pairs.
        //The WeakHashMap class is similar to the HashMap class, but it uses weak references for keys.
        //The WeakHashMap class is unsynchronized.
        //It allows null values and the null key.
        //The WeakHashMap class is not thread-safe.
        //The WeakHashMap class is slower than the HashMap class for insertion and deletion operations.
        //The WeakHashMap class is faster than the HashMap class for search operations.
        //The WeakHashMap class is faster than the HashMap class for iteration operations.
        //The WeakHashMap class is faster than the HashMap class for random access operations.
        //The WeakHashMap class is faster than the HashMap class for accessing elements by index.
        //The WeakHashMap class is faster than the HashMap class for accessing elements by value.
        //The WeakHashMap class is faster than the HashMap class for accessing elements by key.
        //The following code demonstrates the WeakHashMap class:
        WeakHashMap<String, Integer> myWeakHashMap = new WeakHashMap<>();
        myWeakHashMap.put("John", 25);
        myWeakHashMap.put("Alice", 30);
        myWeakHashMap.put("Bob", 35);
        myWeakHashMap.put("Charlie", 40);
        System.out.println("WeakHashMap: ");
        System.out.println(myWeakHashMap);


        // SortedMap is an interface in Java's collection framework.
        // It extends the Map interface.
        // It stores elements in key-value pairs.
        // The SortedMap interface is implemented by the TreeMap class.
        // The SortedMap interface is similar to the Map interface, but it maintains the order of elements.
        // The SortedMap interface is unsynchronized.
        // It allows null values and the null key.
        // The SortedMap interface is not thread-safe.
        // The SortedMap interface is slower than the Map interface for insertion and deletion operations.
        // The SortedMap interface is faster than the Map interface for search operations.
        // The SortedMap interface is faster than the Map interface for iteration operations.
        // The SortedMap interface is faster than the Map interface for random access operations.
        // The SortedMap interface is faster than the Map interface for accessing elements by index.
        // The SortedMap interface is faster than the Map interface for accessing elements by value.
        // The SortedMap interface is faster than the Map interface for accessing elements by key.
        // The SortedMap interface is faster than the Map interface for accessing elements by key-value pair.
        // The SortedMap interface is faster than the Map interface for accessing elements by key-value pair in ascending order.
        // The SortedMap interface is faster than the Map interface for accessing elements by key-value pair in descending order.
        // The SortedMap interface is faster than the Map interface for accessing elements by key-value pair in natural order.
        // The SortedMap interface is faster than the Map interface for accessing elements by key-value pair in reverse order.

        // The following code demonstrates the SortedMap interface:
        SortedMap<Integer, String> mySortedMap = new TreeMap<>();
        mySortedMap.put(2, "Two");
        mySortedMap.put(4, "Four");
        mySortedMap.put(3, "Three");
        mySortedMap.put(1, "One");
        System.out.println("SortedMap: ");
        System.out.println(mySortedMap);

        // The NavigableMap interface is an extension of the SortedMap interface.
        // It is a part of Java's collection framework.
        // It stores elements in key-value pairs.
        // The NavigableMap interface is implemented by the TreeMap class.
        // The NavigableMap interface is similar to the SortedMap interface, but it provides navigation methods.

        // The following code demonstrates the NavigableMap interface:
        NavigableMap<Integer, String> myNavigableMap = new TreeMap<>();
        myNavigableMap.put(2, "Two");
        myNavigableMap.put(4, "Four");
        myNavigableMap.put(3, "Three");
        myNavigableMap.put(1, "One");
        System.out.println("NavigableMap: ");
        System.out.println(myNavigableMap);

        // The ConcurrentMap interface is a part of Java's collection framework.
        // It extends the Map interface.
        // It stores elements in key-value pairs.
        // The ConcurrentMap interface is implemented by the ConcurrentHashMap class.
        // The ConcurrentMap interface is similar to the Map interface, but it provides concurrency support.
        // The ConcurrentMap interface is synchronized.
        // It allows null values and the null key.
        // The ConcurrentMap interface is thread-safe.
        // The ConcurrentMap interface is slower than the Map interface for insertion and deletion operations.
        // The ConcurrentMap interface is faster than the Map interface for search operations.
        // The ConcurrentMap interface is faster than the Map interface for iteration operations.
        // The ConcurrentMap interface is faster than the Map interface for random access operations.
        // The ConcurrentMap interface is faster than the Map interface for accessing elements by index.
        // The ConcurrentMap interface is faster than the Map interface for accessing elements by value.
        // The ConcurrentMap interface is faster than the Map interface for accessing elements by key.
        // The ConcurrentMap interface is faster than the Map interface for accessing elements by key-value pair.

        // Methods of ConcurrentMap
        // compute(Key, BiFunction) - Computes a new value for the specified key and its current mapped value.
        // computeIfAbsent(Key, Function) - Computes a new value for the specified key if it is not already present.
        // computeIfPresent(Key, BiFunction) - Computes a new value for the specified key if it is already present.
        // forEach(BiConsumer) - Performs the given action for each key-value pair in the map.
        // merge(Key, Value, BiFunction) - Merges the specified key and value using the given function.

        // The following code demonstrates the ConcurrentMap interface:
        ConcurrentMap<String, Integer> myConcurrentMap = new ConcurrentHashMap<>();
        myConcurrentMap.put("John", 25);
        myConcurrentMap.put("Alice", 30);
        myConcurrentMap.put("Bob", 35);
        myConcurrentMap.put("Charlie", 40);
        System.out.println("ConcurrentMap: ");
        System.out.println(myConcurrentMap);
        // compute(Key, BiFunction) - Computes a new value for the specified key and its current mapped value.
        myConcurrentMap.compute("John", (key, value) -> value + 5);
        System.out.println("ConcurrentMap after compute: ");
        System.out.println(myConcurrentMap);
        // computeIfAbsent(Key, Function) - Computes a new value for the specified key if it is not already present.
        myConcurrentMap.computeIfAbsent("David", key -> 45);
        System.out.println("ConcurrentMap after computeIfAbsent: ");
        System.out.println(myConcurrentMap);
        // computeIfPresent(Key, BiFunction) - Computes a new value for the specified key if it is already present.
        myConcurrentMap.computeIfPresent("Alice", (key, value) -> value + 5);
        System.out.println("ConcurrentMap after computeIfPresent: ");
        System.out.println(myConcurrentMap);
        // forEach(BiConsumer) - Performs the given action for each key-value pair in the map.
        myConcurrentMap.forEach((key, value) -> System.out.println(key + " : " + value));
        // merge(Key, Value, BiFunction) - Merges the specified key and value using the given function.
        myConcurrentMap.merge("Bob", 35, (value, newValue) -> value + newValue);
        System.out.println("ConcurrentMap after merge: ");
        System.out.println(myConcurrentMap);


        // The following code demonstrates some of other methods:
        // The Map class has several methods to manipulate the elements.
        // The put(Key, Value) method adds an element to the Map.
        // The putAll() method adds all elements from another Map to the Map.
        // The putIfAbsent(Key, Value) method adds an element to the Map if it is not already present.
        // The get(Key) method returns the value associated with a key.
        // The getOrDefault(Key,defaultValue) method returns the value associated with a key, or a default value if the key is not present.
        // The remove(Key) method removes an element from the Map.
        // The remove(Key, Value) method removes an element from the Map if it is equal to the value.
        // The containsKey(Key) method checks if a key is present in the Map.
        // The containsValue(Value) method checks if a value is present in the Map.
        // The replace(Key,Value) method replaces the value associated with a key.
        // The replace(key, oldValue, newValue) method replaces the value associated with a key if it is equal to the oldValue.
        // The keySet() method returns a set of keys in the Map.
        // The values() method returns a collection of values in the Map.
        // The entrySet() method returns a set of key-value pairs in the Map.
    }
}
class Day {
    enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
