/**
 * Michael Gaither III
 * 24 January 2020
 * 6th period, AP Comp Sci
 * 
 * zoo_Gaither.java
 * --Animal class (parent)--
 */
public class Animal{
    String type;
    int age;
    String gender;
    int weightInPounds;
    
    // constructor
    public Animal(String type, int age, String gender, int weightInPounds){
        this.type = type;
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }
    
    public String toString(){
        return "I am a(n) " + type + ".\n"
              + "I am " + age + " years old.\n"
              + "I am a " + gender + ".\n"
              + "I weigh " + weightInPounds + " pounds.\n";
    }
    
    public void eat(){
        System.out.println(type + " is currently eating.\n");
    }
    
    public void sleep(){
        System.out.println(type + " has fallen asleep.\n");
    }
}