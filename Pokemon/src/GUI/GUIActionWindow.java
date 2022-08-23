package GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class GUIActionWindow {

	public GUIActionWindow () {
		Frame frame = new Frame();
		
		//Logo positioning
		ImageLabel logo = new ImageLabel();
		logo.setIcon(new ImageIcon("images/PokeTransparent.png"));
		logo.setText("aaaaaa");
		logo.setBounds(10, 10, 100, 100);
		logo.setVisible(true);
		frame.add(logo);
	}
}
