import java.util.Scanner;
// A simple Java class to calculate BMI based on user input
// date: 2026-1-29 name: Nanxin Gao
public class ClassPractice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in meters and weight in kilograms:");

        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        //System.out.println("Your BMI is: " + bmi);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        
    }
}