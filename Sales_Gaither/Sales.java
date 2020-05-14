/**
 * Michael Gaither III
 * 6 February 2020
 * 6th period, AP Comp Sci
 * 
 * Sales_Gaither.java
 * Contains a program that prompts for and reads
 * sales for each salesperson in a company.
 */
import java.util.*;
import java.text.NumberFormat;
public class Sales{
    public static void main(String[] args){
        double salespeople = 0;
        int sum;
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //Ask for number of salespeople
        System.out.print("Enter the number of salespeople: ");
        salespeople = scan.nextDouble();
        int[] sales = new int[(int)salespeople];
        
        //ask for sales for each sales person
        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        
        //output
        System.out.println("\nSalesperson\tSales");
        System.out.println("-----------------------");
        sum = 0;
        for(int i = 0; i < sales.length; i++){
         System.out.println("\t" + (i+1) + "\t" + money.format(sales[i]));
         sum+= sales[i];
        }
        System.out.println("\nTotal sales: " + money.format(sum));
        System.out.println("Average sales: " + money.format(average(sum, salespeople)));
        System.out.println(minMax(sales));
        targetSales(sales);
    }
    
    //calculates average sales
    public static double average(int total, double sp){
        double avg = total / sp;
        return avg;
    }
    
    //caclulates min and max sales
    public static String minMax(int[] sales){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        int max = 0, min = 0, minSP = 0, maxSP = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > max){
                max = sales[i];
                maxSP = (i+1);
            }
                
        }
        min = max;
        for (int i = 0; i < sales.length; i++){
            
            if (sales[i] < min){
                min = sales[i];
                minSP = (i+1);
            }
        }
        
        return "Salesperson " + maxSP +" had the highest sale with " + money.format(max) + ".\n" +
                "Salesperson " + minSP +" had the lowest sale with " + money.format(min) + ".";
        }  
    
    //calculates user inputed target sales
    public static void targetSales(int[] sales){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        int salesVal = 0;
        System.out.print("Enter a target sales value: ");
        salesVal = scan.nextInt();
        System.out.println("The following salespersons did not meet the target sales: ");
        for (int i = 0; i < sales.length; i++){
            
            if (salesVal > sales[i])
                System.out.println("Salesperson " + (i+1) + "\t\t" + money.format(sales[i]));
        }
        
    }
}