package hw_week_three;

import java.util.Scanner;

public class Week_3_HW {

	public static void main(String[] args) {
		System.out.println("This program will count the numbers of characters in the last word you wrote.");
		System.out.println("Type a line of text.");
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] bits = line.split(" ");
		String parts = bits[bits.length - 1];
		int length = parts.length();
		System.out.println(length);
		input.close();
	}
}

