package chapter4;

import java.util.Scanner;

public class WhileLoop {
    public static  void main(String[] args){
        int rate = 15;
        int maxHoursPerWeek = 40;
        int numberOfHoursPerWeek;
        int grossSalary ;
        System.out.println("Enter the number of the hours you worked this week Please!");
        Scanner scanner = new Scanner (System.in);
        numberOfHoursPerWeek = scanner.nextInt();
        while (numberOfHoursPerWeek>maxHoursPerWeek||numberOfHoursPerWeek<1){
            System.out.println("Please enter valid number of hours you worked this week between 1 and 40, So try again!");
            numberOfHoursPerWeek = scanner.nextInt();
        }
        scanner.close();
        grossSalary = rate*numberOfHoursPerWeek;
        System.out.println("Your grossSalary is: "+grossSalary);

    }
}
