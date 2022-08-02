package attacks;

import java.util.Random;

import pokemon.Pokemon;

public class Tackle extends AttackTechniques {

	public Tackle() {
		attackName = "Tackle";
		attackType = "normal";
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) {

		// Hit chance
		double attackChance = ((pok1.getAttackPower() + pok1.getLuck()) / (pok2.getAttackPower() + pok2.getLuck())
				* 100);

		if (rand.nextInt(100) + 1 > attackChance) {
			System.out.println("No hit!");
			return 0;
		}

		// Base damage
		double dmgValue = (pok1.getAttackPower() - pok2.getDefensePower());

		// Graze chance
		if (rand.nextInt(100) + 1 <= this.defGrazeChance) {
			System.out.println("Grazed!");
			return dmgValue * 0.1;
		}

		// Critical calculation and final damage
		pok1.setAttAux(pok1.getAttackPower());
		boolean isCritical = false;
		double critChance = ((this.defCritChance + pok1.getLuck() - pok2.getLuck()));

		if (rand.nextInt(100) + 1 > critChance) {
			isCritical = false;
			System.out.println("<Bam!> Direct hit!");
			return dmgValue; // damage if not critical
		} else {
			isCritical = true;
			System.out.println("<Baaam!> Critical damage!");
			return dmgValue + (dmgValue * (pok1.getCritPower() / 100)); // damage if critical
		}

	}
}
