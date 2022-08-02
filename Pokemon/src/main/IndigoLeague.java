package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;
import pokemon.Trainer;

public class IndigoLeague {

//	public static String chooseActionPrompt() {
//		String actionChoice = JOptionPane.showInputDialog(
//				"Choose action:\r\n 1) Attack\r\n 2) Defend\r\n 3) Use potion\r\n 4) Throw a pokeball");
//		return actionChoice;
//	}

	public static void main(String[] args) throws InterruptedException {

		Bulbasaur Petalboy = new Bulbasaur("Petalboy", 8, "poison", 60, 30, 10, 75, 2, 5);
		Charmander Emberlass = new Charmander("Emberlass", 8, null, 50, 50, 15, 65, 2, 5);
		Squirtle Splashdude = new Squirtle("Splashdude", 8, null, 45, 55, 13, 80, 10, 5);
		String name1 = JOptionPane.showInputDialog("Prof. Oak: What's your name? I'm old and forgetful these days.");
		String name2 = JOptionPane.showInputDialog("Prof. Oak: Ah, awesome. Who's your rival?");
		Trainer player1 = new Trainer(name1, 2, 1, 3);
		Trainer player2 = new Trainer(name2, 2, 1, 3);

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

		// boolean isFirstRound = true;
		boolean isBattleLooped = true;
		while (isBattleLooped == true) {
			// Player's turn
			// Player's AP
			if (teams.get(name1).getAttackTurnsOfEffect() == 0) {
				// System.out.println(teams.get(name1).getName() + "'s Attack returns to
				// normal!");
				teams.get(name1).setAttackPower(teams.get(name1).getAttAux());
			} else {
				System.out.println(teams.get(name1).getAttackTurnsOfEffect());
				teams.get(name1).setAttackTurnsOfEffect(teams.get(name1).getAttackTurnsOfEffect() - 1);
			}
			System.out.print(teams.get(name1).getName() + "'s AP: " + teams.get(name1).getAttackPower() + "\t");
			System.out.println(teams.get(name2).getName() + "'s AP: " + teams.get(name2).getAttackPower()); // test to
																											// delete
			// Player's DP
			if (teams.get(name1).getDefenseTurnsOfEffect() == 0) {
				teams.get(name1).setDefensePower(teams.get(name1).getDefAux());
			} else {
				teams.get(name1).setDefenseTurnsOfEffect(teams.get(name1).getDefenseTurnsOfEffect() - 1);
			}
			System.out.print(teams.get(name1).getName() + "'s DP: " + teams.get(name1).getDefensePower() + "\t");
			System.out.println(teams.get(name2).getName() + "'s DP: " + teams.get(name2).getDefensePower()); // test to
																												// delete
			// Player's HP
			System.out.println(teams.get(name1).getName() + "'s HP: " + (int) teams.get(name1).getHealthPoints() + "\t"
					+ teams.get(name2).getName() + "'s HP: " + (int) teams.get(name2).getHealthPoints());

			// Player's Speed
			if (teams.get(name1).getSpeedTurnsOfEffect() == 0) {
				teams.get(name1).setSpeed(teams.get(name1).getSpeedAux());
			} else {
				teams.get(name1).setSpeedTurnsOfEffect(teams.get(name1).getSpeedTurnsOfEffect() - 1);
			}

			// Player's Luck
			if (teams.get(name1).getLuckTurnsOfEffect() == 0) {
				teams.get(name1).setLuck(teams.get(name1).getLuckAux());
			} else {
				teams.get(name1).setLuckTurnsOfEffect(teams.get(name1).getLuckTurnsOfEffect() - 1);
			}

			// Player's Critical Power
			if (teams.get(name1).getCriticalTurnsOfEffect() == 0) {
				teams.get(name1).setCritPower(teams.get(name1).getCritAux());
			} else {
				teams.get(name1).setCriticalTurnsOfEffect(teams.get(name1).getCriticalTurnsOfEffect() - 1);
			}

			// Action choice
			String choiceAction = Trainer.chooseActionPrompt();
			int choiceActionInt = Integer.parseInt(choiceAction);
			player1.chooseAction(choiceActionInt, teams.get(name1), teams.get(name2));

			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				TimeUnit.MILLISECONDS.sleep(600);
			}
			System.out.println("");

			// CPU's turn
			// CPU's AP
			if (teams.get(name2).getAttackTurnsOfEffect() == 0) {
				// System.out.println(teams.get(name1).getName() + "'s Attack returns to
				// normal!");
				teams.get(name2).setAttackPower(teams.get(name2).getAttAux());
			} else {
				//System.out.println(teams.get(name1).getAttackTurnsOfEffect());
				teams.get(name2).setAttackTurnsOfEffect(teams.get(name2).getAttackTurnsOfEffect() - 1);
			}

			// CPU's DP
			if (teams.get(name2).getDefenseTurnsOfEffect() == 0) {
				teams.get(name2).setDefensePower(teams.get(name2).getDefAux());
			} else {
				teams.get(name2).setDefenseTurnsOfEffect(teams.get(name2).getDefenseTurnsOfEffect() - 1);
			}

			// CPU's Speed
			if (teams.get(name2).getSpeedTurnsOfEffect() == 0) {
				teams.get(name2).setSpeed(teams.get(name2).getSpeedAux());
			} else {
				teams.get(name2).setSpeedTurnsOfEffect(teams.get(name2).getSpeedTurnsOfEffect() - 1);
			}

			// CPU's Luck
			if (teams.get(name2).getLuckTurnsOfEffect() == 0) {
				teams.get(name2).setLuck(teams.get(name2).getLuckAux());
			} else {
				teams.get(name2).setLuckTurnsOfEffect(teams.get(name2).getLuckTurnsOfEffect() - 1);
			}

			// CPU's Critical Power
			if (teams.get(name2).getCriticalTurnsOfEffect() == 0) {
				teams.get(name2).setCritPower(teams.get(name2).getCritAux());
			} else {
				teams.get(name2).setCriticalTurnsOfEffect(teams.get(name2).getCriticalTurnsOfEffect() - 1);
			}

			// Check HP
			if (teams.get(name1).getHealthPoints() <= 0 || teams.get(name2).getHealthPoints() <= 0) {
				isBattleLooped = false;
			}
		}
	}

}
