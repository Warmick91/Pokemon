package pokemon;

public class Charmander extends Pokemon {

	Charmander(String name, int lvl, String sub, int attPow, int defPow, int speed, double agility, int hp,
			double luck) {
		this.name = name;
		this.type = "fire";
		this.subtype = sub;
		this.level = lvl;
		this.attackPower = attPow;
		this.defensePower = defPow;
		this.speed = speed;
		this.agility = agility;
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
