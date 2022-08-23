package Trainers;

import pokemon.Pokemon;
import potions.RegularPotion;
import potions.SuperPotion;

public class Trainer {

	protected String name;
	protected int regPotions;
	protected int supPotions;
	protected int pokeballs;
	RegularPotion regularPotion = new RegularPotion();
	SuperPotion superPotion = new SuperPotion();

	public void trainerAction(Pokemon pok1, Pokemon pok2) throws InterruptedException {
	}

	public void checkAllStats(Pokemon pok1, Pokemon pok2) {

		if (pok1.getAnyConditionTurns() != 0) {
			pok1.checkIfHasAnyCondition(pok1);
		}
		// Player's AP
		if (pok1.getAttackTurnsOfEffect() == 0) {
			// System.out.println(pok1.getName() + "'s Attack returns to
			// normal!");
			pok1.setAttackPower(pok1.getAttAux());
		} else {
			System.out.println(pok1.getAttackTurnsOfEffect());
			pok1.setAttackTurnsOfEffect(pok1.getAttackTurnsOfEffect() - 1);
		}
		System.out.print(pok1.getName() + "'s AP: " + pok1.getAttackPower() + "\t");
		System.out.println(pok2.getName() + "'s AP: " + pok2.getAttackPower()); // test to
																				// delete
		// Player's DP
		if (pok1.getDefenseTurnsOfEffect() == 0) {
			pok1.setDefensePower(pok1.getDefAux());
		} else {
			pok1.setDefenseTurnsOfEffect(pok1.getDefenseTurnsOfEffect() - 1);
		}
		System.out.print(pok1.getName() + "'s DP: " + pok1.getDefensePower() + "\t");
		System.out.println(pok2.getName() + "'s DP: " + pok2.getDefensePower()); // test to
																					// delete
		// Player's HP
		System.out.println(pok1.getName() + "'s HP: " + (int) pok1.getHealthPoints() + "\t" + pok2.getName() + "'s HP: "
				+ (int) pok2.getHealthPoints());

		// Player's Speed
		if (pok1.getSpeedTurnsOfEffect() == 0) {
			pok1.setSpeed(pok1.getSpeedAux());
		} else {
			pok1.setSpeedTurnsOfEffect(pok1.getSpeedTurnsOfEffect() - 1);
		}

		// Player's Luck
		if (pok1.getLuckTurnsOfEffect() == 0) {
			pok1.setLuck(pok1.getLuckAux());
		} else {
			pok1.setLuckTurnsOfEffect(pok1.getLuckTurnsOfEffect() - 1);
		}

		// Player's Critical Power
		if (pok1.getCriticalTurnsOfEffect() == 0) {
			pok1.setCritPower(pok1.getCritAux());
		} else {
			pok1.setCriticalTurnsOfEffect(pok1.getCriticalTurnsOfEffect() - 1);
		}
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegPotions() {
		return regPotions;
	}

	public void setRegPotions(int potions) {
		this.regPotions = potions;
	}

	public int getSupPotions() {
		return supPotions;
	}

	public void setSupPotions(int potions) {
		this.supPotions = potions;
	}

	public int getPokeballs() {
		return pokeballs;
	}

	public void setPokeballs(int pokeballs) {
		this.pokeballs = pokeballs;
	}

}
