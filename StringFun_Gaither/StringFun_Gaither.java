
/**
 * Write a description of class StringFun_Gaither here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringFun_Gaither
{
    public static void main(String[] args)
    {
        int charNum, endIndex, offset;
        char letter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Phrase: ");
            String phrase = scan.nextLine();
        System.out.print("What character do you want?: ");
            char charCh = phrase.charAt(charNum = scan.nextInt());
        System.out.print("Character " + charNum + " is: " + charCh);
        System.out.print("\nPlease enter your full name: ");
            String name = scan.nextLine();
            name = scan.nextLine();
            int compare = phrase.compareTo(name);
        System.out.print("\nComparing the two strings: " + compare);
        System.out.print("\nConcatenating the two strings:\n" + phrase + name);
            boolean equal = phrase.equals(name);
            
        if(equal == true)
            System.out.println("\nThe two stings are equal (case sensitive)");
        else if(equal == false)
            System.out.println("\nThe two stings are not equal (case sensitive)");
        boolean equalIC = phrase.equalsIgnoreCase(name);
        if(equalIC == true)
            System.out.println("\nThe two stings are equal (ignoring case)");
        else if(equalIC == false)
            System.out.println("\nThe two stings are not equal (ignoring case)");
        
        System.out.print("\nWhat letter are you looking for in the first phrase? ");
        int letterPos = phrase.indexOf(letter =  scan.next().charAt(0));
        System.out.print(letter + " first occurs at: " + letterPos);
        System.out.print("\nWhat letter do you want replaces with the letter x? ");
        String newPhrase = phrase.replace(letter =  scan.next().charAt(0), 'x');
        System.out.print("\nThe new phrase is:\n" + newPhrase);
        System.out.print("\nWhat substring do you want (put a space in between the number)? ");
        newPhrase = phrase.substring(offset =  scan.nextInt(), endIndex = scan.nextInt());
        System.out.println(newPhrase);
        System.out.print("\nStarting at what number do you want to start a " +
                    "substring that goes to the end of the phrase? ");
        newPhrase = phrase.substring(offset =  scan.nextInt());
        System.out.println(newPhrase);
        System.out.print("\nLowercase: \n" + phrase.toLowerCase());
        System.out.print("\nUppercase: \n" + phrase.toUpperCase());
    }
}
