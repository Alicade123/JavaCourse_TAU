package chapter12.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
    public static void main(String[] args){
        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //Todo: iterator
//        var i = fruit.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());

        //Todo: enhanced loop
//        for(String item:fruit){
//            System.out.println(item);
//        }

        //Todo: foreach
//        fruit.forEach(x-> System.out.println(x));
//        fruit.forEach(System.out::print);
    }
    public static void mapDemo(){

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        fruitCalories.forEach ((k,v)-> System.out.println("The fruitName: "+k +" : calories: "+v));
    }
}
