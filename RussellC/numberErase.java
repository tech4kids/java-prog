/**
 * removing values of array and print new array length
 * author@Russell
 */

import java.util.Scanner;

public class numberErase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter");
		int N = input.nextInt();
		int array[] = new int[N];
		
		System.out.println("What are your numbers");
		for (int i=0; i<N; i++){
			array[i]=input.nextInt();
		}
		
		System.out.println("What is the number you want to cancel");
		int C = input.nextInt();
		
		int count = 0;
		for (int i=0; i<N; i++){
			if (array[i] != C){
				count++;
			}
		}	
		
		int newarr[] = new int[count];
		int count_new =0;
		for (int i=0; i<N; i++){
			if (array [i] != C){
				count_new++;
				newarr[count_new-1] = array [i];
			}
		}
		
		System.out.println("The new array is ");
		for (int i=0; i<count; i++){
			System.out.println(newarr[i]);
		}
		
		System.out.println("The length of new array is " + count);
	}	
}