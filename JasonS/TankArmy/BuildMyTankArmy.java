public class BuildMyTankArmy {
	public static void main(String[] args) {
		Tank Tank1 = new Tank(1, 1, 1, 1, 1, 1);
		System.out.println("The Tank's Speed is " + Tank1.getSpeed()
				+ " kilometers per hour." + " The Tank's Reload Speed is "
				+ Tank1.getReloadspeed() + " seconds."
				+ " The Tank's Damage is " + Tank1.getDamage() + " hp per hit."
				+ " The Tank's Armor is " + Tank1.getArmor() + "."
				+ " The Tank's Penetration is " + Tank1.getPenetration() + "."
				+ " The Tank's Health is " + Tank1.getHealth() + "hp.");
	}
}
