package chapter9;

public class Square extends Rectangle{
    //Todo : Method overriding
    @Override
    public double calculatePerimeter(){
        return (sides*sides);
    }

    //Todo : Method overloading
    public void myName(String name){
        System.out.println("Hei there I'm "+name);
    }
}
