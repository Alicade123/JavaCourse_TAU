package chapter13.exceptions;

import java.io.File;
import java.io.IOException;

public class RethrowException {
    public static void main (String[] args) throws Exception{
        exceptionHandlingByRethrow();
    }
    public static void  exceptionHandlingByRethrow() throws IOException {
        File file = new File("resources/file.txt");
        file.createNewFile();
    }
}
