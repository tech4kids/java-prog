import java.util.Scanner;


public class Application
{

	public static void main(String[] args)
	{
		int charCount = 0;
		Scanner input = new Scanner(System.in);
		String counter;
		System.out.println("Enter a line");
		counter = input.nextLine();
		input.close();
		char arraycounter[] = counter.toCharArray();
		int length = counter.length();

		for(int i = 0; i < length; i++)
		{
			if(arraycounter[i] == ' ')
			{
				charCount = 0;
			}
			else
			{
				charCount = charCount + 1;
			}
		}
		System.out.println(charCount);

	}

}