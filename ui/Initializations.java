package ui;

public class Initializations {
	public static void initSpaces(){
				//brown
				Space brown1 = new Space(60, 630, 60, "Mediterranean Avenue", "no one", "brown");
				System.out.println(brown1.getName() + " Initialized");
				Space brown2 = new Space(60, 510, 60, "Baltic Avenue", "no one", "brown");
				System.out.println(brown2.getName() + " Initialized");
				//Light Blue
				Space lBlue1 = new Space(60, 330, 100, "Oriental Avenue", "no one", "lBlue");
				System.out.println(lBlue1.getName() + " Initialized");
				Space lBlue2 = new Space(60, 210, 100, "Vermont Avenue", "no one", "lBlue");
				System.out.println(lBlue2.getName() + " Initialized");
				Space lBlue3 = new Space(60, 150, 120, "Connecticut Avenue", "no one", "lBlue");
				System.out.println(lBlue3.getName() + " Initialized");
				//Magenta
				Space magenta1 = new Space(150, 60, 140, "St. Charles Place", "no one", "magenta");
				System.out.println(magenta1.getName() + " Initialized");
				Space magenta2 = new Space(270, 60, 140, "States Avenue", "no one", "magenta");
				System.out.println(magenta2.getName() + " Initialized");
				Space magenta3 = new Space(330, 60, 160, "Virginia Avenue", "no one", "magenta");
				System.out.println(magenta3.getName() + " Initialized");
				//Orange
				Space orange1 = new Space(450, 60, 180, "St. James Place", "no one", "orange");
				System.out.println(orange1.getName() + " Initialized");
				Space orange2 = new Space(570, 60, 180, "Tennessee Avenue", "no one", "orange");
				System.out.println(orange2.getName() + " Initialized");
				Space orange3 = new Space(630, 60, 200, "New York Avenue", "no one", "orange");
				System.out.println(orange3.getName() + " Initialized");
				//Red
				Space red1 = new Space(690, 150, 220, "Kentucky Avenue", "no one", "red");
				System.out.println(red1.getName() + " Initialized");
				Space red2 = new Space(690, 270, 220,  "Indiana Avenue", "no one", "red"); 
				System.out.println(red2.getName() + " Initialized");
				Space red3 = new Space(690, 330, 240, "Illnois Avenue", "no one", "red");
				System.out.println(red3.getName() + " Initialized");
				//yellow
				Space yellow1 = new Space(690, 450, 260, "Atlantic Avenue", "no one", "yellow");
				System.out.println(yellow1.getName() + " Initialized");
				Space yellow2 = new Space(690, 510, 260, "Ventnor Avenue", "no one", "yellow");
				System.out.println(yellow2.getName() + " Initialized");
				Space yellow3 = new Space(690, 630, 280, "Marvin Gardens", "no one", "yellow");
				System.out.println(yellow3.getName() + " Initialized");
				//green
				Space green1 = new Space(630, 690, 300, "Pacific Avenue", "no one", "green");
				System.out.println(green1.getName() + " Initialized");
				Space green2 = new Space(570, 690, 300, "North Carolina Avenue", "no one", "green");
				System.out.println(green2.getName() + " Initialized");
				Space green3 = new Space(450, 690, 320, "Pennsylvania Avenue", "no one", "green");
				System.out.println(green3.getName() + " Initialized");
				//blue
				Space blue1 = new Space(270, 690, 350, "Park Place", "no one", "blue");
				System.out.println(blue1.getName() + " Initialized");
				Space blue2 = new Space(150, 690, 400, "Boardwalk", "no one", "blue");
				System.out.println(blue2.getName() + " Initialized");
				//go
				Space go = new Space(60, 720, 0, "Go", "game", "game");
				System.out.println(go.getName() + " Initialized");	
	}
	public static void initAi(){
		Ai ai = new Ai(1500, 0);
		System.out.println("Ai Initialized with " + ai.getMoney() + " dollars");
	}
	public static void initGame(Ai ai, Space brown1, Space brown2, Space lblue1, Space lblue2, Space lblue3, Space magenta1, Space magenta2, Space magenta3, Space orange1, Space orange2, Space orange3, Space red1, Space red2, Space red3, Space yellow1, Space yellow2, Space yellow3, Space green1, Space green2, Space green3, Space blue1, Space blue2, Space go, Dice dice){
		boolean running;
		System.out.println("The AI was initialized with " + ai.getMoney() + " dollars");
		/*while(running = true){
			if(ai.getMoney()>0){
				running = true;
			}
			else{
				running = false;
			}
			System.out.println("The AI rolled " + dice.getRoll());
			
		}*/
	}
}
