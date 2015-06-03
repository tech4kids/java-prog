package homework4;
public class PredPrey {
	//Making the method
	static double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n){
		//Defining the initial Hare and Lynx population
		double[] H;
		double[] L;
		H = new double[n + 1];
		L = new double[n + 1];
		H[0] = preyPred[0];
		L[0] = preyPred[1];
		//For loop to get the final population
		for(int i = 0; i < n; i++){
			//Checking if either population is 0
			if(H[i] == 0){
				L[i] = L[i] + L[i] * -b[1];
			}
			else if(L[i] == 0){
				H[i] = H[i] + H[i] * a[1];
			}
			else{
				//Where the main change is happening if both populations are present
				H[i+1] = H[i] * (1 + a[0] - a[1] * L[i]);
				L[i+1] = L[i] * (1 - b[0] + b[1] * H[i]);
			}
			//System.out.println("Hare is " + H[i+1] + "Lynx is " + L[i+1]);
		}
		//Returning the final population of the Hares and Lynx
		preyPred[0] = H[n];
		preyPred[1] = L[n];
		return preyPred;
	}
	public static void main(String[] args) {
		//Creating arrays for the parameters
		double[] PP = new double[2];
		double[] a = new double[2];
		double[] b = new double[2];
		//Now testing all of the examples to check
		PP[0] = 300;
		PP[1] = 20;
		a[0] = 0.1;
		a[1] = 0.01;
		b[0] = 0.01;
		b[1] =  0.00002;
		PP = preyPredLV(PP, a, b, 20);
		System.out.println("After 20, Hare is " + PP[0] + " and Lynx is " + PP[1]);
		PP[0] = 300;
		PP[1] = 20;
		a[0] = 0.1;
		a[1] = 0.01;
		b[0] = 0.01;
		b[1] =  0.00002;
		PP = preyPredLV(PP, a, b, 100);
		System.out.println("After 100, Hare is " + PP[0] + " and Lynx is " + PP[1]);
		PP[0] = 300;
		PP[1] = 20;
		a[0] = 0.1;
		a[1] = 0.01;
		b[0] = 0.01;
		b[1] =  0.00002;
		PP = preyPredLV(PP, a, b, 200);
		System.out.println("After 200, Hare is " + PP[0] + " and Lynx is " + PP[1]);
	}
}
