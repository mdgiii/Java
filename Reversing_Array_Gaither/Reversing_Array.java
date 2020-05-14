/**
 * Michael Gaither III
 * 10 February 2020
 * 6th period, AP Comp Sci
 * 
 * Reversing_Array_Gaither.java
 * Write a program that will creates an array from
 * an user inputed integer and reverses it.
 */
import java.util.Scanner;
public class Reversing_Array
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //ask user for number of test being taken
        System.out.print("How many numbers would you like to store: ");
        int num = scan.nextInt();
        int[] numArray = new int[num];
        
        //Asks user for score of each test 
        for (int i = 0; i < numArray.length; i++){
            System.out.print("Please enter in \"" + numArray.length + "\" integers: ");
            numArray[i] = scan.nextInt();
        }
        
        //prints the original array
        System.out.print("The integers you entered are: ");
        for (int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }
        
        //reverses the array
        int rev = 0;
        for (int i = 0; i < (int)(numArray.length/2); i++){
            rev = numArray[i]; 
            numArray[i] = numArray[numArray.length - 1 - i];
            numArray[numArray.length - 1 - i] = rev;
        }
        
        //prints the reversed array
        System.out.print("\n\nThe integers after being reversed: ");
        for (int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }
    }
}
