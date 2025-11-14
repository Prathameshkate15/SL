/*
 * Program: Student Class with Constructor
 * Description: Demonstrates class, constructor, and methods in Java
 * Topic: OOP Basics
 */

import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;
    
    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "";
        this.marks = 0.0;
    }
    
    // Parameterized constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    // Method to input student data
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }
    
    // Method to display student data
    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    
    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println("Enter student information:");
        s1.input();
        s1.display();
    }
}
