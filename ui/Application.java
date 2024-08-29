package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
	public static boolean running = false;
	public Application(){
		initUI();
	}
	private void initUI(){
		add(new Board());
		setSize(799,822);
		setTitle("Monopoly");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Ai ai = new Ai(1500, 0);
				Space brown1 = new Space(60, 630, 60, "Mediterranean Avenue", "no one", "brown");
				Space brown2 = new Space(60, 510, 60, "Baltic Avenue", "no one", "brown");
				Space lBlue1 = new Space(60, 330, 100, "Oriental Avenue", "no one", "lBlue");
				Space lBlue2 = new Space(60, 210, 100, "Vermont Avenue", "no one", "lBlue");
				Space lBlue3 = new Space(60, 150, 120, "Connecticut Avenue", "no one", "lBlue");
				Space magenta1 = new Space(150, 60, 140, "St. Charles Place", "no one", "magenta");
				Space magenta2 = new Space(270, 60, 140, "States Avenue", "no one", "magenta");
				Space magenta3 = new Space(330, 60, 160, "Virginia Avenue", "no one", "magenta");
				Space orange1 = new Space(450, 60, 180, "St. James Place", "no one", "orange");
				Space orange2 = new Space(570, 60, 180, "Tennessee Avenue", "no one", "orange");
				Space orange3 = new Space(630, 60, 200, "New York Avenue", "no one", "orange");
				Space red1 = new Space(690, 150, 220, "Kentucky Avenue", "no one", "red");
				Space red2 = new Space(690, 270, 220,  "Indiana Avenue", "no one", "red"); 
				Space red3 = new Space(690, 330, 240, "Illnois Avenue", "no one", "red");
				Space yellow1 = new Space(690, 450, 260, "Atlantic Avenue", "no one", "yellow");
				Space yellow2 = new Space(690, 510, 260, "Ventnor Avenue", "no one", "yellow");
				Space yellow3 = new Space(690, 630, 280, "Marvin Gardens", "no one", "yellow");
				Space green1 = new Space(630, 690, 300, "Pacific Avenue", "no one", "green");
				Space green2 = new Space(570, 690, 300, "North Carolina Avenue", "no one", "green");
				Space green3 = new Space(450, 690, 320, "Pennsylvania Avenue", "no one", "green");
				Space blue1 = new Space(270, 690, 350, "Park Place", "no one", "blue");
				Space blue2 = new Space(150, 690, 400, "Boardwalk", "no one", "blue");
				Space go = new Space(60, 720, 0, "Go", "game", "game");
				Dice gameDice = new Dice();
				Application mono = new Application();
				mono.setVisible(true);
				Initializations.initSpaces();
				Initializations.initGame(ai, brown1, brown2, lBlue1, lBlue2, lBlue3, magenta1, magenta2, magenta3, orange1, orange2, orange3, red1, red2, red3, yellow1, yellow2, yellow3, green1, green2, green3, blue1, blue2, go, gameDice);
				System.out.println("Done Initializing");
			}
		});
	}
	public boolean getRunning(){
		return running;
	}
}
