
class Student {
    // Instance variables
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(int rollNo, String name,
            int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", "
                           + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: "
                           + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating three Student objects
        Student s1 = new Student(101, "Rahul", 80, 75, 90);
        Student s2 = new Student(102, "Aman", 85, 88, 78);
        Student s3 = new Student(103, "Priya", 92, 95, 89);

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
