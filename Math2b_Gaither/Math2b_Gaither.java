
/**
 * Michael Gaither III
 * 22 October 2019
 * 6th period, AP Comp Sci
 * 
 * Math2b_Gaither.java
 * Write a program that will take the square root of a
 * negative number by taking the absolute value of it first.
 */
import java.util.Scanner;
public class Math2b_Gaither
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double num;
        System.out.println("Type in a number then <Enter>");
        num = scan.nextDouble();
        
        System.out.println("num = " + num);
        System.out.println("Math.sqrt(Math.abs(num)) = " + Math.sqrt(Math.abs(num)));
    }
}
