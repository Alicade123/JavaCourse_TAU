package chapter10;

public class MarketPolymorphismTests {
    public static void main(String[] args){
        MarketPolymorphismTests market = new MarketPolymorphismTests();
        Fruit fruit = new Fruit(100);
        fruit.makeJuice();


        System.out.print("\n");
        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();

        System.out.print("\n");
        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();

        Fruit greenOne = new Apple();
        greenOne.makeJuice();
        ((Apple)greenOne).removeSeeds();
        market.sellFruit(greenOne);

        greenOne = new Banana();
        greenOne.makeJuice();
        ((Banana)greenOne).peel();
        market.sellFruit(greenOne);
    }
        public void sellFruit(Fruit fruit){
            System.out.println();
        if(fruit instanceof  Banana) System.out.println("\t-The banana juice is sold");
        else if(fruit instanceof  Apple) System.out.println("\t-The apple juice is sold");

    }
}
