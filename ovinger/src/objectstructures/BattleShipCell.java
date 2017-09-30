package objectstructures;

public class BattleShipCell {

private char value;
boolean isHit=false;
	public BattleShipCell(char value){
		this.value=value;
		if(value=='X'){
			isShip=true;
		}
	}
	
	private boolean isShip = false;
	
	public boolean isShip(){ 
		return isShip;
	}
	public void setShip(){
		isShip = true;
	}

	public void setIsHit(){
		isHit=true;
	}
	public String toString(){
		if(isHit){
			return "" +value;
		}
		return "~";
	}
	
}
