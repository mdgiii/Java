/**
 * Michael Gaither III
 * 28 February 2020
 * 6th period, AP Comp Sci
 * 
 * BowlingRevisited_Gaither.java
 * Create a program that uses 2D arrays to display
 * bowling scores and averages.
 * --Revisited
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BowlingRevisited
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat round = new DecimalFormat("0");
        int row = 0, col = 0, sum = 0, high = 0, hBowler = 0, teamScore = 0, hABowler = 0;
        double hAvg = 0.0;
        System.out.print("What is the name of your bowling team: ");
        String teamName = scan.nextLine();
        System.out.print("How many bowlers on " + teamName + " are playing: ");
        row = scan.nextInt();
        System.out.print("How many games will be played: ");
        col = scan.nextInt();
        int[][] scores = new int[row][col];
        double[] avg = new double[row];
        
        // creating random scores and display scores
        for(row = 0; row < scores.length; row++){
            System.out.print("Bowler #" + (row + 1) +
                " Scores: ");
            for(col = 0; col < scores[0].length; col++){
                scores [row][col] = (int) (Math.random() * 300 + 1);
                System.out.print("\t" + scores[row][col]);
            }
            
            //sorts
            int x = scores[0].length - 1;
            for (int i = 0; i < x; i++){
                for (int j =0; j < x; j++){
                    if (scores[row][j] < scores[row][j+1]){
                        int y = scores[row][j];
                        scores[row][j] = scores[row][j+1];
                        scores[row][j+1] = y;
                    }
                }
            }
            
            //three top average
            avg[row] = (scores[row][0] + scores[row][1] + scores[row][2]) / 3.0;
            System.out.print("\tAverage of the highest 3 games = " + round.format(avg[row]));
            
            //Highest average
                if(avg[row] > hAvg){
                hAvg = avg[row];
                hABowler = row;
               }
            System.out.println();
        }
        
        //Highest individual score
        for(int i = 0; i < scores.length; i++){
            if (scores[i][0] > high){
                high = scores[i][0];
                hBowler = i;
            }
        }
        
        //some output
        System.out.println("Bowler #" + (hBowler + 1) + " on team " + teamName + " had the highest "
                            + "inividual game score of " + high);                   
        System.out.println("Bowler #" + (hABowler + 1) + " on team " + teamName + " had the highest "
                            + "average of " + round.format(hAvg));
        double tAvg = (avg[0] + avg[1] + avg[2]) / 3.0; 
        System.out.println(teamName + "'s team score is " + round.format(tAvg));
    }
}
