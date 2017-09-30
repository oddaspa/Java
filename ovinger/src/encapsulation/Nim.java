package encapsulation;

import java.util.stream.IntStream;

public class Nim {
	int pile1;
	int pile2;
	int pile3;
	int[] nim = {pile1,pile2,pile3};
	
	public Nim(){ // ???
		nim[0] = 10;
		nim[1] = 10;
		nim[2] = 10;
	}
	public Nim(int pileSize){ // ??
		nim[0] = pileSize;
		nim[1] = pileSize;
		nim[2] = pileSize;
		
	}
	public void removePieces(int number, int targetPile){
		if (isGameOver()){
			throw new IllegalStateException("Game is over.");
			
		}else if (!isValidMove(number,targetPile)){ // If valid move, remove number from target pile.
			throw new IllegalArgumentException("Not valid move.");
		}
		else{
			this.nim[targetPile]-=number;
		}
	}
	public boolean isValidMove(int number, int targetPile){
		if (isGameOver()){
			return false;
		}
		if(targetPile>2||targetPile<0){
			// throw new IllegalArgumentException("Pile does not exist.");
			return false;
		}
		if(number<=0||number>nim[targetPile]){
			// throw new IllegalArgumentException("Can not remove negative values or remove more than pile size.");
		return false;
		}
		return true;
	}
	
	public boolean isGameOver(){
		if (nim[0]==0||nim[1]==0||nim[2]==0){// sum of all scalars in the vector is zero
			return true;
		}
		else{
			return false;
			}
	}
	public int getPile(int targetPile){ // - returnerer antall brikker i haugen targetPile. 
			// if (targetPile>0 || targetPile<2){
			// 	throw new IllegalArgumentException("Error in pile number.");
			// }
		return nim[targetPile];
	}
	public String toString(){	//input nim?	//- returnerer en tekststreng som oppsummerer spillets tilstand
		return "Pile 1: "+nim[0]+"/nPile 2: "+nim[1]+"/nPile 3: "+nim[2];	
		}
	
	public static void main(String[] args){
		Nim nim2 = new Nim();
		int pile1 = 10;
		int pile2 = 10;
		int pile3 = 10;
		int[] nim = {pile1,pile2,pile3};
		// System.out.println(nim);
		System.out.println(IntStream.of(nim).sum());
		nim2.removePieces(2,0);
	}
}
