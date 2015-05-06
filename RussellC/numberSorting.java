/**
 * Sort five user-input integers in ascending order
 * @author Russell
 */

import java.util.Scanner;

public class numberSorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[5];
		
		System.out.println("Enter your five numbers");
		
		for (int i=0; i<5; i++){
			array[i]=input.nextInt();
		}
		
		System.out.println("The five numbers you have entered are:");
		
		for (int i=0; i<5; i++){
			System.out.println(array[i]);
		}
		
		for (int i=0; i<5; i++){
			for (int j=0; j<4; j++){
				if (array[j] > array[j+1]){
					int swap = array[j];
					array[j] = array [j+1];
					array[j+1] = swap;
				}
			}
		}
		
		System.out.println("After sorting, your five integers in ascending order are:");
		
		for (int i=0; i<5; i++){
			System.out.println(array[i]);
		}
	}

}
