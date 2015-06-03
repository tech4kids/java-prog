public class DefineVariable {

		public static void main(String[] args) {
			int x = 10;
			int y = 20;
			int temp;
			
			System.out.println(x);
			System.out.println(y);
			temp = y;
			y = x;
			x = temp;
			System.out.println(y);
			System.out.println(x);
		}

}