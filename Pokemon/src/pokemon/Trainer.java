package pokemon;

import javax.swing.JOptionPane;

public class Trainer {
	private String name;
	private int potions;
	private int pokeballs;

	Trainer(String name, int potions, int pokeballs) {
		this.name = name;
		this.potions = potions;
		this.pokeballs = pokeballs;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	public int getPokeballs() {
		return pokeballs;
	}

	public void setPokeballs(int pokeballs) {
		this.pokeballs = pokeballs;
	}

	// Actions
	public void orderAttack(Pokemon x, Pokemon y) {
		String attackTypeChoice = JOptionPane.showInputDialog("Attacks:\r\n1) Tackle");
		int attackTypeInt = Integer.parseInt(attackTypeChoice);
		switch (attackTypeInt) {
		case 1:
			AttackTechniques.tackle("normal", x.getAttackPower(), x.getSpeed(), x.getLuck(), x.getLevel(), y.getDefensePower(),
					y.getSpeed(), y.getLuck(), y.getLevel());
		}
	}

	public void orderDefense(Pokemon x, Pokemon y) {

	}

	public void orderPotion(Pokemon x) {

	}

	public void throwPokeball() {

	}

	public void chooseAction(int x, Pokemon pok1, Pokemon pok2) {
		switch (x) {
		case 1:
			orderAttack(pok1, pok2);
			break;
		case 2:
			orderDefense(pok1, pok2);
			break;
		case 3:
			orderPotion(pok1);
			break;
		case 4:
			throwPokeball();
		default:
			System.out.println("Prof. Oak: You need to choose a valid action, fool!");
		}
	}
}
