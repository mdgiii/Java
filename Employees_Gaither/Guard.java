/**
 * Michael Gaither III
 * 31 January 2020
 * 6th period, AP Comp Sci
 * 
 * Employees_Gaither.java
 * --Guard (child class of Employee)--
 */
public class Guard extends Employee
{
    private double stipend;
    public Guard(String lastName, String firstName, String jobTitle, double basePay, double stipend)
    {
        super(lastName, firstName, jobTitle, basePay);
        this.stipend = 350.00;
    }
    
    public void yearlyPay(){
        totalPay = stipend + basePay;
    }
}
