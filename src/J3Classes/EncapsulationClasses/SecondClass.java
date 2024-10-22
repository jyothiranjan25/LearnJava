package J3Classes.EncapsulationClasses;

public class SecondClass {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.setId(1);
        firstClass.setName("John Doe");
        firstClass.setGrade('A');
        firstClass.setSalary(100000.00);
        firstClass.setEmployed(true);

        System.out.println("ID: " + firstClass.getId());
        System.out.println("Name: " + firstClass.getName());
        System.out.println("Grade: " + firstClass.getGrade());
        System.out.println("Salary: " + firstClass.getSalary());
        System.out.println("Employed: " + firstClass.isEmployed());
    }
}
