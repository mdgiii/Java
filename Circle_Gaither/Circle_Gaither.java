
/**
 * Michael Gaither III
 * 12 September 2019
 * 6th period, AP Comp Sci
 * 
 * Circle_Gaither.java
 * Print the area of a circle with two different radii
 */
public class Circle_Gaither
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        
        // declare the variables
        double area1;
        double area2;
        
        // initialize first radius = 10 and initialize second radius = 20
        int rad1 = 10;
        int rad2 = 20;
        
        // calculate the area of circle with first radius
        area1 = PI * rad1 * rad1;
        
        //calculate the area of circle with second radius
        area2 = PI * rad2 * rad2;
        
        // print out the area of first circle formated as below
        System.out.println("The are of a circle with radius " + rad1 +
                        " is " + area1);
                        
        // print out the area of second circle formated as below
        System.out.println("The are of a circle with radius " + rad2 +
                        " is " + area2);
    }
}
