package J3Classes.InheritanceClasses.J2MultilevelInheritance;

public class SecondClass extends FirstClass {
    void secondClass() {
        System.out.println("This is the second class...");
    }

    public static void main(String[] args) {
        SecondClass d = new SecondClass();
        d.secondClass();
        d.firstClass();
        d.multiLevel();
    }
}
