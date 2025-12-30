package chapter10;

public class Banana extends Fruit{
    public Banana(){
        super(300);
    }
    @Override
    public void makeJuice(){
        System.out.println("Here's is the banana's juice");
    }
    public void peel(){
        System.out.println("The banana is being peeled");
    }
}
