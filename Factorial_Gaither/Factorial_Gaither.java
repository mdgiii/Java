/**
 * Michael Gaither III
 * 17 October 2019
 * 6th period, AP Comp Sci
 * 
 * Factorial_Gaither.java
 * Write a program that asks the user for a non-negative integer and computes
 * and prints the factorial of that integer
 */
import java.util.Scanner;
public class Factorial_Gaither
{
    //main method
    public static void main(String[] args)
    {
        // initialize and declare input and output variables
        int num = 0;
        int fact = 0;
        
        // go to input method
        num = loopStat(num);
        
        // -99 stops the program
        while (num  != -99)
        {
            // validation loop for negative numbers
            while (num < 0)
            {
                num = negative(num);
                
            }
            
            // calculation loop
            fact = valid(num);
            
            
            // Output
            System.out.println(num + "! = " + fact);
            
            // run loop again?
            num = loopStat(num);
        }
    }
    
    //negative
    public static int negative(int n)
    {
        // custom error message
        System.out.println("Invalid response. Please enter a positive number");
        
        // try again
        n = loopStat(n);
        return n;
    }
    
    //input method
    public static int loopStat(int m)
    {
        //get input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to be factorialized: ");
        m = scan.nextInt();
        return m;
    }
    
    //check if zero method
    public static int valid(int y)
    {
    //check if zero
    if (y == 0)
        {
            y = zero(y);
            
        }
    // if not zero calculate normally
         y = factorial(y);
        return y;
        
    }
    
    //zero method
    public static int zero(int z)
    {
        // 0! = 1
        z = 1;
        return z;
    }
    
    //factorial method
    public static int factorial(int x)
    {
        // Initialize counter and factorial numbers
        int a;
        int fact = 1;
        
        // loop to calculate factorial
        for (a = 1; a <= x; a++)
        {
            fact *= a;
        }
        return fact;
    }
    
}
