/*
 * Program: JDBC Database Connection Example
 * Description: Demonstrates database connectivity using JDBC in Java
 * Topic: Database Connectivity
 * 
 * Note: You need to add MySQL JDBC driver to your classpath
 * Download from: https://dev.mysql.com/downloads/connector/j/
 */

import java.sql.*;

public class JDBCDemo {
    
    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/StudentDB";
    static final String USER = "root";
    static final String PASS = "password";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            // 1. Register JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected successfully!");
            
            // 3. Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT StudentID, Name, Age, Email FROM Student";
            ResultSet rs = stmt.executeQuery(sql);
            
            // 4. Process the result set
            System.out.println("\n--- Student Records ---");
            System.out.println("ID\tName\t\tAge\tEmail");
            System.out.println("--------------------------------------------------");
            
            while (rs.next()) {
                int id = rs.getInt("StudentID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String email = rs.getString("Email");
                
                System.out.println(id + "\t" + name + "\t" + age + "\t" + email);
            }
            
            // 5. Example: INSERT operation
            insertStudent(conn, "New Student", 23, "Male", "newstudent@example.com", "1231231234");
            
            // 6. Example: UPDATE operation
            updateStudentEmail(conn, 1, "updated@example.com");
            
            // 7. Example: DELETE operation (commented out for safety)
            // deleteStudent(conn, 5);
            
            // 8. Clean up
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {
            // Handle errors for JDBC
            System.out.println("SQL Error: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        
        System.out.println("\nGoodbye!");
    }
    
    // Method to insert a new student
    public static void insertStudent(Connection conn, String name, int age, 
                                    String gender, String email, String phone) {
        String sql = "INSERT INTO Student (Name, Age, Gender, Email, Phone) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, gender);
            pstmt.setString(4, email);
            pstmt.setString(5, phone);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("\n" + rowsAffected + " row(s) inserted.");
            pstmt.close();
            
        } catch (SQLException e) {
            System.out.println("Insert Error: " + e.getMessage());
        }
    }
    
    // Method to update student email
    public static void updateStudentEmail(Connection conn, int studentId, String newEmail) {
        String sql = "UPDATE Student SET Email = ? WHERE StudentID = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, studentId);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
            pstmt.close();
            
        } catch (SQLException e) {
            System.out.println("Update Error: " + e.getMessage());
        }
    }
    
    // Method to delete a student
    public static void deleteStudent(Connection conn, int studentId) {
        String sql = "DELETE FROM Student WHERE StudentID = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, studentId);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
            pstmt.close();
            
        } catch (SQLException e) {
            System.out.println("Delete Error: " + e.getMessage());
        }
    }
}
