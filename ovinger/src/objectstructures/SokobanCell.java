package objectstructures;

public class SokobanCell {
	char value;
	
	public SokobanCell(char c){
		this.value=c;
	}
	
	public void setWall(){
		this.value='#';
	}
	
	private boolean isWall(){
		if(this.value=='#'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setGoal(){
		this.value='.';
	}
	
	private boolean isGoal(){
		if(this.value=='.'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setBox(){
		this.value='$';
	}
	
	private boolean isBox(){
		if(this.value=='$'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setBoxOnTarget(){
		this.value='*';
	}
	
	private boolean isBoxOnTarget(){
		if(this.value='*'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setPlayer(){
		this.value='@';
	}
	
	private boolean isPlayer(){
		if(this.value=='@'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setPlayerOnTarget(){
		this.value='+';
	}
	
	private boolean isPlayerOnTarget(){
		if(this.value=='+'){
			return true;
		}else{
			return false;
		}
	}
	
	public void setEmptyField(){
		this.value=' ';
	}
	
	private boolean isEmptyField(){
		if(this.value==' '){
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
