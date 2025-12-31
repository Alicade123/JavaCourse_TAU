package chapter4;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        final int STUDENTNO = 3;
        final int modules = 4;
        for(int i = 0; i<STUDENTNO; i++){
            int sum = 0;
            for(int j = 0; j<modules; j++){
                System.out.printf("Enter the marks for %d module of student %d: ",j+1,i+1);
                Scanner scanner = new Scanner(System.in);
                int mark = scanner.nextInt();
                sum+=mark;
            }
            System.out.printf("Average mark of student %d is %d\n\n",i+1, sum/modules);
        }
    }

}
