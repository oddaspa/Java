package hjemmesykepleien;

import java.util.ArrayList;
import java.util.Collection;

public class PatientList {
	private Collection<Patient> patientList=new ArrayList<>();
	private String dayOfWeek;
	public PatientList(String dayOfWeek){
		this.patientList=new ArrayList<>();
		this.setDayOfWeek(dayOfWeek);
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public void addAllPatients(ArrayList<Patient> pasientList){
		this.patientList.addAll(pasientList);
	}
	public ArrayList<Patient> getPatientsOfTheDay() {
		return  (ArrayList<Patient>) patientList;
	}
	public void addPatientsOfTheDay(Patient patient) {
		this.patientList.add(patient);
	}
	public void removePatientsOfTheDay(Patient patient){
		this.patientList.remove(patient);
	}
	public ArrayList<Patient> getDemandedCompetence(char a){
		ArrayList<Patient> competenceList = new ArrayList<>();
		for(int i=0; i<this.getPatientsOfTheDay().size();i++){
			if(this.getPatientsOfTheDay().get(i).getDemand()==a){
			competenceList.add(this.getPatientsOfTheDay().get(i));
			}
			
		}
		return competenceList;
	}
	
}
