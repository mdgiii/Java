import java.util.Scanner;
import java.text.DecimalFormat;
public class Student{
    String name;
    String studentName;
    double score1;
    double score2;
    double avg = 0.0;
    Scanner scan = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.0");
    DecimalFormat dec2 = new DecimalFormat("0.#");
    public Student(String name, int score1, int score2){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
    }
    
    public void inputGrades(){
        System.out.print("Enter " + name + "\'s score for test #1: ");
        score1 = scan.nextDouble();
        System.out.print("Enter " + name + "\'s score for test #2: ");
        score2 = scan.nextDouble();
    }
    
    public void getAverage(){
        avg = (score1 + score2) / 2;
    }
    
    public void getName(){
        name = name;
    }
    
    public String toString(){
        return "\nStudent Name: " + name + "\t\tTest #1: " + dec2.format(score1)
                + "\tTest #2: " + dec2.format(score2) + "\tAverage is " + dec.format(avg);
    }
}