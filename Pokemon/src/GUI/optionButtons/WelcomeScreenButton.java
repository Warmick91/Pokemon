package GUI.optionButtons;

import java.awt.Color;

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
}
