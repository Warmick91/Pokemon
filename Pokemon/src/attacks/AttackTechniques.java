package attacks;

import java.util.Random;

import pokemon.Pokemon;

public abstract class AttackTechniques {

	protected String attackName = "";
	protected String attackType = "";
	protected double defGrazeChance = 20;
	protected double defCritChance = 20;
	
	protected Random rand = new Random();
	
	public double useSkill(Pokemon x, Pokemon y) {
		return 0;
	};

	// public double scratch() {
//		this.attType = "normal";
//	}
//
//	public double growl() {
//		this.attType = "normal";
//	}
//
//	public double vineWhip() {
//		this.attType = "grass";
//	}
//
//	public double ember() {
//		this.attType = "fire";
//	}
//
//	public double waterGun() {
//		this.attType = "water";
//	}	

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attName) {
		this.attackName = attName;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttType(String attType) {
		this.attackType = attType;
	}

	public double getDefGrazeChance() {
		return defGrazeChance;
	}

	public void setDefGrazeChance(double defGrazeChance) {
		this.defGrazeChance = defGrazeChance;
	}

	public double getDefCritChance() {
		return defCritChance;
	}

	public void setDefCritChance(double defCritChance) {
		this.defCritChance = defCritChance;
	}
}
