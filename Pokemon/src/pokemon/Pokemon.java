package pokemon;

import attacks.AttackTechniques;
import attacks.Tackle;

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

	public void setAttackPower(double attackPower) {
		this.attackPower = attackPower;
	}

	public double getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(double defensePower) {
		this.defensePower = defensePower;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(double healthPoints) {
		this.healthPoints = healthPoints;
	}

	public double getLuck() {
		return luck;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}
	
	//Attacks pool	
	AttackTechniques[] attacktechniques = new AttackTechniques[4];
	
	// Attack
	public abstract int attack();

	public abstract int defend();
}
