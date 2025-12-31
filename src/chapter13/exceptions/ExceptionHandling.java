package chapter13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
    createFile();
    numberExceptionHandling();
    numberExceptionHandling2();
    }
    public static void createFile(){
        File file = new File("resources/nonExisting.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/number.txt");
        Scanner fileReader = null;
        try{
         fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            System.out.println(e.getMessage());
        }finally {
            if(fileReader!=null) fileReader.close();
        }
    }

    public static void numberExceptionHandling2(){
        File file = new File("resources/file.txt");
        try(Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNext()){
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
