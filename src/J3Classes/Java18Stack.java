package J3Classes;

import java.util.Enumeration;
import java.util.Stack;

public class Java18Stack {
    // Stack is a subclass of Vector that implements a standard last-in, first-out stack.
    // Stack only defines the default constructor, which creates an empty stack.
    // Stack includes all the methods defined by Vector, and adds several of its own.
    // Stack is a legacy class and it is recommended to use Deque instead of Stack.
    // Deque is a linear collection that supports element insertion and removal at both ends.
    // Deque is designed to be used in preference to Stack.
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1); // Pushes an item onto the top of this stack.
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop(); // Removes the object at the top of this stack and returns that object.
        System.out.println("Stack: " + stack);
        Enumeration<Integer> e = stack.elements(); // Returns an enumeration of the components of this stack.
        while (e.hasMoreElements()) {
            System.out.println("Element: " + e.nextElement());
        }

        // other methods
        System.out.println("Peek: " + stack.peek()); // Looks at the object at the top of this stack without removing it from the stack.
        System.out.println("Search: " + stack.search(3)); // Returns the 1-based position where an object is on this stack.
        System.out.println("Size: " + stack.size()); // Returns the number of components in this stack.
        System.out.println("Empty: " + stack.empty()); // Tests if this stack is empty.

        // Stack is a subclass of Vector that implements a standard last-in, first-out stack.
        // Stack only defines the default constructor, which creates an empty stack.
        // Stack includes all the methods defined by Vector, and adds several of its own.
        // Stack is a legacy class and it is recommended to use Deque instead of Stack.
        // Deque is a linear collection that supports element insertion and removal at both ends.
        // Deque is designed to be used in preference to Stack.
    }
}
