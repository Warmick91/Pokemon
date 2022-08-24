package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUIActionWindow {

	public GUIActionWindow() {

		// Fonts
		Font retroFont = null;

		try {
			retroFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")));
		} catch (IOException | FontFormatException e) {

		}

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
		grassSymbol.setBounds(fireSymbol.getX() + fireSymbol.getWidth() / 2,
				fireSymbol.getY() + fireSymbol.getHeight() - 20, fireSymbol.getWidth(), fireSymbol.getHeight());
		ImageIcon grassSymbolIMG = new ImageIcon("images/grassSymbol.png");
		grassSymbol.setIcon(grassSymbolIMG);

		// Start button
		OptionButton startButton = new OptionButton();
		startButton.setBounds(canvas.getWidth() / 2 - 100, grassSymbol.getY() + grassSymbol.getHeight() + 30, 200, 70);
		startButton.setText("START");
		startButton.setVerticalTextPosition(JButton.CENTER);
		startButton.setHorizontalTextPosition(JButton.CENTER);
		startButton.setFont(retroFont);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setForeground(Color.yellow);
		
		// Compilation
		Frame frame = new Frame();
		frame.add(canvas);
		canvas.add(pokeLogo);
		canvas.add(fireSymbol);
		canvas.add(waterSymbol);
		canvas.add(grassSymbol);
		canvas.add(startButton);
	}
}
