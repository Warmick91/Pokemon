package GUI;

import java.awt.Color;
import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame(){
		
		this.setTitle("PoCeMon");	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
}
