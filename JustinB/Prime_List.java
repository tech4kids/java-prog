import java.util.Scanner;
class primeList
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
	public void getList(int number)
	{
		for(int a = 0; a < number; a++)
		{
			if(isPrime(number-a) == true)
			{
				System.out.println((number - a));
			}
		}		
	}
}

public class Prime_List {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		primeList List1 = new primeList();
		System.out.println("put in the upper bound");
		number = input.nextInt();
		input.close();
		List1.getList(number);
	}
}
