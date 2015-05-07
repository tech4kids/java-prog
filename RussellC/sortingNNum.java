/**
 * Sort N user-input integers in ascending order
 * @author Russell
 */

import java.util.Scanner;

public class sortingNNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you wish to enter");
		int N = input.nextInt();
;		
		int array[] = new int[N];
		
		System.out.println("Enter your numbers");
		
		for (int i=0; i<N; i++){
			array[i]=input.nextInt();
		}
		
		System.out.println("The numbers you have entered are:");
		
		for (int i=0; i<N; i++){
			System.out.println(array[i]);
		}
		
		for (int i=0; i<N; i++){
			for (int j=0; j<(N-1); j++){
				if (array[j] > array[j+1]){
					int swap = array[j];
					array[j] = array [j+1];
					array[j+1] = swap;
				}
			}
		}
		
		System.out.println("After sorting, your integers in ascending order are:");
		
		for (int i=0; i<N; i++){
			System.out.println(array[i]);
		}
	}

}
