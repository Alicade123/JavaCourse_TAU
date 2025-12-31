package chapter13.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args){
    createFile();
    }
    public static void createFile(){
        File file = new File("resources/nonExisting.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
