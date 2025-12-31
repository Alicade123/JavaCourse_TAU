package chapter11b.interfaces;

public class InterfaceTests {
    public static void main(){
        Shape rectangle1= new Rectangle(3,4);
        System.out.println(rectangle1.getLength());;
        System.out.println(rectangle1.getWidth());;
        System.out.println(rectangle1.calculateArea());
    }
}
