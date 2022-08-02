package pokemon;

public class Charmander extends Pokemon {
	
	public Charmander(String name, int lvl, String sub, double attPow, double defPow, double speed, double hp, double luck, double critPower) {
		this.attAux = attPow;
		this.defAux = defPow;
		this.speedAux = speed;
		this.maxHealthPoints = hp;
		this.healthPointsAux = hp;
		this.luckAux = luck;
		this.critAux = critPower;
		this.typeName = "Charm";
		this.name = name;
		this.type = "fire";
		this.subtype = sub;
		this.level = lvl;
		this.attackPower = attPow;
		this.defensePower = defPow;
		this.speed = speed;
		this.healthPoints = hp;
		this.luck = luck;
		this.critPower = critPower;
	}
}
