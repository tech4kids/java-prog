import java.text.DecimalFormat;
import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		int n;
		int c;
		boolean u;

		// test first method isPrime
		Scanner scn = new Scanner(System.in);
		System.out.println("Please print integer=");
		n = scn.nextInt();
		u = isPrime(n);
		if (u == true)
			System.out.println("This number is prime");
		else
			System.out.println("This number is not prime");

		// test second method PrimeList
		System.out.println("Please enter upperbound");
		c = scn.nextInt();
		PrimeList(c);

		// close scanner
		scn.close();

	}

	static boolean isPrime(int posInt) {

		if (posInt <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(posInt); i++) {
			if (posInt % i == 0)
				return false;
		}

		return true; // prime
	}

	static void PrimeList(int Upbound) {

		int counter = 0;
		double n;

		for (int i = 2; i <= Upbound; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
				counter++;
			}

		}

		n = (double) counter / Upbound * 100;
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		System.out.println("The total prime numbers are : " + counter);
		System.out.println(Double.valueOf(twoDForm.format(n)) + "%");

	}

}// end class