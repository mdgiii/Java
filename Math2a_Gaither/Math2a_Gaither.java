
/**
 * Michael Gaither III
 * 22 October 2019
 * 6th period, AP Comp Sci
 * 
 * Math2a_Gaither.java
 * Write a program that explores the diffrent methods
 * under the class Math.
 */
import java.util.Scanner;
import java.lang.Math;
public class Math2a_Gaither
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double num = 0;
        while (num !=-99){
        System.out.println("Type in a number then <Enter>");
        num = scan.nextDouble();
        
        System.out.println("Num = " + num);
        System.out.println("Math.round(num) = " + Math.round(num));
        System.out.println("Math.sqrt(num) = " + Math.sqrt(num));
        System.out.println("Math.abs(num) = " + Math.abs(num));
        System.out.println("Math.ceil(num) = " + Math.ceil(num));
        System.out.println("Math.floor(num) = " + Math.floor(num));
        System.out.println("Math.pow(num, 2) = " + Math.pow(num, 2));
        System.out.println("Math.pow(num, 3) = " + Math.pow(num, 3));
        System.out.println("Math.pow(num, num) = " + Math.pow(num, num));
    }
    }
}
