package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
	private Image monoTitle;
	private Image comChestTile1;
	private Image trainTile1;
	private Image chanceTile1;
	private Image chanceTile2;
	private Image comChestTile2;
	private Image elecCompTile;
	private Image luxTaxTile;
	private Image trainTile2;
	private Image jailTile;
	private Image incomeTaxTile;
	private Image waterTile;
	private Image parkingTile;
	private Image goToJailTile;
	private Image goTile;
	
	Color monopoly = new Color(192, 226, 202);
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		loadImage();
	}
	
	private void loadImage(){
		ImageIcon iiMonoTitle = new ImageIcon("src/images/monoTitle.png");
		monoTitle = iiMonoTitle.getImage();
		
		ImageIcon iiComChestTile1 = new ImageIcon("src/images/comChestTile1.png");
		comChestTile1 = iiComChestTile1.getImage();
		
		ImageIcon iiTrainTile1 = new ImageIcon("src/images/trainTile1.png");
		trainTile1 = iiTrainTile1.getImage();
		
		ImageIcon iiChanceTile1 = new ImageIcon("src/images/chanceTile1.png");
		chanceTile1 = iiChanceTile1.getImage();
		
		ImageIcon iiChanceTile2 = new ImageIcon("src/images/chanceTile2.png");
		chanceTile2 = iiChanceTile2.getImage();
		
		ImageIcon iiComChestTile2 = new ImageIcon("src/images/comChestTile2.png");
		comChestTile2 = iiComChestTile2.getImage();
		
		ImageIcon iielecCompTile = new ImageIcon("src/images/elecCompTile.png");
		elecCompTile = iielecCompTile.getImage();
		
		ImageIcon iiluxTaxTile = new ImageIcon("src/images/luxTaxTile.png");
		luxTaxTile = iiluxTaxTile.getImage();
		
		ImageIcon iitrainTile2 = new ImageIcon("src/images/trainTile2.png");
		trainTile2 = iitrainTile2.getImage();
		
		ImageIcon iijailTile = new ImageIcon("src/images/jailTile.png");
		jailTile = iijailTile.getImage();
		
		ImageIcon iiincomeTaxTile = new ImageIcon("src/images/incomeTaxTile.png");
		incomeTaxTile = iiincomeTaxTile.getImage();
		
		ImageIcon iiwaterTile = new ImageIcon("src/images/waterTile.png");
		waterTile = iiwaterTile.getImage();
		
		ImageIcon iiparkingTile = new ImageIcon("src/images/parkingTile.png");
		parkingTile = iiparkingTile.getImage();
		
		ImageIcon iigoToJailTile = new ImageIcon("src/images/goToJailTile.png");
		goToJailTile = iigoToJailTile.getImage();
		
		ImageIcon iigoTile = new ImageIcon("src/images/goTile.png");
		goTile = iigoTile.getImage();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(monopoly);
		g.fillRect(1,1,780,780);
		g.drawImage(monoTitle, 120, 120, null);
		g.drawImage(comChestTile1, 0, 540, null);
		g.drawImage(trainTile1, 0, 360, null);
		g.drawImage(trainTile1, 660, 360, null);
		g.drawImage(chanceTile1, 0, 240, null);
		g.drawImage(chanceTile1, 660, 180, null);
		g.drawImage(chanceTile2, 300, 660, null);
		g.drawImage(comChestTile2, 480, 0, null);
		g.drawImage(comChestTile2, 480, 660, null);
		g.drawImage(elecCompTile, 180, 0, null);
		g.drawImage(luxTaxTile, 180, 660, null);
		g.drawImage(trainTile2, 360, 660, null);
		g.drawImage(trainTile2, 360, 0, null);
		g.drawImage(jailTile, 50, 50, null);
		g.drawImage(incomeTaxTile, 0, 420, null);
		g.drawImage(waterTile, 660, 540, null);
		g.drawImage(parkingTile, 660, 0, null);
		g.drawImage(goToJailTile, 660, 660, null);
		g.drawImage(goTile, 0, 660, null);
		
		GBoard.initGBoard(g);
	}
}
