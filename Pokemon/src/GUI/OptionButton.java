package GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

public class OptionButton extends JButton implements MouseListener {
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
				
				this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
