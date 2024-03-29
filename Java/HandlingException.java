package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

//This is unchecked exception (usually in runtime)
public class HandlingException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.print(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.print(e.getClass().getName() + ": / by zero");
        }
        sc.close();
    }
}