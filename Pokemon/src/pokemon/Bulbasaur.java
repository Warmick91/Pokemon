package pokemon;

import attacks.EmptyAttack;
import attacks.grassAttacks.VineWhip;
import attacks.normalAttacks.Growl;
import attacks.normalAttacks.Tackle;

public class Bulbasaur extends Pokemon {

	public Bulbasaur(String name, int lvl, String sub, double attPow, double defPow, double speed, int hp, double luck,
			double critPower, double specAttPow, double specDefPow) {
		this.attAux = attPow;
		this.defAux = defPow;
		this.speedAux = speed;
		this.maxHealthPoints = hp;
		this.healthPointsAux = hp;
		this.luckAux = luck;
		this.critAux = critPower;
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
		this.critPower = critPower;
		this.specAttPower = specAttPow;
		this.specDefPower = specDefPow;

		// Attacks pool
		this.attacktechniques[0] = new Tackle();
		this.attacktechniques[1] = new VineWhip();
		this.attacktechniques[2] = new Growl();
		this.attacktechniques[3] = new EmptyAttack();
	}

}
