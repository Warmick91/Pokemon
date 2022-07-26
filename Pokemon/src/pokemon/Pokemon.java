package pokemon;

import java.lang.reflect.Array;

public abstract class Pokemon {
	
	protected String typeName;
	protected String name;
	protected String type;
	protected String subtype;
	protected double level; // 1.0 - 100.0
	protected double attackPower; // 0.0-100.0
	protected double defensePower; // 0.0 -100.0
	protected double speed; // 0.0 - 1.0
	protected double healthPoints; // 0.0 - x
	protected double luck; //0.0-1.0

	Pokemon() {
	}

	
	// Getters and setters

	public String getTypeName() {
		return this.typeName;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	};

	public double getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public double getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public double getLuck() {
		return luck;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}
	
	//Attacks pool
	Double[] attackPool = new Double[4];
	
	// Attack
	public abstract int attack();

	public abstract int defend();
}
