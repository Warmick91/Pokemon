package attacks;

import java.util.Random;

import pokemon.Pokemon;

public class Tackle extends AttackTechniques {

	public Tackle() {
		attackName = "tackle";
		attackType = "normal";
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) {

		// Attack's chance
		double attackChance = (this.baseAttackChance + (pok1.getSpeed() + pok1.getLuck() * 0.5));
		if ((rand.nextInt(100) + 1) >= attackChance) {
			System.out.println("The attack missed!");
			return 0;
		}

		// Critical calculation
		boolean isCritical = false;
		double critChance = ((pok1.getLuck() * pok1.getAttackPower() * 0.01) - (pok2.getLuck() * 0.1)); // move to
																										// Pokemon
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

		// Effect
		if (rand.nextInt(100) + 1 <= baseGrazeChance) {
			System.out.println("Grazed!");
			return dmgValue * 0.1;
		} else {
			System.out.println("A direct hit!");
			return dmgValue;
		}
	}

}
