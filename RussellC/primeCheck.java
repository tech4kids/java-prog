import java.util.Scanner;
public class primeCheck {
	public static boolean isPrime(int prime) {
		for (int x = 2; x < prime; x++) {
			if (prime % x == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your upper bound");
		int prime = input.nextInt();
		int count = 0;
		for (int x = prime; x > 1; x--) {
			if(isPrime(x) == true) {
				System.out.println(x);
				count++;
			}
		}
		double y = count*100 / prime;
		System.out.println(y);
	}
	
}
