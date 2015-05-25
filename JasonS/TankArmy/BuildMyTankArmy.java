import java.util.Scanner;

public class BuildMyTankArmy {
	private static Scanner in;

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		
		String newLine = System.getProperty("line.separator");
		in = new Scanner(System.in);
		System.out.println("Enter the tank's speed (in kilometers per hour):");
		a = in.nextInt();
		System.out.println(newLine + "Enter the tank's reload speed (in shells per min):");
		b = in.nextInt();
		System.out.println(newLine + "Enter the amount of damage that the tank deals in one hit:");
		c = in.nextInt();
		System.out.println(newLine + "Enter the amount of armor that the tank has (in milimeter(s)):");
		d = in.nextInt();
		System.out.println(newLine + "Enter the tank's armor penetration (in milimeters()):");
		e = in.nextInt();
		System.out.println(newLine + "Enter the amount of health that the tank has:");
		f = in.nextInt();

		Tank Tank1 = new Tank(a, b, c, d, e, f);
		System.out.println("The tank moves at " + Tank1.getSpeed()
				+ " kilometer(s) per hour." + newLine + "The tank shoots "
				+ Tank1.getReloadspeed() + " shell(s) per min." + newLine
				+ "The tank deals " + Tank1.getDamage() + " damage per hit."
				+ newLine + "The tank's has " + Tank1.getArmor()
				+ " milimeter(s) of armor." + newLine + "The tank penetrates "
				+ Tank1.getPenetration() + " milimeter(s) of armor." + newLine
				+ "The tank has " + Tank1.getHealth() + " hp." + newLine);

		int tank1speedCost = Tank1.getSpeed() * 10;
		int tank1reloadspeedCost = Tank1.getReloadspeed() * 50;
		int tank1damageCost = Tank1.getDamage();
		int tank1armorCost = Tank1.getArmor() * 50;
		int tank1penetrationCost = Tank1.getPenetration() * 50;
		int tank1healthCost = Tank1.getHealth() * 5;
		int tank1Cost = tank1speedCost + tank1reloadspeedCost + tank1damageCost
				+ tank1armorCost + tank1penetrationCost + tank1healthCost;

		System.out.println("The tank costs " + tank1Cost + " dollars.");
	}
}