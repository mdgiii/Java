/**
 * Michael Gaither III
 * 6 February 2020
 * 6th period, AP Comp Sci
 * 
 * Grades_Array_Gaither.java
 * Write a program that will keep track of grades and output the final grade.
 */
import java.util.*;
import java.text.*;
public class Grades_Array
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        DecimalFormat two = new DecimalFormat("0.00");
        int testNum;
        double avg = 0.0;
        
        //ask user for number of test being taken
        System.out.print("How many tests are you taking: ");
        testNum = scan.nextInt();
        int[] scores = new int[testNum];
        
        //Asks user for score of each test 
        for (int i = 0; i < scores.length; i++){
            System.out.print("What did you get on test #" + (i + 1) +": ");
            scores[i] = scan.nextInt();
            avg += scores[i];
        }
        avg /= scores.length;
        
        //output
        System.out.println();
        for (int i = 0; i < scores.length; i++){
            System.out.println("Test #" + (i+1) + ": " + scores[i]);
        }
        System.out.println("Grade: " + two.format(avg) + "%");
    }
}
