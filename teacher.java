// teacher.java
public class teacher extends person {
    private String subject;

    public teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayInfo() method of Person
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method of the superclass
        System.out.println("Subject: " + subject);
    }
}

