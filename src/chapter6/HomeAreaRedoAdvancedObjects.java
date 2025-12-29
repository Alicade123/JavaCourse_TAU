package chapter6;

import java.util.Scanner;

public class HomeAreaRedoAdvancedObjects {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        HomeAreaRedoAdvancedObjects calculator = new HomeAreaRedoAdvancedObjects();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double totalArea = calculator.totalRectangleArea(kitchen, bathroom);
        System.out.println("The total are of the both rooms is: "+totalArea);
        calculator.scanner.close();
    }
    public Rectangle getRoom(){

        System.out.println("Enter the rectangle length please:");
        double length = scanner.nextDouble();
        System.out.println("Enter the rectangle width please:");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
    public double totalRectangleArea(Rectangle rectangle1, Rectangle rectangle2){
        System.out.println("The area of kitchen is: "+rectangle1.calculateArea());
        System.out.println("The are of bathroom is: "+rectangle2.calculateArea());
        return  rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
