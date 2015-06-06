import java.util.Scanner;

class prime
{	
	boolean isPrime(int number)
	{
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}

public class Application
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numTested;
		prime number = new prime();
		System.out.println("Put in the number you want to test.");
		numTested = input.nextInt();
		input.close();
		System.out.println(number.isPrime(numTested));
	}

}
