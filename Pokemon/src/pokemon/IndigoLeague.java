package pokemon;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class IndigoLeague {
	
	public static void chooseAction() {
		JOptionPane.showInputDialog(
				"Choose action:\r\n 1) Attack\r\n 2) Defend\r\n 3) Use potion\r\n 4) Throw a pokeball");
	}
	
	public static void main(String[] args) {

		Bulbasaur Petalboy = new Bulbasaur("Petalboy", 8, "poison", 60, 30, 10, 15, 90, 0.1);
		Charmander Emberlass = new Charmander("Emberlass", 8, null, 0, 50, 35, 20, 80, 0.1);
		String name1 = JOptionPane.showInputDialog("Prof. Oak: What's your name? I'm old and forgetful these days.");
		String name2 = JOptionPane.showInputDialog("Prof. Oak: Ah, awesome. Who's your rival?");
		Trainer player1 = new Trainer(name1, 3, 6);
		Trainer player2 = new Trainer(name2, 3, 6);		
		
		
		// The list of available Pokemon
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		pokedex.add(Petalboy);
		pokedex.add(Emberlass);

		String choicePokemon = JOptionPane
				.showInputDialog("Prof. Oak: Choose your Pokemon.\r\n1) Bulbasaur\r\n2) Charmander\r\n3) Squirtle");
		int choiceIntPokemon = Integer.parseInt(choicePokemon);

		// Team building
		String pokeSpecies1 = "";
		String pokeSpecies2 = "";
		HashMap<String, Pokemon> teams = new HashMap<String, Pokemon>();
		switch (choiceIntPokemon) {
		case 1:
			teams.put(name1, pokedex.get(0));
			teams.put(name2, pokedex.get(1));
			pokeSpecies1 = "Bulbasaur";
			pokeSpecies2 = "Charmander";
			break;
		case 2:
			teams.put(name1, pokedex.get(1));
			teams.put(name2, pokedex.get(0));
			pokeSpecies1 = "Charmander";
			pokeSpecies2 = "Bulbasaur";
			break;
		}

		// Gameplay
		System.out.println("Welcome to the Indigo League!\r\nToday's competitors are " + player1.getName() + " and "
				+ player2.getName() + "!\r\n");

		System.out.println(player1.getName() + ": " + teams.get(name1).getName() + ", go!");
		System.out.println(player1.getName() + " chooses " + pokeSpecies1 + "!\r\n");

		System.out.println(player2.getName() + ": " + "Go, " + teams.get(name2).getName() + "!");
		System.out.println(player2.getName() + " chooses " + pokeSpecies2 + "!\r\n");

		System.out.println(teams.get(name1).getName() + "'s HP: " + teams.get(name1).getHealthPoints() + "\t"
				+ teams.get(name2).getName() + "'s HP: " + teams.get(name2).getHealthPoints());
		
		//Action choice
		chooseAction();
		
		
	}

}
