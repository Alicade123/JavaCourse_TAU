package chapter9;

public class Rectangle {
    protected double length ;
    protected double width;
    protected double sides ;

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
     public double calculatePerimeter(){
        return 2*((length)+(width));
     }
     //Todo : Method overloading
     public void myName(){
         System.out.println("Hei there I'm Rectangle");
     }
}
