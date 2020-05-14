/**
 * Michael Gaither III
 * 31 January 2020
 * 6th period, AP Comp Sci
 * 
 * Employees_Gaither.java
 * --Engineer (child class of Employee)--
 */
public class Engineer extends Employee
{
    private int travelTime;
    private double travelRate, hazardPay;
    public Engineer(String lastName, String firstName, String jobTitle, double basePay, int travelTime, double travelRate, double hazardPay)
    {
        super(lastName, firstName, jobTitle, basePay);
        this.travelTime = travelTime;
        this.travelRate = travelRate;
        this.hazardPay = hazardPay;
    }
    
    public double addTravelPay(){
        return travelTime * travelRate;
    }
    
    public double setHazardPay(){
        return hazardPay;
    }
    
    public void yearlyPay(){
        totalPay = setHazardPay() + basePay + addTravelPay();
    }
}
