package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class GUIActionWindow {

	public GUIActionWindow() {

		// Main frame canvas
		ComponentPanel canvas = new ComponentPanel();
		canvas.setLayout(null);
		canvas.setBounds(0, 0, 700, 700);
		canvas.setBackground(Color.black);

		// Logo
		ImageLabel pokeLogo = new ImageLabel();
//		pokeLogo.setBackground(Color.yellow); // delete
		pokeLogo.setBounds(canvas.getWidth() / 2 - 250, 0, 500, 200);
		ImageIcon poCeMonLogo = new ImageIcon(new ImageIcon("images/PokeTransparentV3.png").getImage()
				.getScaledInstance(pokeLogo.getWidth(), pokeLogo.getHeight(), Image.SCALE_DEFAULT));
		pokeLogo.setIcon(poCeMonLogo);

		// Fire Symbol
		ImageLabel fireSymbol = new ImageLabel();
//		fireSymbol.setBackground(Color.red); // delete
		fireSymbol.setBounds(pokeLogo.getX() + 90, pokeLogo.getY() + pokeLogo.getHeight() + 20,
				pokeLogo.getWidth() / 2 - 90, pokeLogo.getWidth() / 2 - 90);
		ImageIcon fireSymbolIMG = new ImageIcon("images/fireSymbol.png");
		fireSymbol.setIcon(fireSymbolIMG);

		// Water Symbol
		ImageLabel waterSymbol = new ImageLabel();
//		waterSymbol.setBackground(Color.blue); // delete
		waterSymbol.setBounds(fireSymbol.getX() + fireSymbol.getWidth(), fireSymbol.getY(), fireSymbol.getWidth(),
				fireSymbol.getHeight());
		ImageIcon waterSymbolIMG = new ImageIcon("images/waterSymbol.png");
		waterSymbol.setIcon(waterSymbolIMG);

		// Grass Symbol
		ImageLabel grassSymbol = new ImageLabel();
//		grassSymbol.setBackground(Color.green); // delete
		grassSymbol.setBounds(fireSymbol.getX() + fireSymbol.getWidth() / 2, fireSymbol.getY() + fireSymbol.getHeight() - 20,
				fireSymbol.getWidth(), fireSymbol.getHeight());
		ImageIcon grassSymbolIMG = new ImageIcon("images/grassSymbol.png");
		grassSymbol.setIcon(grassSymbolIMG);

		//Start button
		OptionButton startButton = new OptionButton();
		//startButton.setBounds(null);
		
		// Compilation
		Frame frame = new Frame();
		frame.add(canvas);
		canvas.add(pokeLogo);
		canvas.add(fireSymbol);
		canvas.add(waterSymbol);
		canvas.add(grassSymbol);
	}
}
