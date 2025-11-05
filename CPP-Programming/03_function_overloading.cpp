/*
 * Program: Function Overloading
 * Description: Demonstrates function overloading (compile-time polymorphism)
 * Topic: Polymorphism
 */

#include <iostream>
using namespace std;

class Calculator {
public:
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }
    
    // Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }
    
    // Multiply two doubles
    double multiply(double a, double b) {
        return a * b;
    }
};

int main() {
    Calculator calc;
    
    cout << "Function Overloading Demo" << endl;
    cout << "-------------------------" << endl;
    
    cout << "add(5, 3) = " << calc.add(5, 3) << endl;
    cout << "add(5, 3, 2) = " << calc.add(5, 3, 2) << endl;
    cout << "add(5.5, 3.2) = " << calc.add(5.5, 3.2) << endl;
    
    cout << "\nmultiply(4, 5) = " << calc.multiply(4, 5) << endl;
    cout << "multiply(4.5, 2.0) = " << calc.multiply(4.5, 2.0) << endl;
    
    return 0;
}
