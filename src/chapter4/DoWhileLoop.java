package chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter your second number");
            int num2 = scanner.nextInt();
            System.out.printf("The sum of your two numbers %d and %d is %d:",num1, num2, num1+num2);
            System.out.println("Do you want to run again Enter \"true\" or \"false\".");
            again = scanner.nextBoolean();
        }while (again);
    }

}
