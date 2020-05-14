/**
 * Michael Gaither III
 * 16 January 2020
 * 6th period, AP Comp Sci
 * 
 * student_Gaither.java --Revisited--
 * A teacher wants a program to keep track of grades for students 
 * and decides to create a student class for his program.
 */
public class Grades{
    public static void main(String[] args){
        Student student1 = new Student("Mando", 0, 0);
        Student student2 = new Student("Baby Yoda", 0, 0);
        
        student1.inputGrades();
        student1.getAverage();
        System.out.println(student1.toString());
        
        System.out.println();
        student2.inputGrades();
        student2.getAverage();
        System.out.println(student2);
        
    }
}