
/**
 * Michael Gaither III
 * 12 September 2019
 * 6th period, AP Comp Sci
 * 
 * firstVariablePgn_Gaither.java
 * Read three integers from the user and print their average
 */
import java.util.Scanner;
public class firstVariablePgn_Gaither
{
    public static void main(String[] args)
    {
        // declare three variables as integers for the three integers
        int num1;
        int num2;
        int num3;
        
        // declare one variable as a double for the average
        double avg;
        
        Scanner scan = new Scanner(System.in);
        
        //get three values from user
        System.out.println("Please enter three integers and" +
                            "I will compute their average");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        // compute the average
        avg = (num1 + num2 + num3) / 3;
        
        // print the average
        System.out.println("The average is " + avg);
    }
}
