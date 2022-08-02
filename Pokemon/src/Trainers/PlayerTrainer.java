package Trainers;

import javax.swing.JOptionPane;

import pokemon.Pokemon;
import potions.RegularPotion;
import potions.SuperPotion;

public class PlayerTrainer {
	private String name;
	private int regPotions;
	private int supPotions;
	private int pokeballs;
	RegularPotion regularPotion = new RegularPotion();
	SuperPotion superPotion = new SuperPotion();

	public PlayerTrainer(String name, int regPotions, int supPotions, int pokeballs) {
		this.name = name;
		this.pokeballs = pokeballs;
		this.regPotions = regPotions;
		this.supPotions = supPotions;
	}

	// Action prompt method
	public static String chooseActionPrompt() {
		String actionChoice = JOptionPane.showInputDialog(
				"Choose action:\r\n 1) Attack\r\n 2) Defend\r\n 3) Use potion\r\n 4) Throw a pokeball");
		return actionChoice;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegPotions() {
		return regPotions;
	}

	public void setRegPotions(int potions) {
		this.regPotions = potions;
	}

	public int getSupPotions() {
		return supPotions;
	}

	public void setSupPotions(int potions) {
		this.supPotions = potions;
	}

	public int getPokeballs() {
		return pokeballs;
	}

	public void setPokeballs(int pokeballs) {
		this.pokeballs = pokeballs;
	}

	// Execute attack method
	boolean stopLoop;
	double dmgDone;

	public void executeAttack(Pokemon x, Pokemon y, int arraySlot) {
		if (x.attacktechniques[arraySlot-1].getAttackName() == "---") {
			JOptionPane.showMessageDialog(null, "No move has been allotted here!");
		} else if (x.attacktechniques[arraySlot-1].getAttackClass() == "DmgDealer") {
			System.out.println(x.getName() + " uses " + x.attacktechniques[arraySlot-1].getAttackName() + "!");
			dmgDone = x.attacktechniques[arraySlot-1].useSkill(x, y);
			y.setHealthPoints(y.getHealthPoints() - dmgDone);
			System.out.println(x.getName() + " deals " + dmgDone + " points of damage!");
			stopLoop = true;
		} else {
			System.out.println(x.getName() + " uses " + x.attacktechniques[arraySlot-1].getAttackName() + "!");
			x.attacktechniques[arraySlot-1].useSkill(x, y);
			stopLoop = true;
		}
	}

	// Actions
	public void orderAttack(Pokemon x, Pokemon y) {
		stopLoop = false;
		while (stopLoop == false) {
			String attackTypeChoice = JOptionPane
					.showInputDialog("Attacks:\r\n1) " + x.attacktechniques[0].getAttackName() + "\r\n2) "
							+ x.attacktechniques[1].getAttackName() + "\r\n3) " + x.attacktechniques[2].getAttackName()
							+ "\r\n4) " + x.attacktechniques[3].getAttackName());
			int attackTypeInt = Integer.parseInt(attackTypeChoice);
			switch (attackTypeInt) {
			case 1:
				executeAttack(x, y, attackTypeInt);
				break;
			case 2:
				executeAttack(x, y, attackTypeInt);
				break;
			case 3:
				executeAttack(x, y, attackTypeInt);
				break;
			case 4:
				executeAttack(x, y, attackTypeInt);
				break;
			}
		}
	}

	public void orderDefense(Pokemon x) {
		// x.setDefAux(x.getDefensePower()); // testing
		x.setDefensePower(x.getDefensePower() * 1.3);
		x.setDefenseTurnsOfEffect(1);
		// System.out.println(x.getDefensePower()); // testing
	}

	public void orderPotion(Pokemon x) {
		boolean isChoiceCorrect = false;
		while (isChoiceCorrect == false) {
			String potionChoice = JOptionPane
					.showInputDialog("Choose a potion: \r\n 1) Regular Potion \r\n 2) Super Potion");
			int potionChoiceInt = Integer.parseInt(potionChoice);
			switch (potionChoiceInt) {
			case 1:
				if (x.getHealthPoints() + regularPotion.getHealingPower() >= x.getMaxHealthPoints()) {
					x.setHealthPoints(x.getMaxHealthPoints());
				} else {
					x.setHealthPoints(x.getHealthPoints() + regularPotion.getHealingPower());
				}
				isChoiceCorrect = true;
				break;
			case 2:
				if (x.getHealthPoints() + superPotion.getHealingPower() >= x.getMaxHealthPoints()) {
					x.setHealthPoints(x.getMaxHealthPoints());
				} else {
					x.setHealthPoints(x.getHealthPoints() + superPotion.getHealingPower());
				}
				isChoiceCorrect = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "There are no potions hidden in this pocket!");
				String newInput = JOptionPane
						.showInputDialog("Choose a potion: \r\n 1) Regular Potion \r\n 2) Super Potion");
				potionChoiceInt = Integer.parseInt(newInput);
			}
		}
	}

	public void throwPokeball() {

	}

	public void chooseAction(int x, Pokemon pok1, Pokemon pok2) {
		boolean isActionCorrect = false;
		while (isActionCorrect == false) {
			switch (x) {
			case 1:
				orderAttack(pok1, pok2);
				isActionCorrect = true;
				break;
			case 2:
				orderDefense(pok1);
				isActionCorrect = true;
				break;
			case 3:
				if (this.regPotions == 0 && this.supPotions == 0) {
					System.out.println("There are no potions left!");
					break;
				} else if (pok1.getHealthPoints() == pok1.getMaxHealthPoints()) {
					JOptionPane.showMessageDialog(null, pok1.getName() + "'s HP is full!\r\n");
					String newInput = chooseActionPrompt();
					x = Integer.parseInt(newInput);
					// System.out.println(pok1.getName() + "'s HP is full!");
					break;
				}
				orderPotion(pok1);
				isActionCorrect = true;
				break;
			case 4:
				throwPokeball();
			default:
				JOptionPane.showMessageDialog(null, "Prof. Oak: You need to choose a valid action, fool!");
				String newInput = chooseActionPrompt();
				x = Integer.parseInt(newInput);
			}
		}
	}
}
