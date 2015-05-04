import java.util.Scanner;

public class VariableBonus {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Interger:");
		x = in.nextInt();
		System.out.println("Enter 2nd Interger:");
		y = in.nextInt();
		
		System.out.println("1st Interger is: "+x);
		System.out.println("2nd Interger is: "+y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("After Swaping, 1st Interger is: "+x);
		System.out.println("After Swaping, 2nd Interger is: "+y);

	}
	
}
