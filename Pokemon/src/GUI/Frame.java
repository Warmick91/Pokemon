package GUI;

import javax.swing.JFrame;


public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;


	public Frame () {

		this.setTitle("PoCeMon");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setSize(1100, 800);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
