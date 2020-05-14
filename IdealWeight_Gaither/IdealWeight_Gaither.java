
/**
 * Michael Gaither III
 * 24 October 2019
 * 6th period, AP Comp Sci
 * 
 * IdealWeight_Gaither.java
 * Write a program to compute the ideal weight for both males and females.
 */
import java.util.Scanner;
public class IdealWeight_Gaither
{
    public static void main(String[] args)
      {
            //declare variables
            String name;
            char gender;
            int feet, inches;
            double totalInches, idealWeight = 0.0, rangeLow, rangeHigh;
            Scanner scan = new Scanner(System.in);
            
            //get input
            System.out.print("Enter your first name: ");
            name = scan.nextLine();
            System.out.print("Enter your gender [m/f]: ");
            gender =  scan.next().charAt(0);
            if ((gender != 'm') && (gender != 'f' )&& (gender != 'M') && (gender != 'F'))
            {
                System.out.println("\nInvalid response\n");
                System.out.print("Enter your gender [m/f]: ");
                gender =  scan.next().charAt(0);
            }
            System.out.print("Enter your height in feet and inches: ");
            feet = scan.nextInt();
            inches = scan.nextInt();

            //Calculations
            totalInches = (feet * 12) + inches;
            
            // Male or female
            if ((gender == 'f') || (gender == 'F'))
            {
                if (totalInches >= 60)
                {
                idealWeight = 100 + (5 * (totalInches - 60));
                }
                else
                {
                idealWeight = 100;
               }
            }
            else if ((gender == 'm') || (gender == 'M'))
            {
                if (totalInches >= 60)
                {
                idealWeight = 106 + (6 * (totalInches - 60));
                }
                else
                {
                idealWeight = 106;
                }
            }
            
            //calculate range
            rangeLow = idealWeight * 0.85;
            rangeHigh = idealWeight * 1.15;
            
            //output
            System.out.println(name + ", you entered " + feet + " feet " +
                        inches + " inches, so your ideal weight is between " +
                        Math.round(rangeLow) + " and " + Math.round(rangeHigh) + " pounds.");
                
        }
}
