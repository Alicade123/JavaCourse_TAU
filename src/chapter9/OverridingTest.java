package chapter9;

public class OverridingTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(6);
        rectangle.setSides(4);
        double result = rectangle.calculatePerimeter();
        rectangle.myName();
        System.out.println("the perimeter of Rectangle is: "+String.format("%.1f",result)+" cm2\n");

        var square = new Square();
        square.setLength(4);
        square.setWidth(6);
        square.setSides(4);
        double result2 = square.calculatePerimeter();
        square.myName("Square");
        System.out.println("the perimeter of Rectangle is: "+String.format("%.1f",result2)+" cm2\n");
    }
}
