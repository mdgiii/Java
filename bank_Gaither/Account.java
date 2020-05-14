/**
 * Michael Gaither III
 * 21 January 2020
 * 6th period, AP Comp Sci
 * 
 * bank_Gaither.java
 * --Account class--
 * Contains various methods of thing that you could do at a bank.
 */
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Account
{
    String name;
    int acctNum;
    double balence;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    DecimalFormat acctFor = new DecimalFormat("0000000");

    public Account(String name, int acctNum, double balence){
        this.name = name;
        this.acctNum = acctNum;
        this.balence = balence;
    }

    public void withdraw(double amount){
        balence -= amount;
        if (balence < 0){
            System.out.println(name + " has insufficient funds to withdraw " + money.format(amount) + ".\n");
            balence += amount;
        }
        else{
        System.out.println(name + " withdrew " + money.format(amount) + " from their account.\n");
    }
    }

    public void deposit(double amount){
        balence += amount;
        System.out.println(name + " deposited " + money.format(amount) + " to their account.\n");
    }

    public void getBalence(){
        System.out.println(name + "\'s current balence is: " + money.format(balence) + ".\n");
    }

    public String chargeFee(){
        balence -= 10;
        return name + " was charged a $10 service fee. " + name 
        + "\'s new balence is: " + money.format(balence) + ".\n" ;  
    }

    public void changeName(String newName){
        System.out.println(name + " has changed their name to " + newName + ".\n");
        name = newName;

    }

    public String toString(){
        return "Name: " + name + "\tAccount Number: " + acctFor.format(acctNum) + "\t\tBalence: " + money.format(balence) ;
    }

}
