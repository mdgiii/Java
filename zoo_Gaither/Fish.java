/**
 * Michael Gaither III
 * 24 January 2020
 * 6th period, AP Comp Sci
 * 
 * zoo_Gaither.java
 * --Fish class--
 */
import java.lang.Math;
public class Fish extends Animal{
    String type, habitat;
    int age, weightInPounds, lengthInInches, finNum;
    
    // constructor
    public Fish(String type, int age, String gender, int weightInPounds, int lengthInInches, int finNum, String habitat){
        super (type, age, gender, weightInPounds);
        this.type = type;
        this.lengthInInches = lengthInInches;
        this.finNum = finNum;
        this.habitat = habitat;
    }
    
    public void swim(){
        int num = (int)(Math.random()*100);
        System.out.println(type + " swam " + num + " miles today.\n");
    }
    
    public void gotCaught(){
        System.out.println(type + " got caught by an illegal fisherman.\n");
    }
}