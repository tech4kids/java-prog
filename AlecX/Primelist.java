import java.util.Scanner;
public class Primelist {

	public static void main(String[] args) {
		int value;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter interger");
		value = in.nextInt();
			 for (int i = value; i > 1; i--){
				 if (Prime.isPrime(i)){
					 System.out.println(i+" is a prime number");
				 }
			 }

	}

}
