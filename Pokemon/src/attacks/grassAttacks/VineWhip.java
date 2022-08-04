package attacks.grassAttacks;

import attacks.AttackTechniques;
import pokemon.Pokemon;

public class VineWhip extends AttackTechniques {

	public VineWhip() {
		attackName = "Vine Whip";
		attackType = "grass";
		attackClass = "DmgDealer";
		defAccuracy = 60;
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) throws InterruptedException {

		System.out.println(pok1.getName() + " uses " + this.getAttackName() + "!");
		waiting();

		// Hit chance
		double attackChance = calcHitChance(pok1, pok2);

		if (rand.nextInt(100) + 1 > attackChance) {
			System.out.println("No hit!");
			return 0;
		}

		// Base damage
		int effective = 1; // 0 - ineffective, 1 - regular, 2 - effective
		double dmgValue = 0;
		if (pok2.getType() == "water" || pok2.getType() == "ground" || pok2.getType() == "rock") {
			dmgValue = (pok1.getAttackPower() - (pok2.getDefensePower() - pok2.getDefensePower() * 0.3)); // StrongAgainst
			effective = 2;
			// System.out.println("The attack's super effective!");
		} else if (pok2.getType() == "fire" || pok2.getType() == "grass" || pok2.getType() == "poison"
				|| pok2.getType() == "flying" || pok2.getType() == "bug" || pok2.getType() == "dragon") {
			dmgValue = (pok1.getAttackPower() - (pok2.getDefensePower() + pok2.getDefensePower() * 0.3)); // WeakAgainst
			effective = 0;
			// System.out.println("The attack's not very effective...");
		} else {
			dmgValue = pok1.getAttackPower() - pok2.getDefensePower(); // RegularAgainst
		}

		// Graze chance
		if (rand.nextInt(100) + 1 <= defGrazeChance) {
			System.out.println("Grazed!");
			dmgValue = dmgValue * 0.1;

			if (dmgValue > 0) {
				System.out.println(pok1.getName() + " deals " + (int)dmgValue + " points of damage!");
				return dmgValue;
			} else {
				System.out.println(pok1.getName() + " deals pratically no points of damage!");
				return 0.1;
			}
		}

		// Critical calculation and final damage
		pok1.setAttAux(pok1.getAttackPower());
		double critChance = ((defCritChance + pok1.getLuck() - pok2.getLuck()));

		if (rand.nextInt(100) + 1 > critChance) {
			switch (effective) {
			case 0:
				System.out.println("The attack's not very effective...");
				break;
			case 1:
				System.out.println("<Wh-tch!> Direct hit!");
				break;
			case 2:
				System.out.println("The attack's super effective!");
				break;
			}
			if (dmgValue > 0) {
				System.out.println(pok1.getName() + " deals " + (int)dmgValue + " points of damage!");
				return dmgValue; // damage if not critical
			} else {
				System.out.println(pok1.getName() + " deals pratically damage...");
				return 0.1;
			} // damage if not critical
		} else {
			System.out.println("Critical damage!");
			dmgValue = dmgValue + (dmgValue * (pok1.getCritPower() / 100));
			if (dmgValue > 0) {
				System.out.println(pok1.getName() + " deals " + (int)dmgValue + " points of damage!");
				return dmgValue; // damage if critical
			} else {
				System.out.println(pok1.getName() + " deals pratically no damage...");
				return 0.1;
			}
		}
	}
}
