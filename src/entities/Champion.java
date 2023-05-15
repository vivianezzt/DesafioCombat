package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		//super();
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		if(armor > other.attack) {
			life--;
		} else {
			life -= other.attack -armor;
		}
		if(life < 0) {
			life = 0;
		}
	}
	public String status(){
		if(life == 0) {
			return name 
					+ ": "
					+ life 
					+ " de vida";
		}
		return name + ": "+ life + " de vida";
	}
}
