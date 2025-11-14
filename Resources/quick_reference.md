# Software Laboratory - Quick Reference Guide

## Table of Contents
1. [C Programming Syntax](#c-programming-syntax)
2. [C++ Programming Syntax](#cpp-programming-syntax)
3. [Java Programming Syntax](#java-programming-syntax)
4. [SQL Commands](#sql-commands)
5. [Compilation and Execution](#compilation-and-execution)

---

## C Programming Syntax

### Basic Structure
```c
#include <stdio.h>

int main() {
    // Your code here
    return 0;
}
```

### Input/Output
```c
// Output
printf("Hello %s\n", name);
printf("Number: %d\n", num);

// Input
scanf("%d", &num);
scanf("%s", str);
```

### Common Data Types
- `int` - Integer
- `float` - Floating point
- `double` - Double precision
- `char` - Character
- `void` - No value

### Control Structures
```c
// If-else
if (condition) {
    // code
} else if (condition) {
    // code
} else {
    // code
}

// Switch
switch (variable) {
    case value1:
        // code
        break;
    default:
        // code
}

// Loops
for (int i = 0; i < n; i++) { }
while (condition) { }
do { } while (condition);
```

---

## C++ Programming Syntax

### Class Definition
```cpp
class ClassName {
private:
    // private members
public:
    // Constructor
    ClassName() { }
    
    // Member functions
    void function() { }
};
```

### Inheritance
```cpp
class Derived : public Base {
    // Derived class members
};
```

### STL Containers
```cpp
#include <vector>
#include <map>

vector<int> v;
v.push_back(10);

map<string, int> m;
m["key"] = value;
```

---

## Java Programming Syntax

### Class Structure
```java
public class ClassName {
    // Instance variables
    private int variable;
    
    // Constructor
    public ClassName() { }
    
    // Methods
    public void method() { }
    
    public static void main(String[] args) {
        // Main method
    }
}
```

### Exception Handling
```java
try {
    // Code that may throw exception
} catch (ExceptionType e) {
    // Handle exception
} finally {
    // Always executes
}
```

### Collections
```java
ArrayList<Type> list = new ArrayList<>();
HashMap<Key, Value> map = new HashMap<>();
```

---

## SQL Commands

### Basic Commands
```sql
-- SELECT
SELECT column1, column2 FROM table_name WHERE condition;

-- INSERT
INSERT INTO table_name (col1, col2) VALUES (val1, val2);

-- UPDATE
UPDATE table_name SET col1 = val1 WHERE condition;

-- DELETE
DELETE FROM table_name WHERE condition;
```

### Joins
```sql
-- INNER JOIN
SELECT * FROM table1
INNER JOIN table2 ON table1.id = table2.id;

-- LEFT JOIN
SELECT * FROM table1
LEFT JOIN table2 ON table1.id = table2.id;
```

### Aggregate Functions
```sql
COUNT(*), SUM(column), AVG(column), MAX(column), MIN(column)

-- With GROUP BY
SELECT column, COUNT(*) FROM table GROUP BY column;
```

---

## Compilation and Execution

### C Programs
```bash
# Compile
gcc program.c -o program

# Run
./program
```

### C++ Programs
```bash
# Compile
g++ program.cpp -o program

# Run
./program
```

### Java Programs
```bash
# Compile
javac Program.java

# Run
java Program
```

---

## Tips for Practical Exams

1. **Time Management**
   - Read all questions first
   - Start with questions you're most confident about
   - Allocate time wisely

2. **Code Quality**
   - Write clean, readable code
   - Add comments for complex logic
   - Use meaningful variable names

3. **Testing**
   - Test your code with multiple inputs
   - Check edge cases
   - Verify output format

4. **Common Mistakes to Avoid**
   - Forgetting semicolons
   - Array index out of bounds
   - Not initializing variables
   - Memory leaks (in C/C++)
   - Null pointer exceptions (in Java)

5. **Debugging**
   - Use printf/cout for debugging
   - Check compiler errors carefully
   - Test one function at a time

---

## Useful Resources

- **Online Compilers**
  - [OnlineGDB](https://www.onlinegdb.com/)
  - [Repl.it](https://replit.com/)
  - [JDoodle](https://www.jdoodle.com/)

- **Documentation**
  - [C Documentation](https://devdocs.io/c/)
  - [C++ Reference](https://en.cppreference.com/)
  - [Java Docs](https://docs.oracle.com/en/java/)
  - [SQL Tutorial](https://www.w3schools.com/sql/)

Good luck with your exams!
