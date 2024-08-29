package ui;

public class Dice {
	public static int die1;
	public static int die2;
	public static boolean doubles;
	public int total;
	public static void roll(){
		die1 = Reference.random(1, 6);
		die2 = Reference.random(1, 6);
		if (die1 == die2){
			doubles = true;
			System.out.println("Rolled Doubbles");
		}
		else {
			doubles = false;
		}
	}
	public int getRoll(){
		total = die1 + die2;
		return total;
	}
	public int getDie1(){
		return die1;
	}
	public  int getDie2(){
		return die2;
	}
}
