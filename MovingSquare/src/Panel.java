import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	public Panel() {
		
		setPreferredSize(new Dimension(640, 640));
		setVisible(true);
		
	}
	
	int i = 0;
	
	@Override
	public void update(Graphics g) {
	   	
	   	if( i < 570) {
	   		repaint();
	   		i++;
			try { Thread.sleep(13); } catch (InterruptedException e) {e.printStackTrace();}
			
	   	}
	}
	
	public void repaint() {
	   super.repaint();
	}	
	
	public void paintComponent(Graphics g) {
		if(i < 1) {
			g.setColor(Color.white);
	    	g.fillRect(0, 0, Frame.x, Frame.y);
		}
		
		g.setColor(Color.black);
		g.fillRect(i-1, i-1, 52, 52);
		g.setColor(new Color(0, 155, 155));
		g.fillRect(i, i, 50, 50);
		
	    update(g);
	}
		
}
