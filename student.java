// student.java
public class student extends person {
    private int studentId;

    public student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Overriding displayInfo() method of Person
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method of the superclass
        System.out.println("student ID: " + studentId);
    }
}
