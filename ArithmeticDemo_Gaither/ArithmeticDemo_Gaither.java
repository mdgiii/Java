
/**
 * Michael Gaither III
 * 9 September 2019
 * 6th period, AP Comp Sci
 * 
 * ArithmeticDemo_Gaither.java
 * The goal of this exercise is to develop a program that will provide convienient
 * methods for reading values of various types.
 */
import java.util.Scanner;
public class ArithmeticDemo_Gaither
{
    public static void main(String[] args)
    {
        // declare five int variablesthat will be used to hold input values and their sum, difference, and average
        
        int firstNum, secondNum, sum, diff;
        double avg;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");         //enters first number
        firstNum = input.nextInt();
        
        System.out.print("Please enter another integer: ");         //enters second number
        secondNum = input.nextInt();
        
        sum = firstNum + secondNum ;
        diff = firstNum - secondNum;
        avg = sum / 2;
        
        System.out.println("The sum \t" + firstNum + "+" + secondNum + "=" + sum);
        System.out.println("The difference \t" + firstNum + "-" + secondNum + "=" + diff);
        System.out.println("The average \t" + firstNum + "+" + secondNum + "=" + avg);
    }
}
