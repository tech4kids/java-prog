/**
 * @author Russell C
 */

import java.util.Scanner;

public class getInputFromUser {
	public static void main(String[] args) {
		int x=10; int y=20;
		System.out.println("The values of the variables are "+"x="+x+" and y="+y);
		
	/**Extra Homework
	 * Input two numbers and swap them
	 */
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your 1st integer:");
		a = in.nextInt();
		System.out.println("What is your 2nd integer:");
		b = in.nextInt();
		System.out.println("Your integers are "+a+" and "+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping, your integers are "+a+" and "+b);
	}
}

