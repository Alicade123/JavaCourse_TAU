package chapter7;

import javax.xml.transform.Result;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayBinarySearch {
    static private final int RANGE = 6;

    public static void main(String[] args){
        int[] myArray = getRandomNumbers();
        int elementTobesearched = 10;
        boolean searchResult=binarySearch(myArray, elementTobesearched);
        printArray(myArray, elementTobesearched, searchResult);
        System.out.print(Arrays.toString("avacado".split("a"))+" : "+"avacado".split("a").length);
    }
    public static int[] getRandomNumbers(){
        int[] numbers = new  int[RANGE];
        Random random = new Random();
        for(int i=0; i<RANGE;i++){
            numbers[i]=random.nextInt(1,69);
        }
        return numbers;
    }
    public static boolean binarySearch(int[] arr, int element){
        Arrays.sort(arr);
       int index= Arrays.binarySearch(arr, element);
       if(index>=0) return true;
        else return false;
    }
    public static void printArray(int [] arr, int tobeSearched,boolean searchResult){
        for(int i=0; i<RANGE; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println("The element to search was: "+tobeSearched+"\nThe search result is: "+searchResult);

    }

}
