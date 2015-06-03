package hw_week_three_palindrome;

import java.util.Scanner;

public class Week_3_Palindrome {
	public static void main(String[] args) {
		System.out.println("This is a palindrome detector.");
		System.out.println("Please write a line of text.");
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		StringBuffer aline = new StringBuffer(line);
		StringBuffer reverse = aline.reverse();
		String newreverse = reverse.toString();
		boolean palindrome = true;
		char[] first = line.toCharArray();
		char[] second = newreverse.toCharArray();

		int minLength = Math.min(first.length, second.length);

		for (int i = 0; i < minLength; i++) {
			if (first[i] != second[i]) {
				System.out.println("You did not type in a palindrome.");
				palindrome = false;
				break;
			}
		}
		if (palindrome == true) {
			System.out.println("You typed in a palindrome.");
		}
		input.close();
	}

}
