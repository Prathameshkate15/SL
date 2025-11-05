/*
 * Program: Factorial using recursion
 * Description: Calculate factorial of a number using recursive function
 * Topic: Recursion, Functions
 */

#include <stdio.h>

// Recursive function to calculate factorial
long long factorial(int n) {
    if (n <= 1)
        return 1;
    return n * factorial(n - 1);
}

int main() {
    int num;
    
    printf("Enter a number: ");
    scanf("%d", &num);
    
    if (num < 0) {
        printf("Factorial is not defined for negative numbers.\n");
    } else {
        printf("Factorial of %d = %lld\n", num, factorial(num));
    }
    
    return 0;
}
