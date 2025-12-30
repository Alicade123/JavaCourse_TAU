package chapter4;

import java.util.Scanner;

public class ForLoop {

    public  static  void  main (String[] args){
          Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter the word you want to give me to search my letter:");
        String word = scanner.nextLine();
        char letterY = 'A';
        char letterX = 'a';
        boolean found =false;
        for (int i = 0; !found && i<word.length();i++){
            if(word.charAt(i)==letterX || word.charAt(i)==letterY) found = true;
        }
        if(found) System.out.println("The letter found successful");
        else System.out.println("The letter doesn't found at all");
    }
}
