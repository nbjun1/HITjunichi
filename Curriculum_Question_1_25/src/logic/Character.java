package logic;

public class Character {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	public Character(String name, int hp, int mp, int attack, int speed, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defense = defense;
	}
		
		public void setName(String name) { this.name = name; }
		public void setHp(int hp) { this.hp = hp; }
		public void setMp(int mp) { this.mp = mp; }
		public void setAttack(int attack) { this.attack = attack; }
		public void setSpeed(int speed) { this.speed = speed; }
		public void setDefense(int defense) { this.defense = defense; }
		
		public String getName() { return name; }
		public int getHp() { return hp; }
		public int getMp() { return mp; }
		public int getAttack() { return attack; }
		public int getSpeed() { return speed; }
		public int getDefense() { return defense; }

	}

