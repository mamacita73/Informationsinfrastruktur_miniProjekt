package gui;

import javax.swing.*;

public class beispiel {

	public static void main(String[ ] args) {
		
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello world, " + "this is a small Swing Demo");
		frame.add(label);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
}
