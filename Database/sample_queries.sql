-- SQL Queries for Practical Exams
-- Database: Student Management System

-- 1. Create Database
CREATE DATABASE IF NOT EXISTS StudentDB;
USE StudentDB;

-- 2. Create Tables
CREATE TABLE Student (
    StudentID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    Age INT,
    Gender VARCHAR(10),
    Email VARCHAR(100) UNIQUE,
    Phone VARCHAR(15)
);

CREATE TABLE Course (
    CourseID INT PRIMARY KEY AUTO_INCREMENT,
    CourseName VARCHAR(100) NOT NULL,
    Credits INT,
    Department VARCHAR(50)
);

CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY AUTO_INCREMENT,
    StudentID INT,
    CourseID INT,
    Grade VARCHAR(2),
    EnrollmentDate DATE,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- 3. Insert Sample Data
INSERT INTO Student (Name, Age, Gender, Email, Phone) VALUES
('John Doe', 20, 'Male', 'john@example.com', '1234567890'),
('Jane Smith', 21, 'Female', 'jane@example.com', '9876543210'),
('Bob Johnson', 22, 'Male', 'bob@example.com', '5551234567'),
('Alice Williams', 20, 'Female', 'alice@example.com', '5559876543');

INSERT INTO Course (CourseName, Credits, Department) VALUES
('Database Systems', 4, 'Computer Science'),
('Data Structures', 4, 'Computer Science'),
('Web Development', 3, 'Computer Science'),
('Operating Systems', 4, 'Computer Science');

INSERT INTO Enrollment (StudentID, CourseID, Grade, EnrollmentDate) VALUES
(1, 1, 'A', '2024-01-15'),
(1, 2, 'B', '2024-01-15'),
(2, 1, 'A', '2024-01-16'),
(2, 3, 'B', '2024-01-16'),
(3, 2, 'C', '2024-01-17'),
(4, 4, 'A', '2024-01-18');

-- 4. Basic SELECT Queries
-- Select all students
SELECT * FROM Student;

-- Select students with age > 20
SELECT * FROM Student WHERE Age > 20;

-- Select students ordered by name
SELECT * FROM Student ORDER BY Name;

-- 5. Aggregate Functions
-- Count total students
SELECT COUNT(*) AS TotalStudents FROM Student;

-- Average age of students
SELECT AVG(Age) AS AverageAge FROM Student;

-- Students grouped by gender
SELECT Gender, COUNT(*) AS Count FROM Student GROUP BY Gender;

-- 6. JOIN Queries
-- Get student names with their enrolled courses
SELECT s.Name, c.CourseName, e.Grade
FROM Student s
INNER JOIN Enrollment e ON s.StudentID = e.StudentID
INNER JOIN Course c ON e.CourseID = c.CourseID;

-- Get all students and their courses (including students with no enrollments)
SELECT s.Name, c.CourseName
FROM Student s
LEFT JOIN Enrollment e ON s.StudentID = e.StudentID
LEFT JOIN Course c ON e.CourseID = c.CourseID;

-- 7. Subqueries
-- Students enrolled in 'Database Systems'
SELECT Name FROM Student
WHERE StudentID IN (
    SELECT StudentID FROM Enrollment
    WHERE CourseID = (
        SELECT CourseID FROM Course WHERE CourseName = 'Database Systems'
    )
);

-- Students with above average age
SELECT Name, Age FROM Student
WHERE Age > (SELECT AVG(Age) FROM Student);

-- 8. UPDATE Queries
-- Update student email
UPDATE Student SET Email = 'newemail@example.com' WHERE StudentID = 1;

-- Update grade for an enrollment
UPDATE Enrollment SET Grade = 'A' WHERE EnrollmentID = 2;

-- 9. DELETE Queries
-- Delete a specific enrollment
DELETE FROM Enrollment WHERE EnrollmentID = 1;

-- Delete students older than 25
-- DELETE FROM Student WHERE Age > 25;

-- 10. Advanced Queries
-- Students with grade 'A'
SELECT DISTINCT s.Name 
FROM Student s
INNER JOIN Enrollment e ON s.StudentID = e.StudentID
WHERE e.Grade = 'A';

-- Count of enrollments per course
SELECT c.CourseName, COUNT(e.EnrollmentID) AS EnrollmentCount
FROM Course c
LEFT JOIN Enrollment e ON c.CourseID = e.CourseID
GROUP BY c.CourseID, c.CourseName;

-- Students enrolled in more than one course
SELECT s.Name, COUNT(e.CourseID) AS CourseCount
FROM Student s
INNER JOIN Enrollment e ON s.StudentID = e.StudentID
GROUP BY s.StudentID, s.Name
HAVING COUNT(e.CourseID) > 1;
