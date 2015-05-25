import java.util.Scanner;

public class BuildMyTankArmy {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the tank's speed (in kilometers per hour):");
		a = in.nextInt();
		System.out.println("Enter the tank's reload speed (in seconds):");
		b = in.nextInt();
		System.out.println("Enter the amount of damage that the tank deals in one hit:");
		c = in.nextInt();
		System.out.println("Enter the amount of armor that the tank has:");
		d = in.nextInt();
		System.out.println("Enter the tank's armor penetration:");
		e = in.nextInt();
		System.out.println("Enter the amount of health that the tank has:");
		f = in.nextInt();

		String newLine = System.getProperty("line.separator");
		Tank Tank1 = new Tank(a, b, c, d, e, f);
		System.out.println("The tank moves at " + Tank1.getSpeed()
				+ " kilometers per hour." + newLine + "The tank takes "
				+ Tank1.getReloadspeed() + " seconds to reload." + newLine
				+ "The tank deals " + Tank1.getDamage() + " damage per hit."
				+ newLine + "The tank's armor is " + Tank1.getArmor() + "."
				+ newLine + "The tank's armor penetration is "
				+ Tank1.getPenetration() + "." + newLine + "The tank has "
				+ Tank1.getHealth() + " hp." + newLine);

		int tank1speedCost = Tank1.getSpeed();
		int tank1reloadspeedCost = Tank1.getReloadspeed();
		int tank1damageCost = Tank1.getDamage();
		int tank1armorCost = Tank1.getArmor();
		int tank1penetrationCost = Tank1.getPenetration();
		int tank1healthCost = Tank1.getHealth();
		int tank1Cost = tank1speedCost + tank1reloadspeedCost + tank1damageCost
				+ tank1armorCost + tank1penetrationCost + tank1healthCost;
		
		System.out.println("The tank costs " + tank1Cost + " dollars.");		
	}
}