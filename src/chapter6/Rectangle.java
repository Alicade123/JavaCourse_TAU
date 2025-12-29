package chapter6;

public class Rectangle {
    //Todo: States
    private double length;
    private double width;

    //Todo: Constructors
    public Rectangle(){
        this.length =0.0;
        this.width =0.0;
    }

    public Rectangle(double l, double w){
        this.setLength(l);
        this.setWidth(w);
    }

    //Todo: Getters and Setters
    public  double getLength(){
        return length;
    }
    public  double getWidth(){
        return length;
    }

    public void setLength(double l){
        this.length = l;
    }
    public void setWidth(double w){
        this.width= w;
    }


    //Todo: Methods
    public double calculateArea(){
        return width*length;
    }
    public double calculatePerimeter(){
        return (2*width)+(2*length);
    }

}
