import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number_Int;
		System.out.println("Enter amount of numbers to be inputed into the array.");
		number_Int = input.nextInt();
		int[] Values = new int[number_Int];
		for(int i =0; i < Values.length; i++)
		{
			System.out.println("enter a number.");
			Values[i] = input.nextInt();
		}
		int numbertobetaken;
		System.out.println("Enter the number you want to get rid of in the array.");
		numbertobetaken = input.nextInt();
		input.close();
		int numbertosub = 0;
		int array_Lengthnew;
		for(int a = 0; a < Values.length; a++)
		{
			if(Values[a] == numbertobetaken)
			{
				numbertosub++;
			}
		}
		array_Lengthnew = Values.length - numbertosub;
		System.out.println("The new amount of numbers in the array is " + array_Lengthnew);

	}

}
