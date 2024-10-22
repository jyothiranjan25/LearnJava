package J3Classes.InheritanceClasses.J5HybridInheritance;

public class HybridInheritance extends FirstClass implements Interface1, Interface2 {
    //Hybrid inheritance is a combination of two or more types of inheritance. For example, combining single inheritance and multiple inheritance. But Java does not support multiple inheritance with classes. It means that a class cannot extend more than one class.
    //But a class can implement more than one interface, which is equivalent to multiple inheritance.
    //Since Java 8, we can have method body in interface. But we need to make it default method. Let's see a simple example:

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        HybridInheritance obj = new HybridInheritance();
        obj.print();
        obj.show();
        obj.myFirstClass();
    }

}
