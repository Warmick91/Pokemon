package GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

public class OptionButton extends JButton {
	private static final long serialVersionUID = 1L;

	protected Font retroFont = null;
	
	public OptionButton() {
		// Estabilish fonts
				try {
					retroFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")).deriveFont(70f);
					GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
					ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Pixeboy.ttf")));
				} catch (IOException | FontFormatException e) {
				}
				
				this.setFocusable(false);
				
	}	

}
