package ui;

public class Space {
	public int x;
	public int y;
	public int v;
	public String n;
	public String o;
	public String g;
	public Space(int xCoord, int yCoord, int value, String name, String owner, String group){
		x = xCoord;
		y = yCoord;
		v = value;
		n = name;
		o = owner;
		g = group;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getValue(){
		return v;
	}
	public String getName(){
		return n;
	}
	public String getOwner(){
		return o;
	}
	public String getGroup(){
		return g;
	}
}


