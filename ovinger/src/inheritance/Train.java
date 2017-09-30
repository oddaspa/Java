package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Train {
	private List<TrainCar> trainCars;
	
	public Train(){
		this.trainCars = new ArrayList<>();
	}
	
	public void addTrainCar(TrainCar trainCar){
		if(!trainCars.contains(trainCar)){
			this.trainCars.add(trainCar);
		}
	}
	public int getTotalWeight(){
		int totalWeight=0;
		for(int i=0;i<this.trainCars.size();i++){
			totalWeight+=this.trainCars.get(i).getTotalWeight();
		}
		return totalWeight;
	}
	public boolean contains(TrainCar trainCar){
		return this.trainCars.contains(trainCar);
	}
	public int getPassengerCount(){
		int totalPassengers=0;
		for(int i=0;i<this.trainCars.size();i++){
			if(this.trainCars.get(i) instanceof PassengerCar){
				totalPassengers+=((PassengerCar)this.trainCars.get(i)).getPassengerCount();
			}
		}
		return totalPassengers;
	}
	public int getCargoWeight(){
		int totalLoad=0;
		for(int i=0;i<this.trainCars.size();i++){
			if(this.trainCars.get(i) instanceof CargoCar){
				totalLoad+=((CargoCar)this.trainCars.get(i)).getCargoWeight();
			}
		}
		return totalLoad;
	}
	@Override
	public String toString(){
		String infoString="The Train contains:";
		
		int trainLength=this.trainCars.size();
		for(int i=0;i<trainLength;i++){
			if(this.trainCars.get(i) instanceof PassengerCar){
				String typeOfCar="Passenger Car";
				
				int passengers=((PassengerCar)this.trainCars.get(i)).getPassengerCount();
				int deadWeight=this.trainCars.get(i).getDeadWeight();
				int totalWeight=((PassengerCar)this.trainCars.get(i)).getTotalWeight();
				infoString+="\nAt slot: "+i+".\n A traincar of type: "+typeOfCar+".\nDeadWeight: "+deadWeight+".\nPassengers: "+passengers+".\nTotal weight: "+totalWeight+".";
			}
			if(this.trainCars.get(i) instanceof CargoCar){
				String typeOfCar="Cargo Car";
				
				int cargoLoad=((CargoCar)this.trainCars.get(i)).getCargoWeight();
				int deadWeight=this.trainCars.get(i).getDeadWeight();
				int totalWeight=((CargoCar)this.trainCars.get(i)).getTotalWeight();
				infoString+="\nAt slot: "+i+".\nA train car of type: "+typeOfCar+".\nDeadWeight: "+deadWeight+".\nCargo load: "+cargoLoad+".\nTotal weight: "+totalWeight+".";
			}
		}
		return infoString;
		
	}
	public static void main(String[] args) {
		Train t = new Train();
		CargoCar cc = new CargoCar(3000,5000);
		PassengerCar pc = new PassengerCar(4000,60);
		t.addTrainCar(pc);
		t.addTrainCar(cc);
		System.out.println(t);
		
	}
}
