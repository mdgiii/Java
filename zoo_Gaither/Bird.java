/**
 * Michael Gaither III
 * 24 January 2020
 * 6th period, AP Comp Sci
 * 
 * zoo_Gaither.java
 * --Bird class--
 */
import java.lang.Math;
public class Bird extends Animal{
    String type, gender, color;
    int age, weightInPounds, heightInInches;
    double wingspanInFeet;
    
    
    // constructor
    public Bird(String type, int age, String gender, int weightInPounds, int heightInInches, String color, double wingspanInFeet){
        super (type, age, gender, weightInPounds);
        this.type = type;
        this.heightInInches = heightInInches;
        this.color = color;
        this.wingspanInFeet = wingspanInFeet;
    }
    
    
    public void fly(){
        int num = (int)(Math.random()*100);
        System.out.println(type + " flew " + num + " miles today.\n");
    }
    
    public void nest(){
        System.out.println(type + " has went to their nest.\n");
    }
}