package attacks.normalAttacks;

import attacks.AttackTechniques;
import pokemon.Pokemon;

public class TailWhip extends AttackTechniques {

	public TailWhip() {
		attackName = "Tail Whip";
		attackType = "normal";
		attackClass = "EnemyStatsChanger";
	}

	public double useSkill(Pokemon pok1, Pokemon pok2) throws InterruptedException {

		// Final effect
		System.out.println(pok1.getName() + " whips its tail!");
		waiting();

		System.out.println(pok2.getName() + "'s Defense drops!");
		pok2.setDefensePower(pok2.getDefensePower() * 0.8);
		pok2.setAttackTurnsOfEffect(2);
		return 0;
	}

}
