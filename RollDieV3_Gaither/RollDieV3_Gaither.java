
/**
 * Michael Gaither III
 * 6 November 2019
 * 6th period, AP Comp Sci
 * 
 * RollDieV3_Gaither.java
 * Write a complete java program that simulates the rolling
 * of a pair of dice "X" times entered by the user.
 * NOW FEAT. ARRAYS!!!
 */
import java.util.Scanner;
public class RollDieV3_Gaither
{
    public static void main(String[] args)
    {
        int die1 = 0, die2 = 0, total, x = 0, totalRolls = 0;
        int[] totals = new int[11];
        
        //input number of rolls
        totalRolls = input();
        
        //loop to roll and count dice
        while (x < totalRolls)
        {
        // Roll die1
        die1 = roll(die1);
        //roll die2
        die2 = roll(die2);
        //sum the dice
        total = die1 + die2;
        //count each sum using a switch/case
        switch (total)
        {
            case 2: totals[0]++; break;
            case 3: totals[1]++; break;
            case 4: totals[2]++; break;
            case 5: totals[3]++; break;
            case 6: totals[4]++; break;
            case 7: totals[5]++; break;
            case 8: totals[6]++; break;
            case 9: totals[7]++; break;
            case 10: totals[8]++; break;
            case 11: totals[9]++; break;
            case 12: totals[10]++; break;
        }
        x++;
    }
        //output
        output(totals, totalRolls);
        
    }
    
    //input method
    public static int input(){
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of times to roll the dice: ");
        num = scan.nextInt();
        return num;
    }
    
    //Roll dice method
    public static int roll(int x)
    {
        x = ((int)(Math.random() * 6) ) + 1;
        
        return x;
    }
    
    //output method
    public static void output(int[] totals, int totalRolls){
        for (int x = 2; x < 13; x++){
            System.out.println("The number of rolls the Sum of the roll was equal to " 
                               + x + " is: " + totals[x-2] + " times.");
        }
        System.out.println("The total  number of rolls is: " + totalRolls);
    }
}
