public class BuildMyTankArmy {
	public static void main(String[] args) {
		Tank Tank1 = new Tank(1, 1, 1, 1, 1, 1);
		String newLine = System.getProperty("line.separator");
		System.out.println("The tank moves at " + Tank1.getSpeed()
				+ " kilometers per hour." + newLine + "The tank takes "
				+ Tank1.getReloadspeed() + " seconds to reload." + newLine
				+ "The tank deals " + Tank1.getDamage() + " damage per hit."
				+ newLine + "The tank's armor is " + Tank1.getArmor() + "."
				+ newLine + "The tank's armor penetration is "
				+ Tank1.getPenetration() + "." + newLine + "The tank has "
				+ Tank1.getHealth() + " health." + newLine);

		int tank1speedCost = Tank1.getSpeed();
		int tank1reloadspeedCost = Tank1.getReloadspeed();
		int tank1damageCost = Tank1.getDamage();
		int tank1armorCost = Tank1.getArmor();
		int tank1penetrationCost = Tank1.getPenetration();
		int tank1healthCost = Tank1.getHealth();
		int tank1Cost = tank1speedCost + tank1reloadspeedCost + tank1damageCost
				+ tank1armorCost + tank1penetrationCost + tank1healthCost;

		Tank Tank2 = new Tank(12, 13, 14, 15, 16, 17);
		System.out.println("The tank moves at " + Tank2.getSpeed()
				+ " kilometers per hour." + newLine + "The tank takes "
				+ Tank2.getReloadspeed() + " seconds to reload." + newLine
				+ "The tank deals " + Tank2.getDamage() + " damage per hit."
				+ newLine + "The tank's armor is " + Tank2.getArmor() + "."
				+ newLine + "The tank's armor penetration is "
				+ Tank2.getPenetration() + "." + newLine + "The tank has "
				+ Tank2.getHealth() + " health." + newLine);

		int tank2speedCost = Tank2.getSpeed();
		int tank2reloadspeedCost = Tank2.getReloadspeed();
		int tank2damageCost = Tank2.getDamage();
		int tank2armorCost = Tank2.getArmor();
		int tank2penetrationCost = Tank2.getPenetration();
		int tank2healthCost = Tank2.getHealth();
		int tank2Cost = tank2speedCost + tank2reloadspeedCost + tank2damageCost
				+ tank2armorCost + tank2penetrationCost + tank2healthCost;
		int totalCost = tank1Cost + tank2Cost;
		
		System.out.println("The cost of tank 1 is "+ tank1Cost + " dollars." + newLine + "The cost of tank 2 is " + tank2Cost + " dollars." + newLine + "The total cost of both tanks is " + totalCost + " dollars.");
	}
}