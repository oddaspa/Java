package objectstructures;
import java.util.*;

public class TicTacToeStack {
	private Stack stack;
	public TicTacToeStack(){
		this.stack=new Stack();
	}
	
	public void removeLastPlay(){
		stack.pop();				// tar bort øverste spill
	}
	public void addLastPlay(int x, int y,char playerChar){
		String stackString = x +","+y+","+playerChar;
		stack.push(stackString);	// legger til nytt øverste spill
	}
	public String getLastPlay(){
		if(!stack.isEmpty()){
			return (String) stack.peek();
		}else{
			return null;
		}
	}
}
