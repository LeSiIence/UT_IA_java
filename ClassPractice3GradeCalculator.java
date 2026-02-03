/*
Grade Calculator for Three Students (without arrays)
input: 
- For each of 3 students: name and 3 grades

output: 
- For each student: name, 3 grades, average, pass/fail result

Pass condition: average >= 50
date:2026-2-3 name: Nanxin Gao
*/

import java.util.Scanner;

public class ClassPractice3GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables for Student 1
        String name1;
        float grade1_1, grade1_2, grade1_3;
        float avg1;
        String result1;
        
        // Variables for Student 2
        String name2;
        float grade2_1, grade2_2, grade2_3;
        float avg2;
        String result2;
        
        // Variables for Student 3
        String name3;
        float grade3_1, grade3_2, grade3_3;
        float avg3;
        String result3;
        
        // Input for Student 1
        System.out.println("=== Student 1 ===");
        System.out.print("Enter student's name: ");
        name1 = scanner.nextLine();
        System.out.print("Enter grade 1: ");
        grade1_1 = scanner.nextFloat();
        System.out.print("Enter grade 2: ");
        grade1_2 = scanner.nextFloat();
        System.out.print("Enter grade 3: ");
        grade1_3 = scanner.nextFloat();
        scanner.nextLine(); // consume newline
        
        // Calculate average and determine result for Student 1
        avg1 = (grade1_1 + grade1_2 + grade1_3) / 3;
        if (avg1 >= 50) {
            result1 = "Pass";
        } else {
            result1 = "Fail";
        }
        
        // Input for Student 2
        System.out.println("\n=== Student 2 ===");
        System.out.print("Enter student's name: ");
        name2 = scanner.nextLine();
        System.out.print("Enter grade 1: ");
        grade2_1 = scanner.nextFloat();
        System.out.print("Enter grade 2: ");
        grade2_2 = scanner.nextFloat();
        System.out.print("Enter grade 3: ");
        grade2_3 = scanner.nextFloat();
        scanner.nextLine(); // consume newline
        
        // Calculate average and determine result for Student 2
        avg2 = (grade2_1 + grade2_2 + grade2_3) / 3;
        if (avg2 >= 50) {
            result2 = "Pass";
        } else {
            result2 = "Fail";
        }
        
        // Input for Student 3
        System.out.println("\n=== Student 3 ===");
        System.out.print("Enter student's name: ");
        name3 = scanner.nextLine();
        System.out.print("Enter grade 1: ");
        grade3_1 = scanner.nextFloat();
        System.out.print("Enter grade 2: ");
        grade3_2 = scanner.nextFloat();
        System.out.print("Enter grade 3: ");
        grade3_3 = scanner.nextFloat();
        
        // Calculate average and determine result for Student 3
        avg3 = (grade3_1 + grade3_2 + grade3_3) / 3;
        if (avg3 >= 50) {
            result3 = "Pass";
        } else {
            result3 = "Fail";
        }
        
        // Print results for all three students
        System.out.println("\n========== RESULTS ==========");
        
        System.out.println("\nStudent 1:");
        System.out.println("Name: " + name1);
        System.out.printf("Grades: %.2f, %.2f, %.2f\n", grade1_1, grade1_2, grade1_3);
        System.out.printf("Average: %.2f\n", avg1);
        System.out.println("Result: " + result1);
        
        System.out.println("\nStudent 2:");
        System.out.println("Name: " + name2);
        System.out.printf("Grades: %.2f, %.2f, %.2f\n", grade2_1, grade2_2, grade2_3);
        System.out.printf("Average: %.2f\n", avg2);
        System.out.println("Result: " + result2);
        
        System.out.println("\nStudent 3:");
        System.out.println("Name: " + name3);
        System.out.printf("Grades: %.2f, %.2f, %.2f\n", grade3_1, grade3_2, grade3_3);
        System.out.printf("Average: %.2f\n", avg3);
        System.out.println("Result: " + result3);
        
        scanner.close();
    }
}