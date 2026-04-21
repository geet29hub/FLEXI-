// Base Class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived Class
class Student extends Person {
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Call parent constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    void displayStudent() {
        displayPerson(); // Inherited method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Further Derived Class
class GraduateStudent extends Student {
    String specialization;

    // Constructor
    GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks); // Call parent constructor
        this.specialization = specialization;
    }

    // Method to display complete details
    void displayGraduateStudent() {
        displayStudent(); // Inherited method
        System.out.println("Specialization: " + specialization);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating object
        GraduateStudent g1 = new GraduateStudent(
            "Harman", 20, 101, 88.5, "Artificial Intelligence"
        );

        // Display all details
        System.out.println("Graduate Student Details:");
        g1.displayGraduateStudent();
    }
}
