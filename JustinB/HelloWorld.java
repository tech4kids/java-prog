

public class HelloWorld
{

	public static double myFsactorial( int integer)
	{
		if( integer == 1)
			return 1;
		else
		{
			return(((double)integer)*(myFsactorial(integer - 1)));
		}
	} 
	public static void main(String[] args)
	{
		int a = 7;
		double x = myFsactorial(a);
		System.out.println(x);
	}

}