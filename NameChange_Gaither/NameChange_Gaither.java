/**
 * Michael Gaither III
 * 7 November 2019
 * 6th period, AP Comp Sci
 * 
 * NameChange_Gaither.java
 * Have the user enter their name with one prompt.
 * Take the name and switch it to "last, first" format.
 */
import java.util.Scanner;
public class NameChange_Gaither
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Enter your First and last name: ");
        String name  = scan.nextLine();
        
        //find where the space that seperates first from last, and last value
        int space = name.indexOf(" ");
        int length = name.length();
        
        //seperate first name from last
        String first = name.substring(0, space);
        String last = name.substring(space + 1 , length);
        
        //print output
        System.out.println(last + ", " + first);
    }
}
