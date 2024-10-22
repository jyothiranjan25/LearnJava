package J3Classes.InheritanceClasses.J1SingleInheritance;

public class SingleInheritance {
    //Single Inheritance
    //When a class extends another class, it is known as a single inheritance. In the example given below, Dog class inherits the SingleInheritance class, so there is the single inheritance.
    //In Java, a class can only inherit from one superclass.
    //The syntax of Java Single Inheritance is as follows:
    //class Subclass-name extends Superclass-name
    //{
    //   //methods and fields
    //}
    //Example of Single Inheritance
    void eat() {
        System.out.println("eating...");
    }
    void bark() {
        System.out.println("barking...1");
    }
}

class Dog extends SingleInheritance {
    void bark() {
        super.bark();
        System.out.println("barking... 2");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}