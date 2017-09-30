package hjemmesykepleien;

import java.util.ArrayList;
import java.util.Collection;

public class Worker {
 
	private Collection<Patient> responsibility = new ArrayList<>();
	private String name;
	private char competence;
	public Worker(String name, char competence){
		this.name=name;
		this.competence=competence;
		this.responsibility=new ArrayList<>();
		
	}
	public Collection<Patient> getResponsibility() {
		return responsibility;
	}
	public void addResponsibility(Patient patient) {
	if(!(patient.getResponsableWorker()==null)){
		if(patient.getResponsableWorker().equals(this)){
			System.out.println("Worker already responsable for pasient.");
		}else{
			System.out.println("Removing prior responsable worker "+patient.getResponsableWorker().name+", and replacing with "+this.name+".");
			patient.getResponsableWorker().removeResponsibility(patient);
			this.responsibility.add(patient);
		}
	}else{
		this.responsibility.add(patient);
		System.out.println("Successfully added pasient "+ patient.getName()+" to "+this.name+"'s responsibility.");
		}
	}

	
	public void removeResponsibility(Patient patient) {
		this.responsibility.remove(patient);
	}
	public String getName() {
		return name;
	}
	public char getCompetence() {
		return competence;
	}
	public void setWorkGrade(char workGrade) {
		this.competence = workGrade;
	}
	public String toString(){
		this.getName();
		this.getCompetence();
		this.getResponsibility();
		return "Name: "+name+"\nCompetence: "+competence +"\nResponisiblity: "+responsibility;
		
	}
	public static void main(String[] args) {
		Patient torvald = new Patient("Torvald","05.08.95", "Dovrevegn 296", 'C', 30);
		Worker anita = new Worker("Anita",'C');
		anita.addResponsibility(torvald);
		
		System.out.println(((ArrayList<Patient>) anita.getResponsibility()).get(0).getName());
	}
	
}
