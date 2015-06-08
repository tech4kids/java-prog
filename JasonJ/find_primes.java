package Week6HW;

import java.util.Scanner;

public class find_primes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an upper bound for finding primes");
		int upper_bound = input.nextInt();
		int counts_primes = 0;
		
		System.out.println("The primes in the bound are: ");
		for (int i = 2; i <= upper_bound; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				counts_primes++;
			}
		}
		
		double percent_found = (double) counts_primes / upper_bound * 100;
		System.out.println(counts_primes+" primes have been found, "+percent_found+"% are primes");
	}

	static boolean isPrime(int posInt) {
		
		for (int a = 2; a < posInt; a++) {
			if (posInt % a == 0) {
				return false;
			}
		}
		return true;
	}
}