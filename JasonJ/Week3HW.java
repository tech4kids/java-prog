import java.util.Scanner;

	public class Week3HW	{
		
		public static void main (String[] args){
		
		Scanner jason = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String a = jason.nextLine();
		String b = a.substring(a.lastIndexOf(" ")+1);
		int c = b.length();
		System.out.println("The length of the last word is "+c);
		}
	}