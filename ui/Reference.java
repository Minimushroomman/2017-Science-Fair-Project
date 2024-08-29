package ui;

public class Reference {
	public static int random(int min, int max){
		int range = max - min + 1;
		int number = (int) (range * Math.random() + min);
		return number;
	}
}
