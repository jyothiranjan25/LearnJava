package J3Classes;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

// Private Inner Class
// We can also declare an inner class as private. It means it can be accessed only within the outer class.
class outerClass1{
    int x = 10;
    private class InnerClass {
        int y = 5;
    }
}

// Static Inner Class
// We can also declare an inner class as static. It means it can be accessed without creating an object of the outer class.
class outerClass2{
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}

// Access Outer Class From Inner Class
// One advantage of inner classes, is that they can access attributes and methods of the outer class:
class outerClass3{
    int x = 10;

    class InnerClass {
        int y = 5;
        public void myInnerMethod() {
            System.out.println(x + y);
        }
    }
}

public class Java10InnerClasses {
    public class Java10InnerClassesInner { // Inner class
        public void myInnerMethod() {
            System.out.println("Inner class can access outer class");
        }
    }
    // Inner class
    // Inner classes are a security mechanism in Java. We can write a class within a class.
    // We can write a class within a class. We can write a class within a class.
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        // Private Inner Class
        // We can also declare an inner class as private. It means it can be accessed only within the outer class.
        outerClass1 myOuter1 = new outerClass1();
        //outerClass1.InnerClass myInner1 = myOuter1.new InnerClass();
        //System.out.println(myInner1.y + myOuter1.x);
        System.out.println("Private Inner Class Output : " + myOuter1.x);

        // Static Inner Class
        // We can also declare an inner class as static. It means it can be accessed without creating an object of the outer class.
        outerClass2.InnerClass myInner2 = new outerClass2.InnerClass();
        System.out.println("Static Inner Class Output : " + myInner2.y);

        // Access Outer Class From Inner Class
        // To access the outer class, use the keyword outer followed by the dot and the member name.
        outerClass3 myOuter3 = new outerClass3();
        outerClass3.InnerClass myInner3 = myOuter3.new InnerClass();
        myInner3.myInnerMethod();

        // access public inner class from another public class method
        Java10InnerClasses myOuter4 = new Java10InnerClasses();
        Java10InnerClasses.Java10InnerClassesInner myInner4 = myOuter4.new Java10InnerClassesInner();
        myInner4.myInnerMethod();
    }
}
