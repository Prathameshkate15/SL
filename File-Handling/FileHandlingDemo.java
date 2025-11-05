/*
 * Program: File Handling in Java
 * Description: Reading from and writing to files in Java
 * Topic: File I/O
 */

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {
    
    // Write to file
    public static void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    // Read from file
    public static void readFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            
            System.out.println("\nContents of " + filename + ":");
            System.out.println("------------------------");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            System.out.println("------------------------");
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
    // Append to file
    public static void appendToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename, true); // true for append mode
            writer.write(content);
            writer.close();
            System.out.println("Successfully appended to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
    
    // Copy file
    public static void copyFile(String source, String destination) {
        try {
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(destination);
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            
            input.close();
            output.close();
            System.out.println("File copied successfully!");
            
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "sample.txt";
        
        while (true) {
            System.out.println("\n--- File Operations Menu ---");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Append to file");
            System.out.println("4. Copy file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter content to write: ");
                    String content = sc.nextLine();
                    writeToFile(filename, content + "\n");
                    break;
                    
                case 2:
                    readFromFile(filename);
                    break;
                    
                case 3:
                    System.out.print("Enter content to append: ");
                    content = sc.nextLine();
                    appendToFile(filename, content + "\n");
                    break;
                    
                case 4:
                    System.out.print("Enter destination filename: ");
                    String dest = sc.nextLine();
                    copyFile(filename, dest);
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
