package pokemon;

import attacks.Tackle;

public class Bulbasaur extends Pokemon {

	public Bulbasaur(String name, int lvl, String sub, double attPow, double defPow, double speed, int hp, double luck) {
		this.typeName = "Bulbasaur";
		this.name = name;
		this.type = "grass";
		this.subtype = sub;
		this.level = lvl;
		this.attackPower = attPow;
		this.defensePower = defPow;
		this.speed = speed;
		this.healthPoints = hp;
		this.luck = luck;
		
		//Attacks pool
		this.attacktechniques[0] = new Tackle();
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
