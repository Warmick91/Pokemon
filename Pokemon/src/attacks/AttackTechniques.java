package attacks;

import pokemon.Pokemon;

public abstract class AttackTechniques {

	protected String attackName = "";
	protected String attackType = "";

	public double useSkill(Pokemon x, Pokemon y) {
		return 0;
	};

	//	public double scratch() {
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
}
