/**
 * use recursive function to check if a string is a palindrome
 * @author Russell
 */
import java.util.Scanner;

public class palindromeCheck {
	public static boolean compare(char x, char y){
		if (x==y){
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String S;
		System.out.println("Enter your string");
		S = input.nextLine();
		
		boolean result = true; 
		for (int i = 0; i<(S.length()-1)/2;i++){
				result = compare(S.charAt(i), S.charAt(S.length()-1-i));
		}
		
		System.out.println("Your string is a palindrome: " + result);
	}
}
