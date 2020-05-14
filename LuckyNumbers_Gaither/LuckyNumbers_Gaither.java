
/**
 * Michael Gaither III
 * 1 November 2019
 * 6th period, AP Comp Sci
 * 
 * LuckyNumbers_Gaither.java
 * To generate three random "Lucky" numbers
 */
public class LuckyNumbers_Gaither
{
    public static void main(String[] args)
    {
        int lucky1, lucky2, lucky3;
        
        // Generate lucky1 (a random integer between 50 and 79
        lucky1 = ((int)(Math.random() * 30) ) + 50;
        
        // Generate lucky1 (a random integer between 90 and 100
        lucky2 = ((int)(Math.random() * 11) ) + 90;
        
        // Generate lucky1 (a random integer between 11 and 30
        lucky3 = ((int)(Math.random() * 19) ) + 11;
        System.out.println("Your lucky numbers are " + lucky1 + ", " + lucky2
                            + ", " + lucky3 + "!");

    }
}
