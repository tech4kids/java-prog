/**
 * Use Predator-Prey model to calculate population of hares and lynxes
 * @author Russell
 */
public class population{
	static double[] preyPredLV(double [] preyPred, double[] a, double[] b, int n) {
		
		for (int i = 1; i <= n; i++) {
			double temp = preyPred[0];
			preyPred[0] = preyPred[0]*(1+a[0]-a[1]*preyPred[1]); 
			preyPred[1] = preyPred[1]*(1-b[0]+b[1]*temp);
		}
		return preyPred;
	}
	
	public static void main(String[] args) {
		double preyPred[] = new double [2];
		double a[] = new double[2];
		double b[] = new double[2];
		int n;
		
		a[0] = 0.1;
		a[1] = 0.01;
		b[0] = 0.01;
		b[1] = 0.00002;

		n = 1;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);

		n = 2;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);
		
		n = 20;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);
      }
}
