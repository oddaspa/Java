package objectstructures;



public class BattleShipBoard {
	private static String[] sampleBoard = {"...XX........XX..XXX...XX..........................X.........X...XXX...X.........X..XX..............",".XXX.......XXX....X.........X.........X....XX...X.............X..XXX....X.........X.................","................................XX.........XXX........XXXX.....XXX.....XXX.......XXX................"};
//	private void populateStringArray(){
//		sampleBoard [0]="...XX........XX..XXX...XX..........................X.........X...XXX...X.........X..XX..............";
//		sampleBoard [1]=".XXX.......XXX....X.........X.........X....XX...X.............X..XXX....X.........X.................";
//		sampleBoard [2]="................................XX.........XXX........XXXX.....XXX.....XXX.......XXX................";   
//	}	
	
	
	int rows=10;
	int cols=10;
	private BattleShipCell[][] board=new BattleShipCell[10][10]; // Logisk brett for å bruke senere 
	
	public BattleShipBoard(String in){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				board[i][j]=new BattleShipCell(in.charAt(i*10+j));
			}
		}
	}
	

	public boolean isValid(int x, int y){
		if (x>9||x<0||y>9||y<0){
			throw new IllegalArgumentException("Not within boarders.");
		}
		if(!(isOccupied(x,y))){
			return true;
		}else{
			return false;
		}
	}
	public boolean isOccupied(int x, int y){
		if (!(board[x][y]).isHit){
			return false;
		}
		return true;
	}
	public void play(int x,int y){
		if(isValid(x,y)){
			board[x][y].setIsHit(); // prøver å kalle andre klassen
			if((board[x][y]).isShip()){
				System.out.println("It's a hit!");
			}else{
				System.out.println("It's a miss...");
			}
		}else{
			throw new IllegalArgumentException("Not valid move.");
			
		}
	}
	private static int boardGenerator(){
		double boardNr=Math.floor(Math.random() * 2);
		return (int) boardNr;
	}
	
	@Override
	public String toString(){
		String boardPiece="";
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if((j%10)==0){
					boardPiece+="|"+(board[i][j]);
				}
				else if((j%10)==9){
					boardPiece+=(board[i][j])+"|"+"\n";
				}
				else{
					boardPiece+=(board[i][j]);
				}
			}
		}
		
	return boardPiece;
	}
	

	
	
	public static void main(String[] args) {
		BattleShipBoard bb = new BattleShipBoard(sampleBoard[boardGenerator()]);
		System.out.println(bb);
		bb.play(0,3);
		System.out.println(bb);
		bb.play(0,2);
		System.out.println(bb);
//		tb.getCurrentPlayer();
//		System.out.println(tb.isOccupied(2, 2));
//		tb.setCell('X',2,2);
//		System.out.println(tb.isOccupied(2, 2));
//		tb.setCell('O', 1, 1);
//		tb.setCell('X', 0, 0);
//		tb.setCell('O',0,0);		// må lage illegal 
//		System.out.print(tb);
//		tb.getInput("1,2");
	}
}
