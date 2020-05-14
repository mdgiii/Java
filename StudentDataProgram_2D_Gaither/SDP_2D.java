/**
 * Michael Gaither III
 * 27 February 2020
 * 6th period, AP Comp Sci
 * 
 * StudentDataProgram_2D_Gaither.java
 * Create a 2D array that stores several student's information.
 */
import java.util.Scanner;
public class SDP_2D
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many students: ");
        int studNum = scan.nextInt();
        scan.nextLine();
        int x = 1;
        String [][] array = new String [studNum][4];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("What is student #" + (i+1) + "'s name: ");
            array[i][0] = scan.nextLine();
            //scan.nextLine();
            System.out.print("What town does " + array[i][0] + " live in: ");
            array[i][1] = scan.nextLine();
            System.out.print("What state does " + array[i][0] + " live in: ");
            array[i][2] = scan.nextLine();
            System.out.print("What college did " + array[i][0] + " graduate from: ");
            array[i][3] = scan.nextLine();
       }
        while (x != 0){
        
        System.out.print("\n\n");
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + ". " + array[i][0]);

        }
        System.out.println("0. Quit\n\n");
        System.out.println("Which student would you like to choose: \n\n");
        x = scan.nextInt();
        
        if (x != 0){
          x--;
          System.out.println("Name: " + array[x][0]);
          System.out.println("Town: " + array[x][1]);
          System.out.println("State: " + array[x][2]);
          System.out.println("College: " + array[x][3]);
          System.out.println();
          x++;
       }
    }
}
}
