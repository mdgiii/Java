
/**
 * Michael Gaither III
 * 16 September 2019
 * 6th period, AP Comp Sci
 * 
 * FormatActivity1_Gaither.java
 * This program will format numbers
 */

import java.text.NumberFormat;
public class FormatActivity1_Gaither
{
    public static void main(String[] args)
    {
        final double TAX_RATE=0.06;
        int quantity=10;
        double unitPrice=2.50;
        double subtotal, tax, totalCost;
        
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();    //instantiating an object
        NumberFormat percent = NumberFormat.getPercentInstance();    //instantiating an object
        System.out.println("Subtotal: " + money.format(subtotal));
        System.out.println("Tax: " + money.format(tax) + " at " + percent.format(TAX_RATE));
        System.out.println("Total: " + percent.format(totalCost));
    }
}
