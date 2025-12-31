package chapter11b.interfaces;

public class Rectangle implements Shape{
    public Rectangle(double w, double l){
        setLength(l);
        setWidth(w);
    }
    double length;
    double width;

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public void setLength(double length) {
    this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return (width*length);
    }

}
