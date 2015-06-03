import java.util.Scanner;
public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for x: ");
		int x = input.nextInt();
		System.out.println("Enter a value for y: ");
		int y = input.nextInt();
		int temp;
		
		System.out.println("Before SWAP!");
		System.out.print("x = ");
		System.out.println(x);
		System.out.print("y = ");
		System.out.println(y);
		// I would put a more extensive comment here, but
		//it's not necessary XD
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("");
		System.out.println("After SWAP!");
		System.out.print("x = ");
		System.out.println(x);
		System.out.print("y = ");
		System.out.println(y);
	}

}
