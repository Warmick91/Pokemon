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
	
	//Getters and setters
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
	
	//Actions
	public void orderAttack(Pokemon x) {
		
	}
	
	public void orderDefense(Pokemon x) {
		
	}
	
	public void orderPotion(Pokemon x) {
		
	}
	
	public void throwPokeball(Pokemon y) {
		
	}
}
