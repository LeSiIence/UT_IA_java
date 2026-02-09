/*
functions:
1. printMessage: This function prints a welcome message to the user.
2. readValues: This function reads two integer values from the user and returns them as an array.
3. processValues: This function takes two integer parameters, processes them (in this case, by calculating their sum), and returns the result.
4. printOutcomes: This function takes the two input numbers and their processed result as parameters and prints them to the console.
date:2026-2-6 name: Nanxin Gao
*/
import java.util.Scanner;

public class ClassPractice5Function {

    public static void printMessage() {
        /* This method prints a welcome message to the user */
        System.out.println("welcome to our program");
    }

    public static int[] readValues() {
        /* This method reads two integer values from the user */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }

    public static int processValues(int num1, int num2) {
        /* This method processes the two numbers and returns their sum */
        return num1 + num2;
    }

    public static void printOutcomes(int num1, int num2, int result) {
        /* This method prints the input numbers and their processed result */
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        printMessage();

        int[] values = readValues();
        int num1 = values[0];
        int num2 = values[1];

        int result = processValues(num1, num2);

        printOutcomes(num1, num2, result);
    }
}
