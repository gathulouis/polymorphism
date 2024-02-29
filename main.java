// Main.java
public class main {
    public static void main(String[] args) {
        // Polymorphism: Person reference but Student object
        person student = new student("John", 20, 12345);
        // Polymorphism: Person reference but Teacher object
        person teacher = new teacher("Jane", 35, "Mathematics");

        // Call overridden method for student
        student.displayInfo();
        System.out.println("------------------");
        // Call overridden method for teacher
        teacher.displayInfo();
    }
}

