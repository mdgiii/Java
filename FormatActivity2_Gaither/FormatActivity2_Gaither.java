
/**
 * Michael Gaither III
 * 16 September 2019
 * 6th period, AP Comp Sci
 * 
 * FormatActivity2_Gaither.java
 * This program will format numbers with various decimal places
 */

import java.text.DecimalFormat;
public class FormatActivity2_Gaither
{
    public static void main(String[] args)
    {
        double num1 = 2.5;
        double num2 = 123.4567;
        
        DecimalFormat test1 = new DecimalFormat("0.00");
        DecimalFormat test2 = new DecimalFormat("00.###");
        DecimalFormat test3 = new DecimalFormat("00.00000");
        DecimalFormat test4 = new DecimalFormat("###.0#");
        
        System.out.println("Test1 with 2.5 and 0.##: " + test1.format(num1));
        System.out.println("Test1 with 123.4567 and 0.##: " + test1.format(num2));
        System.out.println("Test2 with 2.5 and 00.###: " + test2.format(num1));
        System.out.println("Test2 with 123.4567 and 00.###: " + test2.format(num2));
        System.out.println("Test3 with 2.5 and 00.00000: " + test3.format(num1));
        System.out.println("Test3 with 123.4567 and 00.00000: " + test3.format(num2));
        System.out.println("Test4 with 2.5 and ###.0#: " + test4.format(num1));
        System.out.println("Test4 with 123.4567 and ###.0#: " + test4.format(num2));
    }
}
