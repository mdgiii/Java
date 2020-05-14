/**
 * Michael Gaither III
 * 21 January 2020
 * 6th period, AP Comp Sci
 * 
 * bank_Gaither.java
 * --ManageAccounts class--
 * Create a program that simulates a bank.
 */
public class ManageAccounts
{
    public static void main(String[] args){
        Account account1 = new Account("Sally", 0000001, 1000);
        Account account2 = new Account("Joe", 0000002, 500);
        account2.deposit(100);
        account2.getBalence();
        account1.withdraw(50);
        account1.getBalence();
        System.out.println(account1.chargeFee());
        System.out.println(account2.chargeFee());
        account2.changeName("Joseph");
        account2.withdraw(700);
        System.out.print(account1);
        System.out.println();
        System.out.println();
        System.out.print(account2);
    }
}
