/*
 * Program: Binary Search
 * Description: Implementation of binary search algorithm
 * Topic: Searching
 */

#include <stdio.h>

// Binary search function (iterative)
int binarySearch(int arr[], int n, int key) {
    int left = 0, right = n - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        // Check if key is present at mid
        if (arr[mid] == key)
            return mid;
        
        // If key is greater, ignore left half
        if (arr[mid] < key)
            left = mid + 1;
        // If key is smaller, ignore right half
        else
            right = mid - 1;
    }
    
    // Element not found
    return -1;
}

// Function to display array
void displayArray(int arr[], int n) {
    printf("Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key;
    
    displayArray(arr, n);
    
    printf("Enter element to search: ");
    scanf("%d", &key);
    
    int result = binarySearch(arr, n, key);
    
    if (result != -1)
        printf("Element found at index %d (position %d)\n", result, result + 1);
    else
        printf("Element not found in array\n");
    
    return 0;
}
