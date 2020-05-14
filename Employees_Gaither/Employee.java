/**
 * Michael Gaither III
 * 31 January 2020
 * 6th period, AP Comp Sci
 * 
 * Employees_Gaither.java
 * --Employee (parent class)--
 */
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Employee
{
    protected double totalPay = 0.00;
    String lastName, firstName, jobTitle;
    double basePay;
    int id;
    DecimalFormat idFor = new DecimalFormat("0000");
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    public Employee(String lastName, String firstName, String jobTitle, double basePay)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
        this.basePay = basePay;
        this.id = randomID(10000);
    }
    
    public int randomID(int x){
        int num = (int)(Math.random()*x);
        return num;
    }
    
    public String toString(){
        return lastName + ", " + firstName + "\n"
            + "ID: " + idFor.format(id) + "\n"
            + "Job Title: " + jobTitle + "\n"
            + "Total Pay: " + money.format(totalPay) + "\n\n";
    }
}
