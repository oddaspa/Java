package hjemmesykepleien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


/**
 * 
 * @author Odd Gunnar Aspaas
 *	The Pasient class is to store pasients with the appropiate info nessasary for the program.
 *	The Pasient class also has a "serviceTime" attribute for storing 7 days a week of time they want to be visited.
 *	There are setters and getters for each attribute except name and birth date which is initialized in the constructor.
 *	The addServiceTime method is using a switch case function to add time to the serviceTime ArrayList.
 * 
 */
public class Patient {
	
	private String name;
	private String homeAddress;
	private char demand;
	private int duration;
	private int dateOfBirth;
	private Worker responsableWorker;
	private ArrayList<String> serviceTime=new ArrayList<>();
	private double[] location;
	/**
	 * The Patient constructor sets the name, date of birth, home address, demand of service and the approximate duration to 
	 * provide that service. The responsableWorker attribute is not set in the constructor due to many patients does not 
	 * have a responsible worker. It can be set with the addResponsiblity in the Worker class. The serviceTime arrayList
	 * consist of 7 slots of Strings initialized to be 0 due to not needing service every day.  This can be altered with 
	 * the addServiceTime method which is commented below.
	 * @param name			Name of patient
	 * @param dateOfBirth	Birth date of patient
	 * @param homeAddress	Home address of patient
	 * @param demand		Service demand of patient
	 * @param duration		Duration of visit
	 * @throws IOException 
	 */
	public Patient(String name,int dateOfBirth, String homeAddress,char demand,int duration) throws IOException{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.homeAddress=homeAddress;
		this.demand=demand;
		this.duration=duration;
		this.responsableWorker=responsableWorker;
		this.serviceTime=new ArrayList<String>();
		serviceTime.add("0"); // monday
		serviceTime.add("0"); // tuesday
		serviceTime.add("0"); // wednesday
		serviceTime.add("0"); // thursday
		serviceTime.add("0"); // friday 
		serviceTime.add("0"); // saturday
		serviceTime.add("0"); // sunday

		GeoTracker gt=new GeoTracker(this.homeAddress);
		this.location=gt.getLocation();
	}

	public double[] getLocation() {
		return this.location;
	}
	public double getLatitude(){
		return this.location[0];
	}
	public double getLongitude(){
		return this.location[1];
	}


	public Worker getResponsableWorker(){
		return this.responsableWorker;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public char getDemand() {
		return demand;
	}

	public void setSeverity(char demand) {
		this.demand = demand;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public Collection<String> getServiceTime() {
		return serviceTime;
	}
	/**
	 * The addServiceTime method is using a switch case fucntion with the parameter day.
	 * The String day is casted to lower case then tested towards the week days. If the input is
	 * invalid it throws an IllegalArgumentException.
	 * 
	 * @param day
	 * @param time
	 */

	public void addServiceTime(String day,String time) {
		String saidDay = day.toLowerCase();
		
		// Would be nice to have a format checker for time aka XX:XX
		
		String message;
		switch (saidDay) {
			case "monday":	if(this.serviceTime.get(0).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(0);
				((ArrayList<String>)this.getServiceTime()).add(0,time);
        	
			}else{
				String dummy=this.serviceTime.get(0);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(0);
				((ArrayList<String>)this.getServiceTime()).add(0,dummy);
			}     				 	
   			message="Service time added to Mondays at "+time;
            break;
			case "tuesday":	if(this.serviceTime.get(1).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(1);
				((ArrayList<String>)this.getServiceTime()).add(1,time);
        	
			}else{
				String dummy=this.serviceTime.get(1);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(1);
				((ArrayList<String>)this.getServiceTime()).add(1,dummy);
			}     				 	
   			message="Service time added to Tuesdays at "+time;
            break;
			case "wednesday":	if(this.serviceTime.get(2).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(2);
				((ArrayList<String>)this.getServiceTime()).add(2,time);
        	
			}else{
				String dummy=this.serviceTime.get(2);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(2);
				((ArrayList<String>)this.getServiceTime()).add(2,dummy);
			}     				 	
   			message="Service time added to Wednesday at "+time;
            break;
			case "thursday":	if(this.serviceTime.get(3).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(3);
				((ArrayList<String>)this.getServiceTime()).add(3,time);
        	
			}else{
				String dummy=this.serviceTime.get(3);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(3);
				((ArrayList<String>)this.getServiceTime()).add(3,dummy);
			}     				 	
   			message="Service time added to Thursday at "+time;
            break;
			case "friday":	if(this.serviceTime.get(4).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(4);
				((ArrayList<String>)this.getServiceTime()).add(4,time);
        	
			}else{
				String dummy=this.serviceTime.get(4);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(4);
				((ArrayList<String>)this.getServiceTime()).add(4,dummy);
			}     				 	
   			message="Service time added to Fridays at "+time;
            break;
			case "saturday":	if(this.serviceTime.get(5).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(5);
				((ArrayList<String>)this.getServiceTime()).add(5,time);
        	
			}else{
				String dummy=this.serviceTime.get(5);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(5);
				((ArrayList<String>)this.getServiceTime()).add(5,dummy);
			}     				 	
   			message="Service time added to Saturdays at "+time;
            break;
			case "sunday":	if(this.serviceTime.get(6).equals("0")){
				((ArrayList<String>)this.getServiceTime()).remove(6);
				((ArrayList<String>)this.getServiceTime()).add(6,time);
        	
			}else{
				String dummy=this.serviceTime.get(6);
				dummy+="|"+time;
				((ArrayList<String>)this.getServiceTime()).remove(6);
				((ArrayList<String>)this.getServiceTime()).add(6,dummy);
			}     				 	
   			message="Service time added to Sundays at "+time;
            break;

                 
			default: throw new IllegalArgumentException("Invalid day of the week: " + day);
		}
		System.out.println(message);
	}
	public static void main(String[] args) throws IOException {
		Patient erik = new Patient("Erik",100896,"Dovrevegen 296, Oppdal",'A',45);
		
		erik.addServiceTime("monday", "12:00");
		erik.addServiceTime("tuesday", "11:00");
		erik.addServiceTime("monday", "17:00");
		erik.addServiceTime("SATURDAY", "11:00");
		erik.addServiceTime("friday", "08:00");
		erik.addServiceTime("tuesday", "11:00");
		System.out.println(erik.serviceTime);
		System.out.println(erik.location[0]);
	}
}
