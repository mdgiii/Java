import java.util.Scanner;

/**
 * MagpieRunner3
 * @author YOUR NAME AND CLASS PERIOD
 */
public class MagpieRunner3
{

    public static void main(String[] args)
    {
        // ************************************************************
            // ******** StringExplorer part of Magpie Activity 3 **********
        // ************************************************************

        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);
        
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        
        // Using indexOf when the desired substring is not found
        
        // Using indexOf to find multiple occurrences of the desired substring


        // **************************************************************
            // ******** END OF StringExplorer part of Magpie Activity 3 *****
        // **************************************************************
            
            System.out.println("\n\n\n\n");   // blank lines in output to separate parts of program

        Magpie3 maggie = new Magpie3();
        
        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        while (!statement.equals("Bye"))
        {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}// end of MagpieRunner3
