class Student {
    // Fields or attributes
    private String studentName;
    private String registrationNumber;
    private String section;
    private String branch;
    private String program;

    // Constructor
    public Student(String studentName, String registrationNumber, String section, String branch, String program) {
        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
        this.section = section;
        this.branch = branch;
        this.program = program;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
        System.out.println("Program: " + program);
        System.out.println();
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        // Create an instance of the Student class with provided details
        Student student1 = new Student("Sasmita", "220301120037", "A", "Btech", "CSE");

        // Display student information
        System.out.println("Student Information:");
        System.out.println("=====================");
        student1.displayInfo();
    }
}