/*
 * Program: Inheritance Example
 * Description: Demonstrates single inheritance in C++
 * Topic: Inheritance
 */

#include <iostream>
#include <string>
using namespace std;

// Base class
class Person {
protected:
    string name;
    int age;

public:
    void inputPerson() {
        cout << "Enter Name: ";
        cin.ignore();
        getline(cin, name);
        cout << "Enter Age: ";
        cin >> age;
    }
    
    void displayPerson() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
};

// Derived class
class Employee : public Person {
private:
    int empId;
    float salary;

public:
    void inputEmployee() {
        inputPerson();
        cout << "Enter Employee ID: ";
        cin >> empId;
        cout << "Enter Salary: ";
        cin >> salary;
    }
    
    void displayEmployee() {
        cout << "\n--- Employee Details ---" << endl;
        displayPerson();
        cout << "Employee ID: " << empId << endl;
        cout << "Salary: $" << salary << endl;
    }
};

int main() {
    Employee emp;
    
    cout << "Enter employee information:" << endl;
    emp.inputEmployee();
    emp.displayEmployee();
    
    return 0;
}
