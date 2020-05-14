
/**
 * Michael Gaither III
 * 22 October 2019
 * 6th period, AP Comp Sci
 * 
 * Math2b_Gaither.java
 * Write a program that will raise num1 to the power of
 * num2 after num2 is rounded.
 */
import java.util.Scanner;
public class Math2c_Gaither
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        System.out.println("Type in num1 - the base - then <Enter>");
        num1 = scan.nextDouble();
        System.out.println("Type in num2 - the exponent - then <Enter>");
        num2 = scan.nextDouble();
        
        System.out.println("num1 = " + num1 + " num2 + " + num2);
        System.out.println("Math.pow(num1, Math.round(num2)) = " +
                            Math.pow(num1, Math.round(num2)));
        
    }
}
