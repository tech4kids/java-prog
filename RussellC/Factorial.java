/**
 * use recursive function to solve factorial problem
 * @author Russell
 */

import java.util.Scanner;

public class Factorial {
	public static int f(int x) {
		if (x>1) {
			return x*f(x-1);
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
	
	    System.out.println("Enter a positive integer");
	    int a = input.nextInt();
	    int F = f(a);
	    System.out.println("The factorial of your number is " + F);
	}

}
