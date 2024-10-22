package J3Classes.EncapsulationClasses;

public class FirstClass {
    // Encapsulation is the technique of making the fields in a class private and
    // providing access to the fields via public methods.

    // If a field is declared private, it cannot be accessed by anyone outside the
    // class, thereby hiding the fields within the class.

    private int id;
    private String name;
    private char grade;
    private double salary;
    private boolean isEmployed;

    // getter and setter methods are used to access and update the values of the fields.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}
