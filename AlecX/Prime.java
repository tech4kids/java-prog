/* class to detect if number is prime.
 * author: Alec Xia is awesome
 */
public class Prime {
	public static boolean isPrime(int n)
	{
		    for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
	}
}


