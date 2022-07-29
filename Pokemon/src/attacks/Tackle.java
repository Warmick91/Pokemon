package attacks;

import java.util.Random;

import pokemon.Pokemon;

public class Tackle extends AttackTechniques {

	public Tackle() {
		attackName = "Tackle";
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) {
		// this.attType = attType;

		// Critical calculation
		pok1.setAttAux(pok1.getAttackPower());
		boolean isCritical = false;
		double critChance = ((pok1.getLuck() * pok1.getAttackPower() * 0.01) - (pok2.getLuck() * 0.1)); // move to Pokemon
		double critAvoidChance = (pok2.getLuck() * pok2.getLevel() * 0.1);
		Random rand = new Random();
		if (rand.nextInt(100) + 1 <= critChance) {
			isCritical = true;
		}
		if (isCritical == true) {
			pok1.setAttackPower(pok1.getAttackPower() + pok1.getAttackPower() * pok1.getCritPower());
		} else {
			pok1.setAttackPower(pok1.getAttAux());
		}

		// Attack's process
		double dmgValue = (pok1.getAttackPower() - pok2.getDefensePower());
		double avoidChance = (pok2.getSpeed() + pok2.getLuck());
		double attackChance = (pok1.getSpeed() + pok1.getLuck());

		// Effect
		if (avoidChance > attackChance) {
			System.out.println("No hit!");
			return 0.0;
		} else if (avoidChance == attackChance) {
			System.out.println("Grazed!");
			return dmgValue * 0.1;
		} else {
			System.out.println("A direct hit!");
			return dmgValue;
		}
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

}
