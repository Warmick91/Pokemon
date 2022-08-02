package pokemon;

import attacks.AttackTechniques;

public abstract class Pokemon {

	protected String typeName;
	protected String name;
	protected String type;
	protected String subtype;
	protected double level; // 1.0 - 100.0
	protected double attackPower; // 0.0 - 100.0
	protected double defensePower; // 0.0 - 100.0
	protected double speed; // 0.0 - 100.0
	protected double healthPoints; // 0.0 - x
	protected double luck; // 0.0 - 100.0
	protected double critPower; // 0.0 - 100;
	
	protected double attAux;
	protected double defAux;
	protected double speedAux;
	protected double maxHealthPoints;
	protected double healthPointsAux;
	protected double luckAux;
	protected double critAux;
	protected int attackTurnsOfEffect = 0;
	protected int defenseTurnsOfEffect = 0;
	protected int speedTurnsOfEffect = 0;
	protected int healthTurnsOfEffect = 0;
	protected int luckTurnsOfEffect = 0;
	protected int criticalTurnsOfEffect = 0;
	
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

	public void setLevel(double level) {
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

	public double getMaxHealthPoints() {
		return maxHealthPoints;
	}

	public void setMaxHealthPoints(double maxHealthPoints) {
		this.maxHealthPoints = maxHealthPoints;
	}

	public double getHealthPointsAux() {
		return healthPointsAux;
	}

	public void setHealthPointsAux(double healthPointsAux) {
		this.healthPointsAux = healthPointsAux;
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

	public double getAttAux() {
		return attAux;
	}

	public void setAttAux(double attAux) {
		this.attAux = attAux;
	}

	public double getDefAux() {
		return defAux;
	}

	public void setDefAux(double defAux) {
		this.defAux = defAux;
	}

	public double getCritPower() {
		return critPower;
	}

	public void setCritPower(double critPower) {
		this.critPower = critPower;
	}

	public int getAttackTurnsOfEffect() {
		return attackTurnsOfEffect;
	}

	public void setAttackTurnsOfEffect(int attackTurnsOfEffect) {
		this.attackTurnsOfEffect = attackTurnsOfEffect;
	}

	public int getDefenseTurnsOfEffect() {
		return defenseTurnsOfEffect;
	}

	public void setDefenseTurnsOfEffect(int defenseTurnsOfEffect) {
		this.defenseTurnsOfEffect = defenseTurnsOfEffect;
	}

	public int getSpeedTurnsOfEffect() {
		return speedTurnsOfEffect;
	}

	public void setSpeedTurnsOfEffect(int speedTurnsOfEffect) {
		this.speedTurnsOfEffect = speedTurnsOfEffect;
	}

	public int getHealthTurnsOfEffect() {
		return healthTurnsOfEffect;
	}

	public void setHealthTurnsOfEffect(int healthTurnsOfEffect) {
		this.healthTurnsOfEffect = healthTurnsOfEffect;
	}

	public int getLuckTurnsOfEffect() {
		return luckTurnsOfEffect;
	}

	public void setLuckTurnsOfEffect(int luckTurnsOfEffect) {
		this.luckTurnsOfEffect = luckTurnsOfEffect;
	}

	public int getCriticalTurnsOfEffect() {
		return criticalTurnsOfEffect;
	}

	public void setCriticalTurnsOfEffect(int criticalTurnsOfEffect) {
		this.criticalTurnsOfEffect = criticalTurnsOfEffect;
	}

	public double getSpeedAux() {
		return speedAux;
	}

	public void setSpeedAux(double speedAux) {
		this.speedAux = speedAux;
	}

	public double getLuckAux() {
		return luckAux;
	}

	public void setLuckAux(double luckAux) {
		this.luckAux = luckAux;
	}

	public double getCritAux() {
		return critAux;
	}

	public void setDefCrit(double critAux) {
		this.critAux = critAux;
	}

	// Attacks pool
	public AttackTechniques[] attacktechniques = new AttackTechniques[4];

}
