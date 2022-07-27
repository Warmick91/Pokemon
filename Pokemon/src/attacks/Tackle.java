package attacks;

import pokemon.Pokemon;

public class Tackle extends AttackTechniques {	
	
	public Tackle(){
		attackName = "Tackle";
	}
	
	public double useSkill(Pokemon pok1, Pokemon pok2) {
		//this.attType = attType;
	
				// Critical calculation
				double critChance = (pok1.getLuck() * pok1.getAttackPower() * 0.1);
				double critAvoidChance = (pok2.getLuck() * pok2.getLevel() * 0.1);
				if (critChance > critAvoidChance) {
					pok1.setAttackPower(pok1.getAttackPower()+0.05); 
				}
	
				// Attack's process
				double dmgValue = (pok1.getAttackPower() - pok2.getDefensePower());
				double avoidChance = (pok2.getSpeed() + pok2.getLuck());
				double attackChance = (pok1.getSpeed() + pok1.getLuck());
	
				// Effect
				if (avoidChance > attackChance) {
					System.out.println("No hit!");
					return 0.0;
				} else if (avoidChance == attackChance) {
					System.out.println("Grazed!");
					return dmgValue * 0.1;
				} else {
					System.out.println("A direct hit!");
					return dmgValue;
				}
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}
	
}

