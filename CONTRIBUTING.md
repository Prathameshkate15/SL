# Contributing to Software Laboratory Repository

Thank you for considering contributing to this repository! This guide will help you add new programs and improvements.

## How to Contribute

### Adding New Programs

1. **Fork the repository**
   - Click the "Fork" button at the top right of the repository page

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/SL.git
   cd SL
   ```

3. **Create a new branch**
   ```bash
   git checkout -b add-new-program
   ```

4. **Add your program**
   - Choose the appropriate directory (C-Programming, Java-Programming, etc.)
   - Name your file descriptively (e.g., `05_bubble_sort.c`)
   - Follow the naming convention: `##_description.extension`

5. **Program Guidelines**
   - Add comments explaining what the program does
   - Include proper header comments with:
     - Program name
     - Description
     - Topic/Category
   - Use meaningful variable names
   - Test your program before submitting
   - Follow the coding style of existing programs

6. **Commit your changes**
   ```bash
   git add .
   git commit -m "Add bubble sort program in C"
   ```

7. **Push to your fork**
   ```bash
   git push origin add-new-program
   ```

8. **Create a Pull Request**
   - Go to the original repository
   - Click "New Pull Request"
   - Select your branch
   - Describe your changes
   - Submit the pull request

## Program Template

### C/C++ Template
```c
/*
 * Program: [Program Name]
 * Description: [What the program does]
 * Topic: [Topic category]
 */

#include <stdio.h>

int main() {
    // Your code here
    return 0;
}
```

### Java Template
```java
/*
 * Program: [Program Name]
 * Description: [What the program does]
 * Topic: [Topic category]
 */

public class ProgramName {
    public static void main(String[] args) {
        // Your code here
    }
}
```

## What We're Looking For

- **Working code**: Programs should compile and run without errors
- **Well-commented**: Code should be easy to understand
- **Educational value**: Programs should help students learn
- **Common exam topics**: Focus on topics frequently asked in exams
- **Good practices**: Follow coding best practices

## Types of Contributions

1. **New Programs**
   - Add new example programs
   - Implement common algorithms
   - Add real-world examples

2. **Improvements**
   - Fix bugs in existing programs
   - Improve code efficiency
   - Add better comments

3. **Documentation**
   - Improve README files
   - Add tutorials
   - Create study guides

4. **Resources**
   - Add useful links
   - Create cheat sheets
   - Add practice problems

## Code Review Process

1. All contributions will be reviewed by maintainers
2. Feedback may be provided for improvements
3. Once approved, your contribution will be merged
4. You'll be credited as a contributor

## Questions?

If you have questions or need help:
- Open an issue in the repository
- Tag it with the "question" label
- We'll respond as soon as possible

## Code of Conduct

- Be respectful to other contributors
- Provide constructive feedback
- Help fellow students learn
- Keep discussions professional

Thank you for helping make this repository better for all students! 🎓
