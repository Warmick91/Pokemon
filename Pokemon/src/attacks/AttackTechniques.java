package attacks;

import pokemon.Pokemon;

public abstract class AttackTechniques {

	protected String attType = "";
	protected boolean wasCrit;
	protected double attLvl;
	protected double defLvl;
	protected double attAtt;
	protected double defDef;
	protected double attSpeed;
	protected double defSpeed;
	protected double attLuck;
	protected double defLuck;

	
	public double useSkill() {
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
	public String getAttType() {
		return attType;
	}

	public void setAttType(String attType) {
		this.attType = attType;
	}

	public boolean isWasCrit() {
		return wasCrit;
	}

	public void setWasCrit(boolean wasCrit) {
		this.wasCrit = wasCrit;
	}

	public double getAttLvl() {
		return attLvl;
	}

	public void setAttLvl(double attLvl) {
		this.attLvl = attLvl;
	}

	public double getDefLvl() {
		return defLvl;
	}

	public void setDefLvl(double defLvl) {
		this.defLvl = defLvl;
	}

	public double getAttAtt() {
		return attAtt;
	}

	public void setAttAtt(double attAtt) {
		this.attAtt = attAtt;
	}

	public double getDefDef() {
		return defDef;
	}

	public void setDefDef(double defDef) {
		this.defDef = defDef;
	}

	public double getAttSpeed() {
		return attSpeed;
	}

	public void setAttSpeed(double attSpeed) {
		this.attSpeed = attSpeed;
	}

	public double getDefSpeed() {
		return defSpeed;
	}

	public void setDefSpeed(double defSpeed) {
		this.defSpeed = defSpeed;
	}

	public double getAttLuck() {
		return attLuck;
	}

	public void setAttLuck(double attLuck) {
		this.attLuck = attLuck;
	}

	public double getDefLuck() {
		return defLuck;
	}

	public void setDefLuck(double defLuck) {
		this.defLuck = defLuck;
	}
}
