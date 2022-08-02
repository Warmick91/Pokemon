package attacks;

import java.util.concurrent.TimeUnit;

import pokemon.Pokemon;

public class Growl extends AttackTechniques {
	
	public Growl() {
		attackName = "Growl";
		attackType = "normal";
		attackClass = "EnemyStatsChanger";
	}
	
	public double useSkill(Pokemon pok1, Pokemon pok2) {
		
		//Final effect
		System.out.println(pok1.getName() + " growls!");
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			try {
				TimeUnit.MILLISECONDS.sleep(600);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println("");
		
		System.out.println(pok2.getName() + "'s Attack drops!");
		pok2.setAttackPower(pok2.getAttackPower()*0.8);
		pok2.setAttackTurnsOfEffect(2);
		return 0;
	}
}
