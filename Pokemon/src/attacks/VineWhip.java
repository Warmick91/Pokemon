package attacks;

import pokemon.Pokemon;

public class VineWhip extends AttackTechniques {

	public VineWhip() {
		attackName = "Vine Whip";
		attackType = "grass";
		attackClass = "DmgDealer";
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

		// Critical calculation and final damage
		pok1.setAttAux(pok1.getAttackPower());
		boolean isCritical = false;
		double critChance = ((this.defCritChance + pok1.getLuck() - pok2.getLuck()));

		if (rand.nextInt(100) + 1 > critChance) {
			isCritical = false;
			switch (effective) {
			case 0:
				System.out.println("The attack's not very effective...");
				break;
			case 1:
				System.out.println("<Wh-tch!> Direct hit!");
				break;
			case 2:
				System.out.println("The attack's super effective!");
			}
			if (dmgValue > 0) {
				return dmgValue;
			} else {
				return 0.1;
			} // damage if not critical
		} else {
			isCritical = true;
			System.out.println("Critical damage!");
			return dmgValue + (dmgValue * (pok1.getCritPower() / 100)); // damage if critical
		}
	}
}
