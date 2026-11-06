package chapter2;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        System.out.println("Enter season of the year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Enter whole number:");
        int number = scanner.nextInt();
        System.out.println("Enter an adjective:");
       String adjective = scanner.next();
        System.out.println("On a "+adjective+" "+year+" day, I drink a minimum of "+number+" cups of coffee.");
    }
}
