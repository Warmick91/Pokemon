package attacks;

import pokemon.Pokemon;

public class Growl extends AttackTechniques {
	
	public Growl() {
		attackName = "Growl";
		attackType = "normal";
	}
	
	public double useSkill(Pokemon pok1, Pokemon pok2) {
		
		//Final effect
		System.out.println(pok2.getName() + "'s Attack drops!");
		pok2.setAttackPower(pok2.getAttackPower()*0.8);
		pok2.setAttackTurnsOfEffect(2);
		return 0;
	}
}
