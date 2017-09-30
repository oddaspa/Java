package Drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

	public void paintComponent(Graphics g){
		
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Construct a rectangle and draw it
		Rectangle box = new Rectangle(5,10,20,30);
		Color Orange = new Color(255,200,0);
		g2.setColor(Orange);
		g2.drawString("More Life", 100, 100);
		Color Green= new Color(0,255,0);
		g2.setColor(Green);
		g2.fill(box);
		g2.draw(box);
		// Move rectangle
		box.translate(105, 205);
		
		// Draw moved rectangle
		g2.draw(box);
	}
}
