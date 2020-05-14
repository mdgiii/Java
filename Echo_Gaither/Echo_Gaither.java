
/**
 * Michael Gaither III
 * 9 September 2019
 * 6th period, AP Comp Sci
 * 
 * Echo_Gaither.java
 * The goal of this exercise is to develop a program that will provide convienient
 * methods for reading values of various types.
 */
import java.util.Scanner;

public class Echo_Gaither     //Reads a character string from user and prints it
{
    public static void main(String[] args)
    {
        String message;   //Declares variable message of type string
        Scanner input = new Scanner(System.in); //
        
        System.out.print("Enter a line of text:");
        message = input.nextLine();
        
        System.out.print("You entered: \"" + message + "\"");
    }
}
