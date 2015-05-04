
// Jeffrey Lin's homework, week two

import java.util.Scanner;

public class Swap_class {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		x=10;
		y=20;
		
		//print the value of x and y
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//ask user to input 2 variables
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter first vlue x=");
	    x = scn.nextInt();
	    System.out.println("Enter second vlue y=");
	    y = scn.nextInt();
		
		
		
		//swap value
		z=x;
		x=y;
		y=z; 
		
		//After you swap the value becomes 
		System.out.println("After you swap the value becomes");
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		scn.close();
		
	}

}
