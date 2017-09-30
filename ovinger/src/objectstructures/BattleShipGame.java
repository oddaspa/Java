package objectstructures;

public class BattleShipGame {
	static int playerNumber=0;
	private static String[] sampleBoard = {"...XX........XX..XXX...XX..........................X.........X...XXX...X.........X..XX..............",".XXX.......XXX....X.........X.........X....XX...X.............X..XXX....X.........X.................","................................XX.........XXX........XXXX.....XXX.....XXX.......XXX................"};

	private static int boardGenerator(){
		double boardNr=Math.floor(Math.random() * 2);
		return (int) boardNr;
	}
	private BattleShipBoard board1= new BattleShipBoard(sampleBoard[boardGenerator()]);
	private BattleShipBoard board2= new BattleShipBoard(sampleBoard[boardGenerator()]);
	
	public BattleShipGame(){
		System.out.println("Welcome to Battle Ships!");
		
		if(playerNumber==0){
			System.out.println("Player one's turn: ");
			playerNumber++;
		}
		else{
			System.out.println("Player two's turn: ");
			playerNumber-=1;
			}
	
	
	}
	
	public void getInput(String in) {
		String[] parts = in.split(",");
		String part1 = parts[0];
		String part2 = parts[1];
		int x = Integer.parseInt(part1);
		int y = Integer.parseInt(part2);
		BattleShipBoard board=getBoard();
		board.play(x,y);
		
	}
	public BattleShipBoard getBoard(){
		if ((playerNumber%2)==0){
			return board1;
		}
		return board2;
	}
	@Override
	public String toString(){
		if ((playerNumber%2)==0){
			playerNumber++;
			return board1.toString();
		}
		playerNumber++;
		return board2.toString();
	}
	
	public static void main(String[] args) {
		BattleShipGame bb = new BattleShipGame();
		System.out.println(bb.board1);
		bb.getInput("0,0");
		System.out.println(bb.board2);
		bb.getInput("1,1");
		System.out.println("board 1");
		System.out.println(bb.board1);
		System.out.println("board 2");
		System.out.println(bb.board2);
	}
}
