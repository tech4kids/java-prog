package DEFAULT;
import java.util.Scanner;

public class Week3Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Phrase");
		String p = input.nextLine();
		int x = p.lastIndexOf(' ');
		int y = p.length() - (x+1);
		if (y == 0){
			System.out.println("0");
		}
		else{
			System.out.println(y);
		}
	
	}
}
