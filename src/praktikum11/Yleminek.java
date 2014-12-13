package praktikum11;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Yleminek extends Applet {
	
	@Override
	public void paint(Graphics g) {

		int w = getWidth();
		int h = getHeight();
		
		for (int i = 0; i < 256; i++) {
			Color v2rv = new Color(i, i, i);
			g.setColor(v2rv);
			g.drawLine(0, i, w, i);			
		}

	}
		
}


