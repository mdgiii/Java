
/**
 * Michael Gaither III
 * 4 December 2019
 * 6th period, AP Comp Sci
 * 
 * MinMaxGrade_Gaither.java
 * The user is to create a simple gradebook that will keep track of a stucents grades
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class MinMaxGrade_Gaither
{
    public static void main(String[] args)
    {
        // declare variables
        int  x = 0, score = 0;
        int high = 0, low = 100;
        double avg = 0.0, totalScore = 0.0 , numGrades = 0;
        Scanner scan = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        
        //input
        System.out.print("Enter the number of tests: ");
        numGrades = scan.nextInt();
        
        //while loop to enter user inputed amount of grades
        while (x < numGrades){
            System.out.print("Enter the Score for a test: ");
            score = scan.nextInt();
            totalScore = totalScore + score;
            
            if(score < low){
                low = score;
            }
            x++;
        }
        
        //calculate average
        avg = totalScore / numGrades;
        
        //ouuput part 1
        System.out.println("Final Grade" + low);
        System.out.println("Percent: " + dec.format(avg) + "%");
        System.out.println("Grade: " + letter(avg));
        
        //calculate average with lowest score is removed
        avg = (totalScore - low) / (numGrades - 1.00);
        
        //ouuput part 1
        System.out.println("Final Grade after removing lowest test score");
        System.out.println("Percent: " + dec.format(avg) + "%");
        System.out.println("Grade: " + letter(avg));
    }
    
    //method to calculate letter grade
    public static String letter(double x)
    {
        String let = " ";
        if (x >= 90)
             let = "A";
        else if (x >= 80)
             let = "B";
        else if (x >= 70)
             let = "C";
        else if (x >= 60)
             let = "D";
        else if (x < 60)
             let = "F";
        return let;
    }
}
