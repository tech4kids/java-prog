import java.util.Scanner;


public class ArrayMaxMin5 {
	private static void swap(int[] array, int sort, int min){
		int c = array[sort];
		array[sort] = array[min];
		array[min] = c;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] MaxMin;
		MaxMin = new int[5];
		MaxMin[0] = input.nextInt();
		MaxMin[1] = input.nextInt();
		MaxMin[2] = input.nextInt();
		MaxMin[3] = input.nextInt();
		MaxMin[4] = input.nextInt();
		for(int i = 0; i < MaxMin.length; i++) {
			int IndexMin = i;
			for(int j = i+1; j < MaxMin.length; j++) {
				if(MaxMin[IndexMin] > MaxMin[j]) {
					IndexMin = j;
				}
			}
			System.out.println("IndexMin " + IndexMin);
			if(IndexMin != i){
				swap(MaxMin, i, IndexMin);
			}
			System.out.println("MaxMin[i] " + MaxMin[i]);
		}
		for(int i = 0; i < MaxMin.length; i++) {
			System.out.println(MaxMin[i]);
		}
	}
}
