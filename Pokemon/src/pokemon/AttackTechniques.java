package pokemon;

public class AttackTechniques {

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
	
	AttackTechniques(){}
	
	AttackTechniques(double attLvl, double defLvl, double attAtt, double defDef, double attSpeed,
			double defSpeed, double attLuck, double defLuck) {
		this.setAttLvl(attLvl);
		this.setDefLvl(defLvl);
		this.setAttAtt(attAtt);
		this.setDefDef(defDef);
		this.setAttSpeed(attSpeed);
		this.setDefSpeed(defSpeed);
		this.setAttLuck(attLuck);
		this.setDefLuck(defLuck);
	}

	public double tackle() {

		this.attType = "normal";
		
		// Critical calculation
		double critChance = (this.attLuck * this.attLvl * 0.1);
		double critAvoidChance = (this.defLuck * this.defLvl * 0.1);
		if (critChance > critAvoidChance) {
			this.attAtt += 0.05;
		}
		
		//Attack's process
		double dmgValue = (this.attAtt - this.defDef);
		double avoidChance = (this.defSpeed + this.defLuck);
		double attackChance = (this.attSpeed + this.attLuck);

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
