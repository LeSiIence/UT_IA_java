/*
A tax calculator that gives tax amount based on user input income.
input: a float number representing income
output: a float number representing tax amount
edge case handling: negative income input -> print error message and exit
                    income above 207350 -> print error message and exit
date:2026-2-2 name: Nanxin Gao
*/

import java.util.Scanner;
public class ClassPractice2TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your income:");

        double income = scanner.nextDouble();
        double tax;
        
        if(income <0){
            System.out.println("Income cannot be negative.");
            return;
        }
        else if(income <= 9875){
            tax = income * 0.10;
        }
        else if(income <= 40125){
            tax = 987.5 + 0.12 * (income - 9875);
        }
        else if(income <= 85525){
            tax = 4617.5 + 0.22 * (income - 40125);
        }
        else if(income <= 163300){
            tax = 14605.5 + 0.24 * (income - 85525);
        }
        else if(income <= 207350){
            tax = 33271.5 + 0.32 * (income - 163300);
        }
        else {
            System.out.println("Income exceeds the supported range.");
            return;
        }
        System.out.printf("Your tax amount is: %.2f\n", tax);
    }    
}
