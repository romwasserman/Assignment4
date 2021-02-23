
public class Monster {
	public double health,strength;
	Monster m = new Monster();
	
	public Monster()
	{
		this.health = 0;
		this.strength = 0;		
	}

	
	public Monster(double newHealth, double newStrength)
	{
		this.health = newHealth;
		this.strength = newStrength;
	}
	
	public double getHealth() { return m.health; }	
	public double getStrength() { return m.strength; }
	
	public void setHealth(double health) { this.health = health;}
	public void setStrength(double strength) { this.strength = strength;}
	
	public void takeDamage(double damage)
	{
		 health -= damage;
	}

	
	public double attack()
	{
		return (Math.random() * (m.getStrength()));

	}
	public boolean isAlive()
	{
		if (m.getHealth() > 0)
		{
			return true;
		}
		return false;
	}
}