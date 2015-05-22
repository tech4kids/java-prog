
public class Application {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		a = 79;
		b = 86;
		c = a;
		System.out.println("a = " + a + ", b = " + b);
		a = b;
		b = c;
		System.out.println("a = " + a + ", b = " + b);
	}

}