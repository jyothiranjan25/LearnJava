package J3Classes;

import java.lang.reflect.*;

public class Java28Reflection {
    // Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.
    // The required classes for reflection are provided under java.lang.reflect package.
    // Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.
    // Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.
    // The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.
    // The java.lang and java.lang.reflect packages provide classes for java reflection.

    // Advantages of Reflection:
    // 1. Extensibility Features: An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.
    // 2. Debugging and testing tools: Debuggers use the property of reflection to examine private members on classes. Test harnesses can also make use of reflection to systematically call a discoverable set of methods on a class.
    // 3. Exposing capabilities: By allowing a program to examine and use classes, methods, and fields that are not known until runtime, a programmer can write more flexible and adaptable programs.

    // Disadvantages of Reflection:
    // 1. Performance Overhead: Reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
    // 2. Exposure of Internals: Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.
    // 3. Security Restrictions: Reflection requires a runtime permission which may not be present when running under a security manager.

    public static void main(String[] args) {
        // create object of the class
        Test obj = new Test();

        // create class object from the object using getClass() method
        Class c = obj.getClass();

        // get name of the class
        String className = c.getName();

        // get the access modifier of the class
        int modifier = c.getModifiers();

        // get the methods of the class
        Method[] methods = c.getDeclaredMethods();

        // convert the access modifier to string
        String modifierString = Modifier.toString(modifier);

        // Reflection of Java Fields
         Field[] fields = c.getDeclaredFields();

         //Reflection of Java Constructor
         Constructor[] constructors = c.getDeclaredConstructors();


        // print the class name and access modifier
        System.out.println("Class name: " + className);
        System.out.println("Access modifier: " + modifierString);

        System.out.println("\n");

        // print the methods of the class
        for (Method method : methods) {
            Parameter[] parameters = method.getParameters();
            System.out.println("Method name: " + method.getName());
            for (Parameter parameter : parameters) {
                System.out.println("Parameter name: " + parameter.getName()+ "; " + "Parameter type: " + parameter.getType().getName());
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        // print the fields of the class
        for (Field field : fields) {
            // get field type
            Class fieldType = field.getType();
            System.out.println("Field name: " + field.getName() + "; " + "Field type: " + fieldType.getName() + "; " + "Modifier type: " + Modifier.toString(field.getModifiers()));
        }

        System.out.println("\n");

        // print the constructors of the class
        for (Constructor constructor : constructors) {
            // get the name of constructors
            System.out.println("Constructor name: " + constructor.getName());
            // get the parameters of constructors
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println("Parameter type: " + parameterType.getName());
            }
            // get the access modifier of constructors
            int constructorModifier = constructor.getModifiers();
            System.out.println("Constructor modifier: " + Modifier.toString(constructorModifier));

            System.out.println("\n");
        }

        // invoke the methods of the class
        try {
            Method method1 = c.getDeclaredMethod("method1");
            method1.invoke(obj);

            Method method2 = c.getDeclaredMethod("method2", int.class);
            method2.invoke(obj, 10);

            Method method3 = c.getDeclaredMethod("method3");
            method3.setAccessible(true);
            method3.invoke(obj);

            Method method4 = c.getDeclaredMethod("method4", int.class, String.class, boolean.class);
            method4.setAccessible(true);
            method4.invoke(obj, 10, "Java", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Test {
    private String s;

    private int i;

    private boolean b;

    public Test() {
        s = "Java";
        i = 10;
        b = true;
    }

    public Test(String s, int i, boolean b) {
        this.s = s;
        this.i = i;
        this.b = b;
    }

    public void method1() {
        System.out.println("The string is " + s + " The number is " + i + " The boolean is " + b);
    }
    public void method2(int n) {
        System.out.println("The number is " + n);
    }
    private void method3() {
        System.out.println("Private method invoked");
    }
    private void method4(int n, String s,boolean b) {
        System.out.println("The number is " + n + " The string is " + s + " The boolean is " + b);
    }
}
