/*
 * Program: Array Operations
 * Description: Basic array operations - input, display, search, find max/min
 * Topic: Arrays
 */

#include <stdio.h>

#define MAX_SIZE 100

void inputArray(int arr[], int n) {
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
}

void displayArray(int arr[], int n) {
    printf("Array elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int findMax(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max;
}

int findMin(int arr[], int n) {
    int min = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] < min)
            min = arr[i];
    }
    return min;
}

int main() {
    int arr[MAX_SIZE];
    int n;
    
    printf("Enter number of elements: ");
    scanf("%d", &n);
    
    inputArray(arr, n);
    displayArray(arr, n);
    
    printf("Maximum element: %d\n", findMax(arr, n));
    printf("Minimum element: %d\n", findMin(arr, n));
    
    return 0;
}
