public class Tank {
	private int Speed;
	private int Reloadspeed;
	private int Damage;
	private int Armor;
	private int Penetration;
	private int Health;

	public Tank(int speed, int reloadspeed, int damage, int armor,
			int penetration, int health) {
		Speed = speed;
		Reloadspeed = reloadspeed;
		Damage = damage;
		Armor = armor;
		Penetration = penetration;
		Health = health;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setReloadspeed(int reloadspeed) {
		Reloadspeed = reloadspeed;
	}

	public int getReloadspeed() {
		return Reloadspeed;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getDamage() {
		return Damage;
	}

	public void setArmor(int armor) {
		Armor = armor;
	}

	public int getArmor() {
		return Armor;
	}

	public void setPenetration(int penetration) {
		Penetration = penetration;
	}

	public int getPenetration() {
		return Penetration;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getHealth() {
		return Health;
	}
}