import java.util.Scanner;

/**
 * MagpieRunner4
 * @author YOUR NAME AND CLASS PERIOD
 */
public class MagpieRunner4
{

	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}// end of MagpieRunner4
