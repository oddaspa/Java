package inheritance;

public class TrainCar {
	protected int deadWeight;

	public TrainCar(int deadWeight){
		this.deadWeight = deadWeight;
		
	}
	
	public int getTotalWeight(){
		return deadWeight;
	}
	public void setDeadWeight(int deadWeight){
	this.deadWeight=deadWeight;	
	}
	public int getDeadWeight(){
		return this.deadWeight;
	}
	public static void main(String[] args) {
		TrainCar tc = new TrainCar(4000);
		tc.setDeadWeight(5000);
		
	}
}
