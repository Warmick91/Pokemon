package attacks;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import pokemon.Pokemon;

public abstract class AttackTechniques {

	protected String attackName = "";
	protected String attackType = "";
	protected String attackClass = "";
	protected double defAccuracy;
	protected double defGrazeChance = 20;
	protected double defCritChance = 20;

	protected double conditionChance;
	protected boolean causesCondition = false;

	protected Random rand = new Random();
	

	public double useSkill(Pokemon x, Pokemon y) throws InterruptedException {
		return 0;
	}
	
	protected double calcHitChance(Pokemon pok1, Pokemon pok2) {
		return (defAccuracy + pok1.getLuck()) - ((pok2.getLuck() / 100) * pok2.getSpeed());
	}
	
	public void informSlotEmpty() {
		JOptionPane.showMessageDialog(null, "No move has been allotted here!");
	}

	// check for condition
	public boolean checkConditionChance(Pokemon pok1, Pokemon pok2) {
		if (pok1.getSpecAttPower() > pok2.getSpecDefPower()) {
			return true;
		} else {
			return false;
		}
	}

	public static void waiting() throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(300);
		}
		System.out.println("");
	}

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

	public String getAttackClass() {
		return attackClass;
	}

	public void setAttackClass(String attackClass) {
		this.attackClass = attackClass;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
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
