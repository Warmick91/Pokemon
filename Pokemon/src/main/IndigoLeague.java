package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import GUI.Frame;
import GUI.GUIActionWindow;
import Trainers.CPUTrainer;
import Trainers.PlayerTrainer;
import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Pokemon;
import pokemon.Squirtle;

public class IndigoLeague {

	public static void waiting() throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(600);
		}
		System.out.println("");
	}

	public static void main(String[] args) throws InterruptedException {

		
		//GUI
		GUIActionWindow GUI = new GUIActionWindow();
		
//		// Frame frame = new Frame();
//
//		Bulbasaur Petalboy = new Bulbasaur("Petalboy", 8, "poison", 60, 30, 10, 250, 2, 5, 10, 5);
//		Charmander Emberlass = new Charmander("Emberlass", 8, null, 55, 45, 15, 250, 2, 5, 10, 20);
//		Squirtle Splashdude = new Squirtle("Splashdude", 8, null, 55, 50, 13, 250, 10, 5, 10, 5);
//		String name1 = JOptionPane.showInputDialog("Prof. Oak: What's your name? I'm old and forgetful these days.");
//		String name2 = JOptionPane.showInputDialog("Prof. Oak: Ah, awesome. Who's your rival?");
//		PlayerTrainer player = new PlayerTrainer(name1, 2, 1, 3);
//		CPUTrainer cpu = new CPUTrainer(name2, 2, 1, 3);
//
//		// The list of available Pokemon
//		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
//		pokedex.add(Petalboy);
//		pokedex.add(Emberlass);
//		pokedex.add(Splashdude);
//
//		String choicePokemon = JOptionPane
//				.showInputDialog("Prof. Oak: Choose your Pokemon.\r\n1) Bulbasaur\r\n2) Charmander\r\n3) Squirtle");
//		int choiceIntPokemon = Integer.parseInt(choicePokemon);
//
//		// Teams building
//		Random random = new Random();
//		String pokeSpecies1 = "";
//		String pokeSpecies2 = "";
//		HashMap<String, Pokemon> teams = new HashMap<String, Pokemon>();
//		switch (choiceIntPokemon) {
//		case 1:
//			teams.put(name1, pokedex.get(0)); // "Bulbasaur"
//			teams.put(name2, pokedex.get(random.nextInt(2) + 1));
//			pokeSpecies1 = teams.get(name1).getTypeName(); // "Bulbasaur"
//			pokeSpecies2 = teams.get(name2).getTypeName();
//			break;
//		case 2:
//			teams.put(name1, pokedex.get(1)); // "Charmander"
//			if (random.nextInt(1) == 0) {
//				teams.put(name2, pokedex.get(0));
//			} else {
//				teams.put(name2, pokedex.get(2));
//			}
//			pokeSpecies1 = teams.get(name1).getTypeName(); // "Charmander"
//			pokeSpecies2 = teams.get(name2).getTypeName();
//			break;
//		case 3:
//			teams.put(name1, pokedex.get(2)); // "Squirtle"
//			teams.put(name2, pokedex.get(random.nextInt(2)));
//			pokeSpecies1 = teams.get(name1).getTypeName(); // "Squirtle"
//			pokeSpecies2 = teams.get(name2).getTypeName();
//			break;
//		}
//
//		// Giving normal names to team Pokemon
//		Pokemon playerPokemon = teams.get(name1);
//		Pokemon cpuPokemon = teams.get(name2);
//
//		// Add attacks to the pool
//		if (playerPokemon.getTypeName() == "Bulbasaur") {
//		} else if (playerPokemon.getTypeName() == "Charmander") {
//
//		} else if (playerPokemon.getTypeName() == "Squirtle") {
//
//		}
//
//		// Gameplay
//		System.out.println("Welcome to the Indigo League!\r\nToday's competitors are " + player.getName() + " and "
//				+ cpu.getName() + "!\r\n");
//
//		System.out.println(player.getName() + ": " + playerPokemon.getName() + ", go!");
//		System.out.println(player.getName() + " chooses " + pokeSpecies1 + "!\r\n");
//
//		System.out.println(cpu.getName() + ": " + "Go, " + cpuPokemon.getName() + "!");
//		System.out.println(cpu.getName() + " chooses " + pokeSpecies2 + "!\r\n");
//
//		// boolean isFirstRound = true;
//		boolean isBattleLooped = true;
//		while (isBattleLooped == true) {
//			
//			// Player's turn
//			player.trainerAction(playerPokemon, cpuPokemon);
//
//			// CPU's turn
//			cpu.trainerAction(cpuPokemon, playerPokemon);
//
//			// Check HP
//			if (playerPokemon.getHealthPoints() <= 0 || cpuPokemon.getHealthPoints() <= 0) {
//				isBattleLooped = false;
//			}
//		}
	}

}
