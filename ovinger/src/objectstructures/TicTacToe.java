package objectstructures;

import java.io.FileNotFoundException;
import java.io.IOException;

// Trenger hjelp til getters and setter
public class TicTacToe {
	String boardPiece;
	char playerChar='F';
	int playerNumber=0; // varierer fra 0 til 1
	int rows = 3;
	int columns = 3;
	int lastMoveX;
	int lastMoveY;
	int win=0;
	private static TicTacToeStack undoStack = new TicTacToeStack();
	private static TicTacToeStack redoStack = new TicTacToeStack();
	private static TicTacToeFileManager fileManager = new TicTacToeFileManager();
	
private char[][] board= new char[rows][columns];

	char getCell(int x, int y){ // returnerer verdien i (x,y)
	
		return board[x][y];
	}
	boolean setCell(char c,int x, int y){
		if (!(isOccupied(x, y))){
			board[x][y]=c;
			if (playerNumber==1){ //setter nytt spillernummer
				playerNumber=0;
				playerChar='X';
			}else{
				playerNumber=1;
				playerChar='O';
			}
		
		lastMoveX=x;
		lastMoveY=y;
		return true;
		}
	return false;
	}
	boolean isOccupied(int x, int y){
		if ((board[x][y]=='\0')){
			return false;
		}
		return true;
	}
	int getCurrentPlayer(){
		return playerNumber;
	}
	@Override
	public String toString(){
		boardPiece="";
		for(int i=0;i<rows;i++){
				if(i>0){
					boardPiece += "\n-----------\n";
				}
			for(int j=0;j<columns;j++){
				if(j<columns-1){
					boardPiece+=" "+board[i][j]+" "+ "|";
				}else{
					boardPiece+=" "+board[i][j];
				}		
			}
		}if(isFinished()){
			boardPiece+="\nSpillet er ferdig!";
			
		}
	return boardPiece;
	}
	
	
	void play(int x, int y){
		if(playerNumber==0){   // Hvorfor
		setCell('X',x,y);
		undoStack.addLastPlay(x, y, 'X');
		}else {
			setCell('O',x,y);
			undoStack.addLastPlay(x, y, 'O');
		}
		isFinished();
	}
	
	public void getInput(String in) {
		String[] parts = in.split(",");
		String part1 = parts[0];
		String part2 = parts[1];
		int x = Integer.parseInt(part1);
		int y = Integer.parseInt(part2);
		play(x,y);
	}
	boolean isWinner(char c){
		return checkStreak(c);
	}
	
	private boolean checkStreak(char c){
		for(int i = 0; i <rows;i++){
			if(((c==board[i][0])&&(c==board[i][1])&&(c==board[i][2]))){
				return true;
			}
		}
		for(int i = 0; i <columns;i++){
			if(((c==board[0][i])&&(c==board[1][i])&&(c==board[2][i]))){
				return true;
			}
		}
		if((c==board[0][0])&&(c==board[1][1])&&(c==board[2][2])){ // diagonal
				return true;
			}
			if(((c==board[2][0])&&(c==board[1][1])&&(c==board[0][2]))){ // invers diagonal
				return true;
		}
	return false;
	}

	boolean hasWinner(){
		if(isWinner('O') || isWinner('X')){		// vil denne kunne hente?
			return true;
		}	
		return false;
	}
	boolean isFull(){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if((board[i][j]=='\0')){
					return false;
				}
			}
		}
		return true;
	}

	boolean isFinished(){
		if(hasWinner()==true||isFull()==true){ // greier ikke å hente metode
			System.out.println("Spillet er ferdig!");
			return true;
		}
		return false;
	}
	
	public void undo(){
		if(undoStack.getLastPlay()!=null){
			String stackString = undoStack.getLastPlay();
			String[] parts = stackString.split(",");
			String xCo = parts[0];
			String yCo = parts[1];
			String playerCh = parts[2];
			int x = Integer.parseInt(xCo);
			int y = Integer.parseInt(yCo);
			redoStack.addLastPlay(x, y, playerCh.charAt(0));
			undoStack.removeLastPlay();
			board[x][y]='\0'; // setter celle til null
			if(playerNumber==1){
				playerNumber-=1;
			}else{	
				playerNumber+=1;
			}
		}else{
			//Hva skjer om undoSack er tom?
		}
	}
	public void redo(){
		if(redoStack.getLastPlay()!=null){
			String stackString = redoStack.getLastPlay();
			String[] parts = stackString.split(",");
			String xCo = parts[0];
			String yCo = parts[1];
			String playerCh = parts[2];
			int x = Integer.parseInt(xCo);
			int y = Integer.parseInt(yCo);
			undoStack.addLastPlay(x, y, playerCh.charAt(0));
			redoStack.removeLastPlay();
			setCell(playerCh.charAt(0),x,y); //legger til gammelt spill
//			if(playerCh.charAt(0)=='X'){
//				playerNumber=0;
//			}else{
//				playerNumber=1;
//			}
//			play(x,y);
		}else{
			// Hva skjer om redo er tom?
		}
	}
	public void save(String fileName) throws FileNotFoundException{
		fileManager.exportText(fileName,this);
		}
	public void load(String fileName){
		String gameFile=null;
		try {
			gameFile = fileManager.importText(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Her spalter jeg toString i rows og fjerner "----------" linene.
		String[] lines = gameFile.split("\n");
		// Oppdaterer board 
		for(int i=0;i<lines.length;i+=2){
			for(int j=1;j<lines[i].length();j+=4){
				if((i==0)&&(j==1)){
					board[i][0]=lines[i].charAt(j);
				}else{
					int x= i/2;
					int y= j/4;
					board[x][y]=lines[i].charAt(j);				
					
				}
				
			}
		}
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		TicTacToe tb = new TicTacToe();
//		tb.play(1,2);
//		tb.play(0,0); 
//		System.out.println(tb);
//		tb.undo();
//		tb.play(0,0);
//		System.out.println(redoStack.getLastPlay());
//		System.out.println(tb);
//		tb.redo();
//		System.out.println(undoStack.getLastPlay());
//		System.out.println(tb);
//		tb.play(0,2);
//		tb.play(0,0);
//		System.out.println(tb);
//		tb.play(1, 1);
//		System.out.println(tb);
//		tb.save("Testing");
		tb.load("testing");
		System.out.println(tb);
		tb.play(0, 1);
		System.out.println(tb);
		

		
	}
}
