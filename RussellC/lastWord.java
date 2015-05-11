/*
 * find the length of the last word in the string
 * @author Russell C
 */
import java.util.Scanner;

public class lastWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String phrase; 
		System.out.println("What is your phrase");
		phrase = input.nextLine();
		 
		System.out.println("Your input phrase is " + phrase);
		
		int a = phrase.lastIndexOf(' ');
		int b = phrase.length() -(a+1);
		System.out.println("The length of last word in your phrase is " + b);
	}
}
		
		
