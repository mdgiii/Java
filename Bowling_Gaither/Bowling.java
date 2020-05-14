/**
 * Michael Gaither III
 * 28 February 2020
 * 6th period, AP Comp Sci
 * 
 * Bowling_Gaither.java
 * Create a program that uses 2D arrays to display
 * bowling scores and averages.
 */
public class Bowling
{
    public static void main(String[] args){
        int row = 0, col = 0, sum = 0, rowSum = 0, colSum = 0;
        int[][] scores = new int[5][3];
        double teamAve = 0.0;
        double [] colAverages = new double[3];
        
        // creating random scores
        for(row = 0; row < 5; row++){
            for(col = 0; col < 3; col++){
                scores [row][col] = (int) (Math.random() * 300 + 1);
                System.out.println("Bowler #" + (row + 1) +
                " Score in game #" + (col + 1) + " is " +
                scores[row][col]);
            }
        }
        
        // computing team average
        for(row = 0; row < 5; row++){
            for(col = 0; col < 3; col++){
                sum += scores[row][col];
            }
        }
        
        teamAve = (double) sum / 15;
        System.out.println("The team average is " + teamAve);
        
        //neatly display the 2D array
        for(row = 0; row < 5; row++){
            System.out.print("Bowler #" + (row + 1) + "'s scores\t");
            for(col = 0; col < 3; col++){
                System.out.print(scores[row][col] + "\t");
            }
            System.out.println();
        }
        
        //computing row averages
        for(row = 0; row < 5; row++){
            rowSum = 0;
            for(col = 0; col < 3; col++){
                rowSum += scores[row][col];
            }
            System.out.println("The total of the scores in row " +
        (row + 1) + " is " + rowSum);
        System.out.println("The average of this row is " +
        (rowSum / 3.0));
        }
        
        //computing row averages
        for(col = 0; col < 3; col++){
            rowSum = 0;
            for(row = 0; row < 5; row++){
                colSum += scores[row][col];
            }
            System.out.println("The total of the scores in column " +
        (col + 1) + " is " + colSum);
        colAverages [col] = colSum / 5.0;
        System.out.println("The average of this column is " +
        colAverages [col]);
        }
    }
}
