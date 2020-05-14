
/**
 * Michael Gaither III
 * 4 November 2019
 * 6th period, AP Comp Sci
 * 
 * RollDice_Gaither.java
 * Write a complete java program that simulates the rolling
 * of a pair of dice.
 */
public class RollDice_Gaither
{
    public static void main(String[] args)
    {
        int die1 = 0, die2 = 0, total;
        
        // Roll die1
        die1 = roll(die1);
        
        // Roll die2
        die2 = roll(die2);
        
        //total the dice
        total = die1+ die2;
        
        //print the output
        System.out.println("You rolled a " + die1 + " and a "
                            + die2 + ". The sum of the dice is " + total + ".");

    }
    
    //Roll dice method
    public static int roll(int x)
    {
        x = ((int)(Math.random() * 6) ) + 1;
        
        return x;
    }
}
