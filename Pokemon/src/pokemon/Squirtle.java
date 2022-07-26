package pokemon;

public class Squirtle extends Pokemon {
		
	
	Squirtle(String name, int lvl, String sub, double attPow, double defPow, double speed, int hp, double luck) {
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
