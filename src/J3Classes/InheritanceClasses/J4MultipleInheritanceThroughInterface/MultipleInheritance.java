package J3Classes.InheritanceClasses.J4MultipleInheritanceThroughInterface;

public class MultipleInheritance implements Interface1, Interface2 {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }
    //Multiple Inheritance Through Interface
    //Java does not support multiple inheritance with classes. In java, we can achieve multiple inheritance only through Interfaces. Java does not support multiple inheritance with classes. It means that a class cannot extend more than one class.
    //But a class can implement more than one interface, which is equivalent to multiple inheritance.
    //Multiple inheritance is not supported in java through class. But it can be achieved by an interface, why?
    //It is because the class can implement more than one interface. So if a class is implementing more than one interface, it means it is inheriting multiple behaviors.
    //Since Java 8, we can have method body in interface. But we need to make it default method. Let's see a simple example:

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.print();
        obj.show();
    }
}
