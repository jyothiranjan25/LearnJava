package J2Methods;

public class Java2MethodParameters {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static void myMethod3(int age) {
      if(age < 18) {
        System.out.println("Access denied - You are not old enough!");
      } else {
        System.out.println("Access granted - You are old enough!");
      }
    }

    public static void main(String[] args) {
        // Information can be passed to methods as parameters.
        // Parameters act as variables inside the method.
        // Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
        // The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:
        myMethod("Liam");
        myMethod2("Liam", 5);
        myMethod3(20);
    }
}
