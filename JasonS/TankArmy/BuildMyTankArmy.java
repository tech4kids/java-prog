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
				+ Tank1.getPenetration() + "." + newLine + "The tank's has "
				+ Tank1.getHealth() + " health.");
	}
}