
/**
 * Michael Gaither III
 * 28 October 2019
 * 6th period, AP Comp Sci
 * 
 * IdealWeightV2_Gaither.java
 * Write a program to compute the ideal weight for both males and females.
 * (Revisited)
 */
import java.util.Scanner;
public class IdealWeightV2_Gaither
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
            while (!name.equals("STOP"))
            {
                System.out.print("Enter your gender [m/f]: ");
                gender =  scan.next().charAt(0);
            if ((gender != 'm') && (gender != 'f' ) && (gender != 'M') && (gender != 'F'))
            {
                System.out.println("\nInvalid response\n");
                System.out.print("Enter your gender [m/f]: ");
                gender =  scan.next().charAt(0);
            }
            System.out.print("Enter your height in feet and inches: ");
            feet = scan.nextInt();
            inches = scan.nextInt();

            //Calculations
            totalInches = inchFt(feet, inches);
            
            // Male or female
            if ((gender == 'f') || (gender == 'F'))
            {
               idealWeight = female(totalInches);
            }
            else if ((gender == 'm') || (gender == 'M'))
            {
               idealWeight = male(totalInches);
            }
            
            //calculate range
            rangeLow = rangeL(idealWeight);
            rangeHigh = rangeH(idealWeight);
            
            //output
            System.out.println(name + ", you entered " + feet + " feet " +
                        inches + " inches, so your ideal weight is between " +
                        Math.round(rangeLow) + " and " + Math.round(rangeHigh) + " pounds.");
            
            //check if user wants to continue
            System.out.print("Enter your first name (STOP to quit): ");
            name = scan.nextLine();
            name = scan.nextLine();
         }
         System.out.println("Good Bye!");
        }
        
        //calculate total inches
        public static int inchFt(int a,int b)
        {
            int total = (a * 12) + b;
            return  total;
        }
        
        //calculate ideal weight for female
        public static double female(double x)
        {
            double weight;
             if (x >= 60)
                {
                 weight = 100 + (5 * (x - 60));
                }
                else
                {
                weight = 100;
               }
               
              return weight;
        }
        
        //calculate ideal weight for male
        public static double male(double y)
        {
            double weight;
             if (y >= 60)
                {
                 weight = 106 + (6 * (y - 60));
                }
                else
                {
                weight = 106;
               }
               
              return weight;
        }
        
        //calculate range low
        public static double rangeH(double weightL)
        {
            double range;
            range = weightL * 1.15;
            return range;
        }
        
        //calculate range high
        public static double rangeL(double weightH)
        {
            double range;
            range = weightH * 0.85;
            return range;
        }
}