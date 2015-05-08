import java.util.Scanner;


public class MaxMin {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter five values for Maximum + Minimum");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		if (a > b) {
			a = b;
		}
		if (a > c) {
			a = c;
		}
		if (a > d) {
			a = d;
		}
		if (a > e) {
			a = e;
		}
		if (b < c) {
			b = c;
		}
		if (b < d) {
			b = d;
		}
		if (b < e) {
			b = e;
		}
		System.out.println("Maximum = " + a);
		System.out.println("Minimum = " + b);
	}
}
