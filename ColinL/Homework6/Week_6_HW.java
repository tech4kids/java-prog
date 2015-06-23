package week6;

import java.util.Scanner;

public class Week_6_HW {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a whole number up to 10000.");
		System.out
				.println("This program will first detect if the number is prime, then list out all the primes before this number and what percentage of the numbers before the inputted number are prime");
		int Number = number.nextInt();
		if (Number <= 0) {
			System.out
					.println("Your number did not meet the specific requirements. Program ended");
			System.exit(0);
		} else if (Number > 10000) {
			System.out
					.println("Your number did not meet the specific requirements. Program ended");
			System.exit(0);
		}
		boolean isprime = true;
		int searchend = Number / 2;
		if (Number != 1) {
			for (int i = 2; i <= searchend; i++) {
				if (Number % i == 0) {
					isprime = false;
				}
			}
			if (isprime == true) {
				System.out.println("Your number is prime.");
			} else
				System.out.println("Your number is composite");
		} else
			System.out.println("Your number is neither prime or composite");

		double counter = 0;
		System.out.println("Now all primes will be listed");
		for (int j = Number - 1; j > 0; j--) {
			boolean primelist = true;
			int listsearchend = j / 2;
			for (int k = 2; k <= listsearchend; k++) {
				if (j % k == 0) {
					primelist = false;
				}
			}
			if (primelist == true) {
				if (j != 1) {
					counter++;
					System.out.println(j);
				}

			}
		}
		double divisor = Number - 1;
		double percentage = counter / divisor;
		percentage = percentage * 100;
		System.out.println(percentage + "% of the numbers before " + Number
				+ " are prime.");
		number.close();
	}

}
