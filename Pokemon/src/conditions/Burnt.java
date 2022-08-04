package conditions;

import pokemon.Pokemon;

public class Burnt extends Condition {

	Pokemon pok;

	public Burnt(Pokemon pok, int passedDuration) {
		this.pok = pok;
		pok.setHasBurntCondition(true);
		pok.setBurntConditionTurns(passedDuration);
		if (pok.getAnyConditionTurns() < passedDuration) {
			pok.setHasAnyCondition(true);
			pok.setAnyConditionTurns(passedDuration);
		}
		System.out.println(pok.getName() + " has been burnt!");
		System.out.println(pok.getName() + " takes " + ((int) (pok.getHealthPoints() * 0.05))
				+ " damage from the burnt condition!");
		pok.setHealthPoints(pok.getHealthPoints() - pok.getHealthPoints() * 0.05);

	}

}
