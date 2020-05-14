/**
 * Michael Gaither III
 * 31 January 2020
 * 6th period, AP Comp Sci
 * 
 * Employees_Gaither.java
 * --Lawyer (child class of Employee)--
 */
public class Lawyer extends Employee
{
    private double courtRate, totalCourtPay;
    private int courtHours;
    public Lawyer(String lastName, String firstName, String jobTitle, double basePay, double courtRate, int courtHours)
    {
       super(lastName, firstName, jobTitle, basePay);
       this.courtRate = courtRate;
       this.courtHours = courtHours;
    }
    
    public double addCourtPay(){
        return courtHours * courtRate;
    }
    
    public void yearlyPay(){
        totalPay = addCourtPay() + basePay;
    }

}
