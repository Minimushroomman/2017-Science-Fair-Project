package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class GBoard {
	public static void initGBoard (Graphics g) {
		System.out.println("Board Initialized");
		
		//settting up 2D Graphics and rendering hints
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHints(rh);
		
		
		
		//COLORS
		Color black = new Color(0, 0 ,0);
		Color brown = new Color(102, 51, 0);
		Color lBlue = new Color (153, 255, 255);
		Color magenta = new Color (204, 0, 102);
		Color orange = new Color (255, 128, 0);
		Color red = new Color (255, 0, 0);
		Color yellow = new Color (255, 255, 0);
		Color green = new Color (0, 153, 0);
		Color blue = new Color (0, 0, 255);
		//BACKGROUND OF BOARD
		g.setColor(black);
		g.drawRect(1,1,780,780);
		//horozontal lines
		g.drawLine(1, 120, 780, 120);
		g.drawLine(1, 660, 780, 660);
		//verticle lines
		g.drawLine(120, 1, 120, 780);
		g.drawLine(660, 1, 660, 780);
		//left side rectangles
		g.drawLine(1, 180, 120, 180);
		g.drawLine(1, 240, 120, 240);
		g.drawLine(1, 300, 120, 300);
		g.drawLine(1, 360, 120, 360);
		g.drawLine(1, 420, 120, 420);
		g.drawLine(1, 480, 120, 480);
		g.drawLine(1, 540, 120, 540);
		g.drawLine(1, 600, 120, 600);
		//right side rectangles
		g.drawLine(660, 180, 780, 180);
		g.drawLine(660, 240, 780, 240);
		g.drawLine(660, 300, 780, 300);
		g.drawLine(660, 360, 780, 360);
		g.drawLine(660, 420, 780, 420);
		g.drawLine(660, 480, 780, 480);
		g.drawLine(660, 540, 780, 540);
		g.drawLine(660, 600, 780, 600);
		//top side rectangles
		g.drawLine(180, 1, 180, 120);
		g.drawLine(240, 1, 240, 120);
		g.drawLine(300, 1, 300, 120);
		g.drawLine(360, 1, 360, 120);
		g.drawLine(420, 1, 420, 120);
		g.drawLine(480, 1, 480, 120);
		g.drawLine(540, 1, 540, 120);
		g.drawLine(600, 1, 600, 120);
		//bottom side rectangles
		g.drawLine(180, 660, 180, 780);
		g.drawLine(240, 660, 240, 780);
		g.drawLine(300, 660, 300, 780);
		g.drawLine(360, 660, 360, 780);
		g.drawLine(420, 660, 420, 780);
		g.drawLine(480, 660, 480, 780);
		g.drawLine(540, 660, 540, 780);
		g.drawLine(600, 660, 600, 780);
		//Colors
		g.setColor(brown);
		g.fillRect(100, 480, 20, 60);
		g.fillRect(100, 600, 20, 60);
		
		g.setColor(lBlue);
		g.fillRect(100, 120, 20, 60);
		g.fillRect(100, 180, 20, 60);
		g.fillRect(100, 300, 20, 60);
				
		g.setColor(magenta);
		g.fillRect(120, 100, 60, 20);
		g.fillRect(240, 100, 60, 20);
		g.fillRect(300, 100, 60, 20);
				
		g.setColor(orange);
		g.fillRect(420, 100, 60, 20);
		g.fillRect(540, 100, 60, 20);
		g.fillRect(600, 100, 60, 20);
				
		g.setColor(red);
		g.fillRect(660, 120, 20, 60);
		g.fillRect(660, 240, 20, 60);
		g.fillRect(660, 300, 20, 60);
				
		g.setColor(yellow);
		g.fillRect(660, 420, 20, 60);
		g.fillRect(660, 480, 20, 60);
		g.fillRect(660, 600, 20, 60);
				
		g.setColor(green);
		g.fillRect(420, 660, 60, 20);
		g.fillRect(540, 660, 60, 20);
		g.fillRect(600, 660, 60, 20);
				
		g.setColor(blue);
		g.fillRect(120, 660, 60, 20);
		g.fillRect(240, 660, 60, 20);
				
		//color squares
		g.setColor(black);
		//lblue
		g.drawRect(100, 120, 20, 60);
		g.drawRect(100, 180, 20, 60);
		g.drawRect(100, 300, 20, 60);
				
		//brown
		g.drawRect(100, 480, 20, 60);
		g.drawRect(100, 600, 20, 60);
				
		//magenta
		g.drawRect(120, 100, 60, 20);
		g.drawRect(240, 100, 60, 20);
		g.drawRect(300, 100, 60, 20);
				
		//orange
		g.drawRect(420, 100, 60, 20);
		g.drawRect(540, 100, 60, 20);
		g.drawRect(600, 100, 60, 20);
				
		//red
		g.drawRect(660, 120, 20, 60);
		g.drawRect(660, 240, 20, 60);
		g.drawRect(660, 300, 20, 60);
				
		//yellow
		g.drawRect(660, 420, 20, 60);
		g.drawRect(660, 480, 20, 60);
		g.drawRect(660, 600, 20, 60);
				
		//green
		g.drawRect(420, 660, 60, 20);
		g.drawRect(540, 660, 60, 20);
		g.drawRect(600, 660, 60, 20);
				
		//blue
		g.drawRect(120, 660, 60, 20);
		g.drawRect(240, 660, 60, 20);
				
		//jail
		g.setColor(black);
		g.drawRect(50, 50, 70, 70);
	}
}
