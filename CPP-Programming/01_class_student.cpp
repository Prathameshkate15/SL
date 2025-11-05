/*
 * Program: Basic Class Example
 * Description: Simple class demonstrating OOP concepts in C++
 * Topic: Classes and Objects
 */

#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    int rollNo;
    string name;
    float marks;

public:
    // Constructor
    Student() {
        rollNo = 0;
        name = "";
        marks = 0.0;
    }
    
    // Parameterized constructor
    Student(int r, string n, float m) {
        rollNo = r;
        name = n;
        marks = m;
    }
    
    // Function to input student data
    void input() {
        cout << "Enter Roll No: ";
        cin >> rollNo;
        cin.ignore(); // Clear input buffer
        cout << "Enter Name: ";
        getline(cin, name);
        cout << "Enter Marks: ";
        cin >> marks;
    }
    
    // Function to display student data
    void display() {
        cout << "\n--- Student Details ---" << endl;
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
    }
    
    // Function to check if student passed
    bool isPassed() {
        return marks >= 40.0;
    }
};

int main() {
    Student s1;
    
    cout << "Enter student information:" << endl;
    s1.input();
    s1.display();
    
    if (s1.isPassed())
        cout << "Result: PASS" << endl;
    else
        cout << "Result: FAIL" << endl;
    
    return 0;
}
