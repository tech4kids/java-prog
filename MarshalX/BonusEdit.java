package DEFAULT;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BonusEdit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y = 5;
		int j;
		int maximum = 100;
		int [] Array;
		Array = new int[5];
		for(int i = 0; i < y; i++){
			Array[i] = (int)(Math.random()*maximum);
			System.out.println(Array[i]);
		}
		System.out.println("Input # to remove");
		int x = input.nextInt();	
		for(int i = 0; i < y; i++){
			if(Array[i] == x){
				Array[i] = Array[y-1];
				y--;
				i--;
			}
		}
		for(int i = 0; i < y; i++){
			System.out.println(Array[i]);
		}
	}
}
