package J3Classes.InheritanceClasses.J3HierarchicalInheritance;

public class SecondClass extends HierarchicalInheritance {
    @Override
    public void inheritance() {
        System.out.println("Overriding inheritance method of HierarchicalInheritance class in SecondClass");
    }

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.inheritance();
        secondClass.Inheritance1();

    }
}
