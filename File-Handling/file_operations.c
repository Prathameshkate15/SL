/*
 * Program: File I/O in C
 * Description: Reading from and writing to files in C
 * Topic: File Handling
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Write to file
void writeToFile() {
    FILE *fp;
    char text[200];
    
    fp = fopen("sample.txt", "w");
    if (fp == NULL) {
        printf("Error opening file for writing!\n");
        return;
    }
    
    printf("Enter text to write to file (max 200 chars): ");
    getchar(); // Consume newline
    fgets(text, sizeof(text), stdin);
    
    fprintf(fp, "%s", text);
    fclose(fp);
    printf("Data written to file successfully!\n");
}

// Read from file
void readFromFile() {
    FILE *fp;
    char ch;
    
    fp = fopen("sample.txt", "r");
    if (fp == NULL) {
        printf("Error opening file for reading!\n");
        printf("File may not exist. Try writing to it first.\n");
        return;
    }
    
    printf("\nContents of file:\n");
    printf("------------------\n");
    while ((ch = fgetc(fp)) != EOF) {
        printf("%c", ch);
    }
    printf("------------------\n");
    
    fclose(fp);
}

// Append to file
void appendToFile() {
    FILE *fp;
    char text[200];
    
    fp = fopen("sample.txt", "a");
    if (fp == NULL) {
        printf("Error opening file for appending!\n");
        return;
    }
    
    printf("Enter text to append to file: ");
    getchar(); // Consume newline
    fgets(text, sizeof(text), stdin);
    
    fprintf(fp, "%s", text);
    fclose(fp);
    printf("Data appended to file successfully!\n");
}

int main() {
    int choice;
    
    while (1) {
        printf("\n--- File Operations Menu ---\n");
        printf("1. Write to file\n");
        printf("2. Read from file\n");
        printf("3. Append to file\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) {
            case 1:
                writeToFile();
                break;
            case 2:
                readFromFile();
                break;
            case 3:
                appendToFile();
                break;
            case 4:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice!\n");
        }
    }
    
    return 0;
}
