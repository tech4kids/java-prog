import java.util.Scanner;
public class LengthofLastWord{
	public static void main(String[] args) {
		String S;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sentence:");
		S = in.nextLine();
		int index= S.length()-1;
		int count = 0;
		while (S.charAt(index) != ' ' && index>=0) {
			count++; 
			if (index == 0) {
				break;
			} else {
				index--;
			}
		}
		System.out.println("The length of last word is "+count);
	}

}