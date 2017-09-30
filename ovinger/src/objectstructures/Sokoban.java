package objectstructures;

public class Sokoban {
	public final static String
	SAMPLE_LEVEL1 = "#####\n#@$.#\n#####",
	SAMPLE_LEVEL2 = "###  \n#.###\n#*$ #\n# @ #\n#####",
	SAMPLE_LEVEL3 = "#######\n#.@ # #\n#$* $ #\n#   $ #\n# ..  #\n#  *  #\n#######",
	SAMPLE_LEVEL4 = "*###########*\n#           #\n#  ... ...  #\n#  *$$ $.$  #\n# $*+$ $*$$ #\n#  *$$ $.$  #\n#  ...  .   #\n#           #\n*###########*";
	
	String map = SAMPLE_LEVEL1;
	private String sizeGenerator(String map){
		String[] rows = map.split("\n");
		int rowNr=rows.length;
		int colNr=rows[0].length();
		String sizeString = rowNr+","+colNr;
		return sizeString;
	}
	SokobanCell[][] board=new SokobanCell[5][3];
	public Sokoban(String map){
		 // random map generator?
		String[] rows = map.split("\n");
		int rowNr=rows.length;
		int colNr=rows[0].length(); 	 0  1  2  3  4 
		for(int i =0; i<rowNr;i++){ 	 5  6  7  8  9
			for(int j=0; j<colNr;j++){	10 11 12 13 14 
				if(rem(j,5)==-1){
					
				}
			}
				board[i][j]=new SokobanCell(map.charAt(i*colNr+j)); // Får se litt på denne siden
			}
			
		}
	}
	
	@Override
	public String toString(){
		String boardPiece="";
		boardPiece="";
		String[] rows = map.split("\n");
		int rowNr=rows.length;
		int colNr=rows[0].length();
		for(int i=0;i<rowNr;i++){
				if(i>0){
					boardPiece+="\n";
				}
			for(int j=0;j<colNr;j++){
				if(j<colNr-1){
					boardPiece+=board[i][j];
				}
//		}if(isFinished()){
//			boardPiece+="\nSpillet er ferdig!";
//			
//		}
	return boardPiece;
	}
	
	}
	
	
	public static void main(String[] args) {
		String map ="#####\n#@$.#\n#####";
		Sokoban sb = new Sokoban(map);
		System.out.println(sb);
		
		
	}
}
