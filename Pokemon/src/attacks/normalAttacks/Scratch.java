package attacks.normalAttacks;

import attacks.AttackTechniques;
import pokemon.Pokemon;

public class Scratch extends AttackTechniques {

	public Scratch() {
		attackName = "Scratch";
		attackType = "normal";
		attackClass = "DmgDealer";
		defAccuracy = 80;
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) throws InterruptedException {

		System.out.println(pok1.getName() + " uses " + this.getAttackName() + "!");
		waiting();

		// Hit chance
		double attackChance = calcHitChance(pok1, pok2);

		if (rand.nextInt(100) + 1 > attackChance) {
			System.out.println(pok1.getName() + " missed...");
			return 0;
		}

		// Base damage
		double dmgValue = (pok1.getAttackPower() - pok2.getDefensePower());

		// Graze chance
		if (rand.nextInt(100) + 1 <= this.defGrazeChance) {
			System.out.println("Grazed!");
			System.out.println(pok1.getName() + " deals " + (int) dmgValue + " points of damage!");
			return dmgValue * 0.1;
		}

		// Critical calculation and final damage
		pok1.setAttAux(pok1.getAttackPower());
		double critChance = ((this.defCritChance + pok1.getLuck() - pok2.getLuck()));

		if (rand.nextInt(100) + 1 > critChance) {
			System.out.println("<Scratch!> Direct hit!");
			System.out.println(pok1.getName() + " deals " + (int) dmgValue + " points of damage!");
			return dmgValue; // damage if not critical
		} else {
			System.out.println("<Scraaatch!> Critical damage!");
			dmgValue = dmgValue + (dmgValue * (pok1.getCritPower() / 100));
			System.out.println(pok1.getName() + " deals " + (int) dmgValue + " points of damage!");
			return dmgValue; // damage if critical
		}

	}
}
