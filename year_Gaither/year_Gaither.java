
/**
 * Michael Gaither III
 * 5 December 2019
 * 6th period, AP Comp Sci
 * 
 * year_Gaither.java
 * Design a program that reads an integer value representing a year entered by the user.
 * Then determinse if said year was/is/will be a leap year.
 */
import java.util.*;
public class year_Gaither
{
    public static void main(String[] args)
    {
        String word = " ";
        int year = 0;
        Scanner scan = new Scanner(System.in);
        
        while(year != -1){
            boolean correct;
            do{
                correct = true;
                
            try {   
                System.out.print("\nEnter a year: ");
                year = scan.nextInt();  
                
                correct = false;
            }  
            catch(InputMismatchException ex) {  
                
                System.out.println("Invalid year!");
                scan.nextLine();
            }

            }while(correct);
            
            if (year > 2019){
                word = "will";}
            else if(year == 2019){
                word = "is";}
            else if(year < 2019){
                word = "was";}
            if(year != -1){    
            if (year < 1582){
                System.out.print(year + " was not part of the Gregorian calendar");
            }
            else if (year % 400 == 0){
                System.out.print(year + " " + word + " a leap year.");
            }
            else if (year % 100 == 0){
                System.out.print(year + " " + word + " not a leap year.");
            }
            else if (year % 4 == 0){
                System.out.print(year + " " + word + " a leap year.");
            }
            else{
                System.out.print(year + " " + word + " not a leap year.");
            }
        }
        
        }
        System.out.println("Bye!");
    }
    
}
