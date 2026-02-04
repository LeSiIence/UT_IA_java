/*
ClassPractice4GradeLoop 
input: (for each of 3 students)
- name
- 3 grades
output: (for each of 3 students)
- name
- 3 grades
- average
- pass/fail result

date:2026-2-4 name: Nanxin Gao
*/
import java.util.Scanner;

public class ClassPractice4GradeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of students
        int NUM_STUDENTS = 3;       
        String[] names = new String[NUM_STUDENTS];
        float[] grades1 = new float[NUM_STUDENTS];
        float[] grades2 = new float[NUM_STUDENTS];  
        float[] grades3 = new float[NUM_STUDENTS];

        for (int i = 1; i <= NUM_STUDENTS; i++) { 
            String name;
            float g1, g2, g3;
            
            // Input for each student
            System.out.println("=== Student " + i + " ===");
            System.out.print("Enter student's name: ");
            name = scanner.nextLine();
            System.out.print("Enter grade 1: ");
            g1 = scanner.nextFloat();
            System.out.print("Enter grade 2: ");
            g2 = scanner.nextFloat();
            System.out.print("Enter grade 3: ");
            g3 = scanner.nextFloat();
            scanner.nextLine(); // consume newline
            
            grades1[i - 1] = g1;
            grades2[i - 1] = g2;
            grades3[i - 1] = g3;
            names[i - 1] = name;

        }

        for(int i = 0; i < NUM_STUDENTS; i++) {
            float avg = (grades1[i] + grades2[i] + grades3[i]) / 3;
            String result = (avg >= 50) ? "Pass" : "Fail";
            System.out.printf("\n=== Student %d ===\n", i + 1);
            System.out.printf("Name: %s\n", names[i]);
            System.out.printf("Grade 1: %.2f\n", grades1[i]);
            System.out.printf("Grade 2: %.2f\n", grades2[i]);
            System.out.printf("Grade 3: %.2f\n", grades3[i]);
            System.out.printf("\n%s's average: %.2f - %s\n\n", names[i], avg, result);
        }
        
        scanner.close();
    }
}