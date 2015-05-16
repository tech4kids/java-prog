package javaweek3;
import java.util.Scanner;
public class LastWordLength {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Phrase");
			String p = input.nextLine();
			int position = p.indexOf(" ");
			position = p.lastIndexOf(" ");
			System.out.println(" position of space ="+ position);
			System.out.println(" p = "+p);
			System.out.println(" last index of space = "+ position);
			String lastword = p.substring(position);
			System.out.println(lastword);
			if (lastword.length()==0)
				System.out.println(0);
			else 
				System.out.println(lastword.length());
			
			}	
}


