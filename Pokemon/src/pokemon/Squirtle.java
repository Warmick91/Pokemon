package pokemon;

public class Squirtle extends Pokemon {

	public Squirtle(String name, int lvl, String sub, double attPow, double defPow, double speed, int hp, double luck,
			double critPower, double specAttPow, double specDefPow) {
		this.attAux = attPow;
		this.defAux = defPow;
		this.speedAux = speed;
		this.maxHealthPoints = hp;
		this.healthPointsAux = hp;
		this.luckAux = luck;
		this.critAux = critPower;
		this.typeName = "Squirtle";
		this.name = name;
		this.type = "water";
		this.subtype = sub;
		this.level = lvl;
		this.attackPower = attPow;
		this.defensePower = defPow;
		this.speed = speed;
		this.healthPoints = hp;
		this.luck = luck;
		this.critPower = critPower;
		this.specAttPower = specAttPow;
		this.specDefPower = specDefPow;
	}
}
