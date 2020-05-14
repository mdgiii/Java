import java.util.Scanner;

/**
 * MagpieRunner2
 * @author YOUR NAME AND CLASS PERIOD
 */
public class MagpieRunner2
{

   /**
   * Create a Magpie, give it user input, and print its replies.
   */
   public static void main(String[] args)
   {
      Magpie2 maggie = new Magpie2();
    
      System.out.println (maggie.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();
    
      while (!statement.equals("Bye"))
      {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
      }
      System.out.println ("Good bye!");
   }// end of main method
}// end of MagpieRunner2
 