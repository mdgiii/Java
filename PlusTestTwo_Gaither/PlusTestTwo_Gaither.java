
/**
 * Michael Gaither III
 * 3 September 2019
 * 6th period, AP Comp Sci
 * 
 * PlusTestTwo_Gaither.java
 * Demonstrate the different behaviors of the + operator
 */
public class PlusTestTwo_Gaither
{
    //------------------------------------------------------
    //Main prints some more expressions using the + operator
    //------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("This is a long string that is the" +
                       "Concatenation of two shorter striings.");
                       
        System.out.println("The first computer was invented about" + 55 +
                           "years ago.");
                           
        System.out.println("8 plus 5 is " + 8 + 5);  // Line 20
        
        System.out.println("8 plus 5 is " + (8 + 5));   //Line 22
        
        System.out.println(8 + 5 + " equals 8 plus 5.");  //Line 24
    }
}
