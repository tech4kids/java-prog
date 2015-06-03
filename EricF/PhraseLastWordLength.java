import java.util.Scanner;
/**
 * Version 1.0 ~ Enter Phrase (Spacing included)
 */
public class PhraseLastWordLength
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s; 
		System.out.println("Please Enter Your Phrase Below");
		s = input.nextLine();
		 
		System.out.println("The phrase that you typed is the following: " + s);
		
		int a = s.lastIndexOf(' ');
		int b = s.length() -(a+1);
		
		System.out.println("The length of the last term in your phrase is " + b);
	}
}
