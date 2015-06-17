package homework6;
import java.util.Scanner;
public class Primes {
	public static boolean PrimeTest(int x){
		boolean prime = true;
		for(int i = 2; i < x; i++){
			if(x % i == 0){
				prime = false;
				break;
			}
			else if(i == x){
				prime = true;
				break;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		double count = 0;
		for(int i = input1; i > 1; i--){
			if(PrimeTest(i) == true){
				//System.out.println(i);
				count = count + 1;
			}
		}
		double percent = count/input1;
		percent = percent*100;
		System.out.println(count+" number are prime");
		System.out.println(percent+" percent of the numbers are prime");
	}
}