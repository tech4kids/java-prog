/**
 * take integer and return the number of 1 bits (binary)
 * @author Russell
 */

import java.util.Scanner;

public class findingOne {
	public static int f(int x) {
		if (x == 1){
			return +1;
		}
		else if (x % 2 == 1){
			return 1+f(x/2);
		}
		else
			return 0+f(x/2);
		}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you integer");
		int N = input.nextInt();
		int one = f(N);
		System.out.println("The number of 1 bits in your number is " + one);
	}

}
