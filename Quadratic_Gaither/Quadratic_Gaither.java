
/**
* Michael Gaither III
 * 9 September 2019
 * 6th period, AP Comp Sci
 * 
 * Quadratic_Gaither.java
 * A program to solve any quadratic using the quadratic formula.
 */
import java.util.Scanner;
public class Quadratic_Gaither
{
    public static void main(String[] args)
    {
        int a, b, c;   //ax^2 + bx + c
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the coefficent of x squared: ");
        a = scan.nextInt();
        
        System.out.print("Enter the coefficent of x: ");
        b = scan.nextInt();
        
        System.out.print("Enter the constant: ");
        c = scan.nextInt();
        
        // Use the quadratic formula to compute the roots.
        // assumes a positive discriminant - no imaginary solutions
        
        double discriminant = (b * b) - (4 * a * c);
        double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
        
        System.out.print("Root #1: " + root1);
        System.out.print("Root #2: " + root2);
    }
}
