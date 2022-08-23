package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class GUIActionWindow {

    public GUIActionWindow() {

	ImageLabel logo = new ImageLabel();
	logo.setLayout(null);
//	logo.setBackground(Color.red); // delete
//	logo.setOpaque(true); // delete

	// Main frame canvas
	ComponentPanel canvas = new ComponentPanel();
	canvas.setLayout(null);

	canvas.setBounds(0, 0, 700, 700);
	canvas.setBackground(Color.black);

	Frame frame = new Frame();
	frame.add(canvas);
	canvas.add(logo);

	logo.setBounds(canvas.getWidth() / 2 - 250, 0, 500, 200);
	ImageIcon poCeMonLogo = new ImageIcon(new ImageIcon("images/PokeTransparentV3.png").getImage()
		.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
	logo.setIcon(poCeMonLogo);
    }
}
