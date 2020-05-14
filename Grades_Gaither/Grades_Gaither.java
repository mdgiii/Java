
/**
 * Michael Gaither III
 * 30 September 2019
 * 6th period, AP Comp Sci
 * 
 * Grades_Gaither.java
 * Read in a sequence of grades and compute the average
 * grade, the number of passing grades (at least 60 percent)
 * and the number of failing grades.
 */
import java.util.Scanner;
public class Grades_Gaither
{
    //reads in and processes grades untill a negitive # is entered.
    public static void main(String[] args)
    {
        // Declares variables for enter grade and total sum of grades
        double totalSum, average;
        int grade;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nGrade Processing Program\n");
        
        // Declares and initializes summing and counting variables
        int numStudents = 0;
        int totalFail = 0;
        int totalPass = 0;
        int sumGrade = 0;
        
        
        // Read in the first grade
        System.out.print("Enter the first student's grade (a negative"
                        + " to quit): ");
        grade = scan.nextInt();
        
        while (grade >= 0)
        {
            // statements to calculate the sum of grades and number of students
            
            if (grade < 60)
            {
                    // calculate total number that failed
                    totalFail = totalFail + 1;
                    numStudents = numStudents + 1;
                }
            else
            {
                    // calculates total number that passed
                    totalPass = totalPass + 1;
                    numStudents = numStudents + 1;
                }
            sumGrade = sumGrade + grade;
            
            // Read the next grade
            System.out.print("Enter the next student's grade (a negative"
                        + " to quit): ");
            grade = scan.nextInt();
            
        }
        
        // calculates average
        average = sumGrade / numStudents;
        if (numStudents > 0)
        {
            // prints heading
            System.out.println("\nGrade Summary: ");
            
            // prints out the class average of the students
            System.out.println("Class Average: " + average);
            
            // prints out the number of students who passed
            System.out.println("Number of Passing Grades: " + totalPass);
            
            // prints out the number of students who failed
            System.out.println("Number of Failing Grades: " + totalFail);
            
        }
        else
        //prints out an error message when no grades entered
        System.out.println("no grades processed.");
    }
}
