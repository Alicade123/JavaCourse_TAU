package chapter13.exceptions;


public class OptionalIndependentExercise {
    /*
    Optional Independent Exercise:
    =============================
    Your optional exercise for this chapter is to write the following statement
    — int c = 30/0 — within a program and execute it.
    When you execute this, you'll see an exception, so I want you to update that program to handle the exception.
    Then print a statement after the division to say, "Division is fun."
    This statement should be outputted no matter what happens in your program.
    Good luck.
     */
    public static void main(String[] args){
        solution();
    }
    public static void solution(){
        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("The division with zero is impossible in Mathematics");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Division is fun.");
        }
    }
}
