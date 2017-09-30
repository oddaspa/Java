package stateandbehavior;

public class Location {

	private int x;
	private int y;
	
	public void up(){
		y--;
	}
	public void down(){
		y++;
	}
	public void right(){
		x++;
	}
	public void left(){
		x--;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	
	
	
	
	
}
