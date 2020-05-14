
/**
 * Michael Gaither III
 * 4 November 2019
 * 6th period, AP Comp Sci
 * 
 * RollDieV2_Gaither.java
 * Write a complete java program that simulates the rolling
 * of one die 100 times.
 */
public class RollDieV2_Gaither
{
    public static void main(String[] args)
    {
        int die = 0, total, x = 0;
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        
        //loop to roll 100 times
        while (x < 100)
        {
        // Roll die1
        die = roll(die);
        
        //count each value
        if (die == 1)
            one++;
        if (die == 2)
            two++;
        if (die == 3)
            three++;
        if (die == 4)
            four++;
        if (die == 5)
            five++;
        if (die == 6)
            six++;
        x++;
        }
        
        //total the dice
        total = one + two + three + four + five + six;
        //print the output
        System.out.println("The number of times the Roll was equal to 1 is " + one);
        System.out.println("The number of times the Roll was equal to 2 is " + two);
        System.out.println("The number of times the Roll was equal to 3 is " + three);
        System.out.println("The number of times the Roll was equal to 4 is " + four);
        System.out.println("The number of times the Roll was equal to 5 is " + five);
        System.out.println("The number of times the Roll was equal to 6 is " + six);
        System.out.println("The TOTAL number of times the Die was rolles is " + total);
        
    }
    
    //Roll dice method
    public static int roll(int x)
    {
        x = ((int)(Math.random() * 6) ) + 1;
        
        return x;
    }
}
