package xyz.ivan.skills.oop.easy._01;

// Task: Design a Student class
// Description: Design a Student class with the following attributes:
// Name (name, String)
// Age (age, int)
// ID (id, String)
// And the following method:
// A method to print student information printInfo()
public class Main {
    public static void main(String[] args) {
        
        // Create a student object and print information
        Student student = new Student("Zhang San", 20, "S12345");
        student.printInfo();
    }
}

// Define Student class
class Student {
    private String name;
    private int age;
    private String id;

    // Constructor
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Method to print student information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}
