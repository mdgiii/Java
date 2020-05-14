/**
 * Michael Gaither III
 * 11 February 2020
 * 6th period, AP Comp Sci
 * 
 * Array_Sort_Gaither.java
 * Write a program that will creates an array from
 * an user inputed integer and sorts it
 * by inceasing values and decreasing.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Array_Sort
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        //ask user for number of test being taken
        System.out.print("How many numbers would you like to store: ");
        int num = scan.nextInt();
        int[] numArray = new int[num];
        
        //runs the folowing methods
        randomArray(numArray);
        sortInc(numArray);
        sortDec(numArray);
    }
    
    //fills numArray with random values 
    public static void randomArray(int array[]){
        DecimalFormat twoDig = new DecimalFormat("00");
        System.out.print("\nSample Random Numbers Generated: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
            System.out.print(twoDig.format(array[i]) + " ");
        }
    }
    
    //sorts numArray by inceasing values
    public static void sortInc(int array[]){
        DecimalFormat twoDig = new DecimalFormat("00");
        System.out.print("\n\nThe integers in increasing order are: ");
        int x = array.length;
        for (int i = 0; i < x - 1; i++){
            for (int j =0; j< x-1; j++){
                if (array[j] > array[j+1]){
                    int y = array[j];
                    array[j] = array[j+1];
                    array[j+1] = y;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            
            System.out.print(twoDig.format(array[i]) + " ");
        }
    }
    
    //inverse of increasing is decreasing
    public static void sortDec(int array[]){
        DecimalFormat twoDig = new DecimalFormat("00");
        int rev = 0;
        for (int i = 0; i < (int)(array.length/2); i++){
            rev = array[i]; 
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = rev;
        }
        
        //prints the reversed array
        System.out.print("\n\nThe integers after being reversed: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(twoDig.format(array[i]) + " ");
        }
    }
    
}
