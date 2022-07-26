package pokemon;

public class Charmander extends Pokemon {
	
	Charmander(String name, int lvl, String sub, double attPow, double defPow, double speed, double hp, double luck) {
		this.typeName = "Charmander";
		this.name = name;
		this.type = "fire";
		this.subtype = sub;
		this.level = lvl;
		this.attackPower = attPow;
		this.defensePower = defPow;
		this.speed = speed;
		this.healthPoints = hp;
		this.luck = luck;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defend() {
		// TODO Auto-generated method stub
		return 0;
	}
}
