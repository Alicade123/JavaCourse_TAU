package chapter5;

import java.util.Random;

public class MethodLearning {
    static private final int RANGE = 6;

    public static void main(String[] args){
        int[] myArray = getRandomNumbers();
        printArray(myArray);
    }
    public static int[] getRandomNumbers(){
        int[] numbers = new  int[RANGE];
        Random random = new Random();
        for(int i=0; i<RANGE;i++){
            numbers[i]=random.nextInt(1,69);
        }
        return numbers;
    }
    public static void printArray(int [] arr){
        for(int i=0; i<RANGE; i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
