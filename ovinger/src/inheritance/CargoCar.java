package inheritance;

public class CargoCar extends TrainCar{

	private int load;

	public CargoCar(int deadWeight,int load) {
		super(deadWeight);
		this.load=load;
		// TODO Auto-generated constructor stub
	}
	public int getCargoWeight(){
		return this.load;
	}
	public void setCargoWeight(int load){
		this.load=load;
	}
	@Override 
	public int getTotalWeight(){
		return this.load +this.deadWeight;
	}
	public static void main(String[] args) {
		CargoCar cc = new CargoCar(2000,4000);
		cc.setCargoWeight(5000);
		cc.setDeadWeight(1000);
		System.out.println(cc.getCargoWeight());
		System.out.println(cc.getDeadWeight());
	}

}
