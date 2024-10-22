package J3Classes.InheritanceClasses.J3HierarchicalInheritance;

public class FirstClass extends HierarchicalInheritance {
    @Override
    public void inheritance() {
        System.out.println("Overriding inheritance method of HierarchicalInheritance class in FirstClass");
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.inheritance();
        firstClass.Inheritance1();
    }
}
