package chapter11.abstraction;

public class AbstractionTests {
    public static void main(String[] args){
        Animal blackCow = new Cow();
        Animal rocky = new Dog();
        blackCow.makeSound();
        rocky.makeSound();
    }
}
