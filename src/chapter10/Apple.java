package chapter10;

public class Apple extends  Fruit{
    public Apple(){
        super(130);
    }
    @Override
    public void makeJuice(){
        System.out.println("Here's is the Apple's juice");
    }

    public void removeSeeds(){
        System.out.println("We're removing the seed in the apple");
    }
}
