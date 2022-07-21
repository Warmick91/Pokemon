package pokemon;

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
	public void orderAttack(Pokemon x) {

	}

	public void orderDefense(Pokemon x) {

	}

	public void orderPotion(Pokemon x) {

	}

	public void throwPokeball() {

	}

	public void chooseAction(int x, Pokemon pok) {
		switch (x) {
		case 1:
			orderAttack(pok);
			break;
		case 2:
			orderDefense(pok);
			break;
		case 3:
			orderPotion(pok);
			break;
		case 4:
			throwPokeball();
		default:
			System.out.println("Prof. Oak: You need to choose a valid action, fool!");
		}
	}
}
