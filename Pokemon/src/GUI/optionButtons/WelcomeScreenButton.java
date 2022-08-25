package GUI.optionButtons;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import GUI.OptionButton;

public class WelcomeScreenButton extends OptionButton {
	private static final long serialVersionUID = 1L;

	public WelcomeScreenButton(String text) {		
		this.setText(text);
		this.setVerticalTextPosition(JButton.CENTER);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setFont(retroFont);
		this.setOpaque(false);
		this.setContentAreaFilled(false); // button's background
		this.setBorderPainted(false);
		this.setForeground(Color.yellow);	
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
