package pokemon;

public class Squirtle extends Pokemon {
		
	
	public Squirtle(String name, int lvl, String sub, double attPow, double defPow, double speed, int hp, double luck, double critPower) {
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
