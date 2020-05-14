
/**
 * Michael Gaither III
 * 3 September 2019
 * 6th period, AP Comp Sci
 * 
 * PlusTestOne_Gaither.java
 * Demonstrate the different behaviors of the + operator
 */
public class PlusTestOne_Gaither
{
    // ------------------------------------------------
    //main prints some expressions using the + operator
    // ------------------------------------------------
    public static void main(String[] args)
    {
        String str;
            
            str = "Roswell" + "Rocks!";
            System.out.print(str);
            
            str = "Countdown: " + 5 + 4 + 3 + 2 + 1 + 0;
            System.out.print(str);
            
            str = 1 + 2 + 3 + "Go!";
            System.out.print(str);
    }
}
