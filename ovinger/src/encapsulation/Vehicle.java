package encapsulation;
/*
 *  Vehicle(char, char, String) - Konstruktør der argument-rekkefølgen må være kjøretøystype, drivstofftype og registreringsnummer. Ved ugyldige argumenter utløses unntak av typen IllegalArgumentException.
 *  getFuelType() - returnerer type drivstoff som følgende: ‘H’ for hydrogen, ‘E’ for elektrisitet, ‘D’ for diesel eller ‘G’ for bensin.
 *  getRegistrationNumber() - returnerer registreringsnummeret
 *  setRegistrationNumber(String)  - endrer registreringsnummeret dersom det er gyldig i henhold til kravene over, og utløser unntak av typen IllegalArgumentException dersom det ikke er gyldig.
 *  getVehicleType() - returnerer kjøretøystype: 'M' for motosykkel, 'C' for bil.
 */



public class Vehicle {
	private  String registrationNumber;
	private  char fuelType;
	private  char vehicleType;
	
	public Vehicle(char vehicleType, char fuelType, String registrationNumber) {
		checkRegistrationNumber(registrationNumber);
		checkFuelType(fuelType,registrationNumber);
		checkVehicleType(vehicleType,registrationNumber);
		this.fuelType=fuelType;
		this.vehicleType=vehicleType;
		this.registrationNumber=registrationNumber;
	}
	
	private void checkVehicleType(char vehicleType,String registrationNumber){
		if (!(vehicleType=='C'||vehicleType=='M')){
			throw new IllegalArgumentException("Not a valid vehicle code.");
		}
	if(registrationNumber.length()<6 || registrationNumber.length()>7){
		throw new IllegalArgumentException("Registration number is not complete.");
	}else if(registrationNumber.length()==6){
		if (!(vehicleType == 'M')){
			throw new IllegalArgumentException("Registration number length does not correspond to vehicle type.");	
		}
	}else{
		if (!(vehicleType == 'C')){
			throw new IllegalArgumentException("Registration number length does not correspond to vehicle type.");	
			}
		}
	}
	private void checkFuelType(char fuelType, String registrationNumber){
		System.out.println(registrationNumber.substring(0,1));
		if (!(fuelType=='E'||fuelType=='H'||fuelType=='D'||fuelType=='G')){ // Utelukker alle andre enn gyldige koder.
			throw new IllegalArgumentException("Not a valid fuel code.");
		}
		else if(fuelType=='H'&&registrationNumber.length()==6){ 	//Utelukker motorsykkler fra hydrogen drivstoff.
		throw new IllegalArgumentException("Motorcycles can not run on hydrogen.");
		}
		else if((fuelType=='E')&&(!(registrationNumber.substring(0,1).equals("E")))){	// Utelukker biler som bruker E skilt fra å kjøre på annet enn EL.
			throw new IllegalArgumentException("Fuel type and registration number not corresponding. (1st slot Electrical");
		}
		else if((fuelType=='E')&&(!(registrationNumber.substring(1,2).equals("L")||registrationNumber.substring(1,2).equals("K")))){	// Utelukker biler som bruker E skilt fra å kjøre på annet enn EL.
			throw new IllegalArgumentException("Fuel type and registration number not corresponding. (2nd slot Electrical)");
		}
		else if(!(fuelType=='H')&&registrationNumber.substring(0,1).equals("H")){	// Utelukker biler som bruker H skilt fra å kjøre på annet enn Hy.
			throw new IllegalArgumentException("Fuel type and registration number not corresponding. (1st slot Hydrogen");
		}
		else if((fuelType=='H')&&!(registrationNumber.substring(1,2).equals("Y"))){  // forsikrer om at HY skilt blir brukt til Hydrogen biler.
			throw new IllegalArgumentException("Fuel type and registration number not corresponding. (2nd slot Electrical");
		}
		else if((fuelType=='D'||fuelType=='G')&&((registrationNumber.substring(0,2).equals("EK"))||(registrationNumber.substring(0,2).equals("EL"))||(registrationNumber.substring(0,2).equals("HY")))){
			throw new IllegalArgumentException("Fuel type and registration number not corresponding. (missmatch gas");
		}
	}
	private void checkRegistrationNumber(String registrationNumber){ 			// String scan? 
		if((Character.isLetter(registrationNumber.charAt(2)))){
			throw new IllegalArgumentException("More than two letters in registration number is not allowed.");
		}
		if (registrationNumber.substring(0,1).toLowerCase().equals(registrationNumber.substring(0,1))){
			throw new IllegalArgumentException("Lower case is not allowed.");
		}
		if (registrationNumber.substring(1,2).toLowerCase().equals(registrationNumber.substring(1,2))){
			throw new IllegalArgumentException("Lower case is not allowed.");
		}
		if((registrationNumber.length()==6)&&(!(vehicleType=='M')))
			throw new IllegalArgumentException("Lower case is not allowed.");
			if(registrationNumber.substring(0,1).equals("Æ")||registrationNumber.substring(0,1).equals("Ø")||registrationNumber.substring(0,1).equals("Å")){
				throw new IllegalArgumentException("Æ,Ø and Å characters are not allowed in registration number.");
			}
			if(registrationNumber.substring(1,2).equals("Æ")||registrationNumber.substring(1,2).equals("Ø")||registrationNumber.substring(1,2).equals("Å")){
				throw new IllegalArgumentException("Æ,Ø and Å characters are not allowed in registration number.");
			}
	} 
	public char getFuelType(){
			
		return fuelType;
	}
	public String getRegistrationNumber(){
		return registrationNumber;
	}
	public String setRegistrationNumber(String registraionNumber){
		checkRegistrationNumber(registraionNumber);
		checkVehicleType(vehicleType,registrationNumber);
		this.registrationNumber=registraionNumber;	
		return registraionNumber;
	}
	public char getVehicleType(){
		
		return vehicleType;
	}
public static void main(String[] args){
	Vehicle vehicle = new Vehicle('C','E', "EL13223");
	System.out.println(vehicle.getFuelType());
	System.out.println(vehicle.getVehicleType());
	}
}
