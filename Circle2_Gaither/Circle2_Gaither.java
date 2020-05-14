
/**
 * Michael Gaither III
 * 12 September 2019
 * 6th period, AP Comp Sci
 * 
 * Circle2_Gaither.java
 * Print the area of a circle with two different radii
 */
import java.util.Scanner;
public class Circle2_Gaither
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        
        // declare the variables
        double area1;
        double area2;
        double ccf1;
        double ccf2;
        double areaRatio;
        double ccfRatio;
        int rad1;
        int rad2;
        
        Scanner scan = new Scanner(System.in);
        
        //ask user for input and store the input
        System.out.print("Enter the radius of the first circle: ");
        rad1 = scan.nextInt();
        
        System.out.print("Enter the radius of the second circle: ");
        rad2 = scan.nextInt();
        
        // calculate the area of circle with first radius
        area1 = PI * rad1 * rad1;
        
        //calculate the area of circle with second radius
        area2 = PI * rad2 * rad2;
        
        // calculate the circumference of circle with first radius
        ccf1 = 2 * PI * rad1;
        
        // calculate the circumference of circle with second radius
        ccf2 = 2 * PI * rad2;
        
        // calculate the area ratio of the second circle to thye first circle
        areaRatio = area2 / area1;
        
        // calculate the circumference raito of the second circle to the
        // first circle
        ccfRatio = ccf2 / ccf1;
        
        // print out the area of first circle formated as below
        System.out.println("The area of a circle with radius " + rad1 +
                        " is " + area1);
                        
        // print out the area of second circle formated as below
        System.out.println("The area of a circle with radius " + rad2 +
                        " is " + area2);
                        
        // print out the area ratio of second circle to the first circle formated as below
        System.out.println("The ratio of the areas of the second" +
                   " circle to the first circle is " + areaRatio);
        
        // print out the circumference of first circle formated as below
        System.out.println("The circumference of a circle with radius " + rad1 +
                        " is " + ccf1);
                        
        // print out the circumference of second circle formated as below
        System.out.println("The circumference of a circle with radius " + rad2 +
                        " is " + ccf2);
                        
        // print out the circumference ratio of second circle
        // to the first circle formated as below
        System.out.println("The ratio of the circumferences of the second" +
                   " circle to the first circle is " + ccfRatio);
    }
}