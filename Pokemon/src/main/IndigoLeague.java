package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;
import pokemon.Trainer;

public class IndigoLeague {

	public static String chooseActionPrompt() {
		String actionChoice = JOptionPane.showInputDialog(
				"Choose action:\r\n 1) Attack\r\n 2) Defend\r\n 3) Use potion\r\n 4) Throw a pokeball");
		return actionChoice;
	}

	public static void main(String[] args) {

		Bulbasaur Petalboy = new Bulbasaur("Petalboy", 8, "poison", 60, 30, 10, 75, 10, 5);
		Charmander Emberlass = new Charmander("Emberlass", 8, null, 50, 50, 15, 65, 10, 5);
		Squirtle Splashdude = new Squirtle("Splashdude", 8, null, 45, 55, 13, 80, 10, 5);
		String name1 = JOptionPane.showInputDialog("Prof. Oak: What's your name? I'm old and forgetful these days.");
		String name2 = JOptionPane.showInputDialog("Prof. Oak: Ah, awesome. Who's your rival?");
		Trainer player1 = new Trainer(name1, 3, 6);
		Trainer player2 = new Trainer(name2, 3, 6);

		// The list of available Pokemon
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		pokedex.add(Petalboy);
		pokedex.add(Emberlass);
		pokedex.add(Splashdude);

		String choicePokemon = JOptionPane
				.showInputDialog("Prof. Oak: Choose your Pokemon.\r\n1) Bulbasaur\r\n2) Charmander\r\n3) Squirtle");
		int choiceIntPokemon = Integer.parseInt(choicePokemon);

		// Teams building
		Random random = new Random();
		String pokeSpecies1 = "";
		String pokeSpecies2 = "";
		HashMap<String, Pokemon> teams = new HashMap<String, Pokemon>();
		switch (choiceIntPokemon) {
		case 1:
			teams.put(name1, pokedex.get(0)); // "Bulbasaur"
			teams.put(name2, pokedex.get(random.nextInt(2) + 1));
			pokeSpecies1 = teams.get(name1).getTypeName(); // "Bulbasaur"
			pokeSpecies2 = teams.get(name2).getTypeName();
			break;
		case 2:
			teams.put(name1, pokedex.get(1)); // "Charmander"
			if (random.nextInt(1) == 0) {
				teams.put(name2, pokedex.get(0));
			} else {
				teams.put(name2, pokedex.get(2));
			}
			pokeSpecies1 = teams.get(name1).getTypeName(); // "Charmander"
			pokeSpecies2 = teams.get(name2).getTypeName();
			break;
		case 3:
			teams.put(name1, pokedex.get(2)); // "Squirtle"
			teams.put(name2, pokedex.get(random.nextInt(2)));
			pokeSpecies1 = teams.get(name1).getTypeName(); // "Squirtle"
			pokeSpecies2 = teams.get(name2).getTypeName();
			break;
		}

		// Add attacks to the pool
		if (teams.get(name1).getTypeName() == "Bulbasaur") {
		} else if (teams.get(name1).getTypeName() == "Charmander") {

		} else if (teams.get(name1).getTypeName() == "Squirtle") {

		}

		// Gameplay
		System.out.println("Welcome to the Indigo League!\r\nToday's competitors are " + player1.getName() + " and "
				+ player2.getName() + "!\r\n");

		System.out.println(player1.getName() + ": " + teams.get(name1).getName() + ", go!");
		System.out.println(player1.getName() + " chooses " + pokeSpecies1 + "!\r\n");

		System.out.println(player2.getName() + ": " + "Go, " + teams.get(name2).getName() + "!");
		System.out.println(player2.getName() + " chooses " + pokeSpecies2 + "!\r\n");

		boolean isLoop = true;
		while (isLoop == true) {
			// Player's turn
			teams.get(name1).setAttackPower(teams.get(name1).getAttAux());
			System.out.println(teams.get(name1).getName() + "'s AP: " + teams.get(name1).getAttackPower()); // test to
																											// delete
			teams.get(name1).setDefensePower(teams.get(name1).getDefAux());
			System.out.println(teams.get(name1).getName() + "'s DP: " + teams.get(name1).getDefensePower()); // test to
																												// delete

			System.out.println(teams.get(name1).getName() + "'s HP: " + (int) teams.get(name1).getHealthPoints() + "\t"
					+ teams.get(name2).getName() + "'s HP: " + (int) teams.get(name2).getHealthPoints());
			// Action choice
			String choiceAction = chooseActionPrompt();
			int choiceActionInt = Integer.parseInt(choiceAction);
			player1.chooseAction(choiceActionInt, teams.get(name1), teams.get(name2));

			// CPU's turn
		}
	}

}
