package hjemmesykepleien;

import java.util.Calendar;
import java.util.Collection;
import java.util.ArrayList;
/**
 * The WorkWeek class consists of 7 days and has a PatientList class stored in each day. This is to make the program more useful for real life
 * scenario. In this class we add a PatientList to a day using the addToDay method which has the arguments patients and day. The patients is a
 * preset list of patients and the day is a string simply stating which day to add patients to. 
 * 
 * 
 * @author Odd Gunnar Aspaas
 *
 */
public class WorkWeek{

	private  PatientList monday;
	private  PatientList tuesday;
	private  PatientList wednesday;
	private  PatientList thursday;
	private  PatientList friday;
	private  PatientList saturday;
	private  PatientList sunday;
	
	ArrayList<PatientList> workWeek;
	public WorkWeek(){

		this.workWeek = new ArrayList<PatientList>();
		this.monday=new PatientList("Monday");
		this.tuesday=new PatientList("Tuesday");
		this.wednesday=new PatientList("Wednesday");
		this.thursday=new PatientList("Thursday");
		this.friday=new PatientList("Friday");
		this.saturday=new PatientList("Saturday");
		this.sunday=new PatientList("Sunday");
		workWeek.add(monday);
		workWeek.add(tuesday);
		workWeek.add(wednesday);
		workWeek.add(thursday);
		workWeek.add(friday);
		workWeek.add(saturday);
		workWeek.add(sunday);

		
		
	}

	
	
	public PatientList getWorkForTheDay(){
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(this.workWeek.get(dayOfWeek-1)==null){
			return null;
		}else{
		return this.workWeek.get(dayOfWeek-1);
		}
	}
		
	private void addPatientsToDay(PatientList pasients,int day){
		for(int i =0;i<pasients.getPatientsOfTheDay().size();i++){
			this.workWeek.get(day).getPatientsOfTheDay().add(pasients.getPatientsOfTheDay().get(i));	
		}
	}
		
	public void addToDay(String workDay,PatientList pasientList){
		String day = workDay.toLowerCase();
		String message;
		switch (day) {
			case "monday":	addPatientsToDay(pasientList,0);
							message="Pasients added to Mondays.";
                     break;
            case "tuesday":	addPatientsToDay(pasientList,1);
							message="Pasients added to Tuesdays.";
							break;
            case "wednesday":addPatientsToDay(pasientList,2);
							message="Pasients added to Wednesday.";
							break;
            case "thursday":addPatientsToDay(pasientList,3);
							message="Pasients added to Thursday.";
							break;
            case "friday":  addPatientsToDay(pasientList,4);
							message="Pasients added to Fridays.";
                     break;
            case "saturday": addPatientsToDay(pasientList,5);
							 message="Pasients added to Saturdays.";
                     break;
            case "sunday":  addPatientsToDay(pasientList,6);
							message="Pasients added to Sundays.";
                     break;

            default: throw new IllegalArgumentException("Invalid day of the week: " + workDay);
                     
		}
		System.out.println(message);
	}
		
	public static void main(String[] args) {
		Patient torvald = new Patient("Torvald","05.08.95", "Dovrevegn 296", 'C', 30);
		Worker anita = new Worker("Anita",'C');
		anita.addResponsibility(torvald);
		PatientList pl = new PatientList("monday");
		pl.addPatientsOfTheDay(torvald);
		WorkWeek ww = new WorkWeek();
		ww.addToDay("tuesday", pl);
		System.out.println(ww.workWeek.get(1).getPatientsOfTheDay().get(0).getName());
		System.out.println(ww.getWorkForTheDay().getPatientsOfTheDay().get(0));
	
	}
}
