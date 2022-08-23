package Trainers;

import pokemon.Pokemon;

public class CPUTrainer extends Trainer {

	public CPUTrainer(String name, int regPotions, int supPotions, int pokeballs) {
		this.name = name;
		this.pokeballs = pokeballs;
		this.regPotions = regPotions;
		this.supPotions = supPotions;
	}

	public void trainerAction(Pokemon pok1, Pokemon pok2) throws InterruptedException {

		System.out.println("CPU's turn - status damage");
		if (pok1.getAnyConditionTurns() != 0) {
			pok1.checkIfHasAnyCondition(pok1);
		}
		System.out.println("CPU's action");
		// CPU's AP
		if (pok1.getAttackTurnsOfEffect() == 0) {
			// System.out.println(teams.get(name1).getName() + "'s Attack returns to
			// normal!");
			pok1.setAttackPower(pok1.getAttAux());
		} else {
			// System.out.println(teams.get(name1).getAttackTurnsOfEffect());
			pok1.setAttackTurnsOfEffect(pok1.getAttackTurnsOfEffect() - 1);
		}

		// CPU's DP
		if (pok1.getDefenseTurnsOfEffect() == 0) {
			pok1.setDefensePower(pok1.getDefAux());
		} else {
			pok1.setDefenseTurnsOfEffect(pok1.getDefenseTurnsOfEffect() - 1);
		}

		// CPU's Speed
		if (pok1.getSpeedTurnsOfEffect() == 0) {
			pok1.setSpeed(pok1.getSpeedAux());
		} else {
			pok1.setSpeedTurnsOfEffect(pok1.getSpeedTurnsOfEffect() - 1);
		}

		// CPU's Luck
		if (pok1.getLuckTurnsOfEffect() == 0) {
			pok1.setLuck(pok1.getLuckAux());
		} else {
			pok1.setLuckTurnsOfEffect(pok1.getLuckTurnsOfEffect() - 1);
		}

		// CPU's Critical Power
		if (pok1.getCriticalTurnsOfEffect() == 0) {
			pok1.setCritPower(pok1.getCritAux());
		} else {
			pok1.setCriticalTurnsOfEffect(pok1.getCriticalTurnsOfEffect() - 1);
		}
	}

}
