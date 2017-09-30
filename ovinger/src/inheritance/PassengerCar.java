package inheritance;

public class PassengerCar extends TrainCar {

	private int passengerCount;

	public PassengerCar(int deadWeight, int numberOfPassengers) {
		super(deadWeight);
		this.passengerCount=numberOfPassengers;
		// TODO Auto-generated constructor stub
	}

	@Override 
	public int getTotalWeight(){
		return this.deadWeight + this.passengerCount*80;
	}
	public int getPassengerCount(){
		return this.passengerCount;
	}
	public void setPassengerCount(int passengers){
		this.passengerCount=passengers;
		// Avg. 80kg
	}
}
