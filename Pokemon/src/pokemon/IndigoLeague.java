package pokemon;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IndigoLeague {

	public static void main(String[] args) {

		Bulbasaur Petalboy = new Bulbasaur("Petalboy", 8, "poison", 60, 30, 10, 15, 90, 0.1);
		Charmander Emberlass = new Charmander("Emberlass", 8, null, 0, 50, 35, 20, 80, 0.1);
		String name1 = JOptionPane.showInputDialog("Prof. Oak: What's your name? I'm old and forgetful these days.");
		String name2 = JOptionPane.showInputDialog("Prof. Oak: Ah, awesome. Who's your rival?");
		Trainer player1 = new Trainer(name1, 3, 6);
		Trainer player2 = new Trainer(name2, 3, 6);
		
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		pokedex.add(Petalboy);
		pokedex.add(Emberlass);		
		
		String choicePokemon = JOptionPane.showInputDialog("Prof. Oak: Choose your Pokemon.\r\n1) Bulbasaur\r\n2) Charmander\r\n3) Squirtle");
		
		System.out.println("Welcome to the Indigo League!\r\nToday's competitors are " + player1.getName() + " and "
				+ player2.getName() + "!\r\n");

		System.out.println(player1.getName() + ": " + Petalboy.getName() + ", go!");
		System.out.println(player2.getName() + ": " + Emberlass.getName() + "!\r\n");

		System.out.println(Petalboy.getName() + "'s HP: " + Petalboy.getHealthPoints() + "\t" + Emberlass.getName()
				+ "'s HP: " + Emberlass.getHealthPoints());
		
		
		
	}

}
