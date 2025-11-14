/*
 * Program: Exception Handling Example
 * Description: Demonstrates try-catch-finally blocks in Java
 * Topic: Exception Handling
 */

import java.util.Scanner;

public class ExceptionHandlingDemo {
    
    // Method that may throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example 1: Handling ArithmeticException
        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        
        // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("\nEnter array index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            System.out.println("Exception: " + e.getMessage());
        }
        
        // Example 3: Multiple catch blocks
        try {
            System.out.print("\nEnter a number to parse: ");
            sc.nextLine(); // Consume newline
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
        System.out.println("\nProgram completed successfully!");
    }
}
