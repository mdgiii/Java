
/**
 * Michael Gaither III
 * 7 October 2019
 * 6th period, AP Comp Sci
 * 
 * Salary_Gaither.java
 * Computes the amount of a raise and the new
 * salary for an employee. The current salary
 * and a performance rating (a string: "excellent",
 * "Good", or "poor" are input.
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary_Gaither
{
    public static void main(String[] args)
    {
        double currentSalary = 1.00;    //employee's current salary
        double raise = 0.0;            //amount of the raise
        double newSalary;             //new salary for the employee
        int rating;                  //performance rating
        boolean check = false;
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        
        
         //While loop to keep program running
        //stops when currentSalary = 0
        while (currentSalary > 0)
        {
            
            System.out.print("Enter a number for the performance rating " +
                    "(1 for Excellent, 2 for good, or 3 for poor): ");
                    rating = scan.nextInt();
    
                    //compute raise using if
                    while (!check)
                    {
                    if (rating == 1)
                    {
                        raise = 1.06;
                        check = true;
                    }
                    else if (rating == 2)
                    {
                        raise = 1.04;
                        check = true;
                    }
                    else if (rating == 3)
                    {
                        raise = 1.015;
                        check = true;
                    }
                    else
                        {   
                        check = false;
                        System.out.print("Invalid rating. " +
                                "1 for Excellent, 2 for good, or 3 for poor: ");
                        rating = scan.nextInt();
                
                    }
                }
            
            //Calculations
            newSalary = currentSalary * raise;
            raise = newSalary - currentSalary;
            
            //print the results
            System.out.println();
            System.out.println("Current Salary:" +
                    money.format(currentSalary));
            System.out.println("Amount of your raise:" +
                    money.format(raise));
            System.out.println("Your new Salary:" +
                money.format(newSalary));
                
            // Continue?
            System.out.print("\nEnter the current salary: ");
            currentSalary = scan.nextDouble();
            check = false;
        }
}
}