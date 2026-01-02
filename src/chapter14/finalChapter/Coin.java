package chapter14.finalChapter;

import java.util.Random;

public class Coin {

    private String side;
    public static String HEAD="Head";
    public static String TAIL="Tail";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    public String flip(){

        if(new Random().nextBoolean()) setSide(HEAD);
        else setSide(TAIL);
        return getSide();
    }
}
