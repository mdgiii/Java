/**
 * Michael Gaither III
 * 24 September 2019
 * 6th period, AP Comp Sci
 * 
 * Paint_Gaither.java
 * Determine how much paint is needed to paint the walls
 * of a room given its length, width, and height.
 */
import java.text.*;
import java.util.*;
import java.lang.Math;
public class Paint_Gaither
{
   public static void main(String[] args)
   {
       final int COVERAGE = 350;    // paint covers 350 square feet/gal
       final double WINDOW_SQFT = 15; // each window occupies 15 sqft
       final double DOOR_SQFT = 20; // each door occupies 20 sqft
       final double PAINTPRICE = 25;  //paint costs $25 a gallon
       
       // Declare doubles length, width, height, windows, and doors
       double length, width, height;
       int windows = 0;
       int doors = 0;
       int x = 1;
       
       // Declare double totalSqFt, paintNeeded, and totalPrice.
       double totalSqFt, paintNeeded, totalPrice;
       
       // Declare and initialize Scanner object, decimal format, and number format.
       Scanner scan = new Scanner(System.in);
       DecimalFormat decFor = new DecimalFormat("0.00");
       NumberFormat money = NumberFormat.getCurrencyInstance();
       
       //while loop to restart program
       while (x != -99)
       {
       
           // Prompt for and reed in the length of the room
           System.out.println("\f\t----- Painting a Room Calculator -----\n\n");
           System.out.print("\t\tPlease enter the length of the room: ");
           length = scan.nextDouble();
           
           //Validate width
       if (length <= 0)
        {
           while (length <= 0)
           {
            System.out.print("\n\t\tPlease enter a positive value for length of the room: ");
            length = scan.nextDouble();
        }
       }

              
       // Prompt for and reed in the width of the room
       System.out.print("\t\tPlease enter the width of the room to the nearest foot: ");
       width = scan.nextDouble();
       
       //Validate width
       if (width <= 0)
       {
           while (width <= 0)
           {
            System.out.print("\n\t\tPlease enter a positive value for width of the room: ");
            width = scan.nextDouble();
        }
       }
            
       // Prompt for and reed in the height of the room
       System.out.print("\t\tPlease enter the height of the room: ");
       height = scan.nextDouble();
       
       //Validate height
       if (height <= 0)
       {
           while (height <= 0)
           {
            System.out.print("\n\t\tPlease enter a positive value for height of the room: ");
            height = scan.nextDouble();
        }
       }
       
       // Code checks to see that an Int number of windows was entered
       boolean windowInput = true;
        do
        {
           try
           {
               System.out.print("\t\tPleace enter the number of windows in the room: ");
               windows = scan.nextInt();
               windowInput = false;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("\n\t\tTry again. The number of windows needs to be a whole number.");
                scan.nextLine(); //Discard input
            }
        }
        while (windowInput);
        
       // Code checks to see that an Int number of windows was entered
       boolean doorInput = true;
        do
        {
           try
           {
               System.out.print("\t\tPleace enter the number of doors in the room: ");
               doors = scan.nextInt();
               doorInput = false;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("\n\t\tTry again. The number of doors needs to be a whole number.");
                scan.nextLine(); //Discard input
            }
        }
        while (doorInput);
       
       // Compute the total square feet to be painted--think
       //abot the dimensions of each wall
       totalSqFt = (width * height)* 2 + (length * height) * 2 - (doors*DOOR_SQFT) - (windows*WINDOW_SQFT) ;
       
       // Compute the amount of paint needed
       paintNeeded = totalSqFt / COVERAGE;
       totalPrice = Math.ceil(paintNeeded) * PAINTPRICE;
       
       // Print the output
       System.out.println("\f\t----- Painting a Room Calculator -----\n\n");
       System.out.println("\t\tLength of room: " + length + "ft.");
       System.out.println("\t\tWidth of room: " + width + "ft");
       System.out.println("\t\tHeight of room: " + height + "ft");
       System.out.println("\t\tThe number of windows is " + windows + ".\n\t\tThe number of doors is " +
                            doors);
       System.out.println("\n\t\tTotal square feet to be painted is " + decFor.format(totalSqFt) + " ft\u00B2.");
       System.out.println("\t\tThe amount of paint needed is " + decFor.format(paintNeeded) + " Gallons.");
       System.out.println("\t\tYou need to purchase " + Math.ceil(paintNeeded) + " Gallons.");
       System.out.println("\t\tThe cost to pain the room will be " + money.format(totalPrice));
                            
       
       //while loop question                     
       System.out.print("\n\t\tDo you wish to run the program again (1 for yes, -99 for no): ");
       x = scan.nextInt();
       windowInput = true;
       doorInput = true;
    }
}
}