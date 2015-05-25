/**
 * use recursive function to check if a string is a palindrome
 * @author Russell
 */
import java.util.Scanner;

public class palindromeCheck {
	public static boolean compare(String S, int i){
		if (i > S.length()/2){
			return true;
		}
		if (S.charAt(i) == S.charAt(S.length() - 1 - i)){
			i++;
			return compare(S, i);
		}else {
			return false;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your string");
		String input = in.nextLine();
		
		boolean result = compare(input, 0); 
		System.out.println("Your string is a palindrome: " + result);
	}
}
