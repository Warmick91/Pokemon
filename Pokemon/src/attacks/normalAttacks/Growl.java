package attacks.normalAttacks;

import attacks.AttackTechniques;
import pokemon.Pokemon;

public class Growl extends AttackTechniques {
	
	public Growl() {
		attackName = "Growl";
		attackType = "normal";
		attackClass = "EnemyStatsChanger";
	}
	
	public double useSkill(Pokemon pok1, Pokemon pok2) throws InterruptedException {
		
		//Final effect
		System.out.println(pok1.getName() + " growls!");
		waiting();
		
		System.out.println(pok2.getName() + "'s Attack drops!");
		pok2.setAttackPower(pok2.getAttackPower()*0.8);
		pok2.setAttackTurnsOfEffect(2);
		return 0;
	}
}
