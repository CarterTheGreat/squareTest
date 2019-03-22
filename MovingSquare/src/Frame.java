import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{

	public static Frame frame;
	public static JPanel panel;
	static int x = 640;
	static int y = 660;
	
	public Frame(String title) {
		super();
		setLayout(new BorderLayout());
		
		panel = new Panel();
		
		add(panel, BorderLayout.NORTH);
		
		setSize(x, y);
		setResizable(false);
		setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		
		frame = new Frame("Test");
		frame.setVisible(true);
		
	}
	
	
}
