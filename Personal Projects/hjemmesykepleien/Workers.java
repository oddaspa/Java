package hjemmesykepleien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Workers {
	private Collection<Worker> workerList=new ArrayList<>();
	private String dayOfWeek;
	public Workers(String dayOfWeek){
		this.workerList=new ArrayList<>();
		this.setDayOfWeek(dayOfWeek);
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public void addAllWorkers(ArrayList<Worker> workerList){
		this.workerList.addAll(workerList);
	}
	public ArrayList<Worker> getWorkersOfTheDay() {
		return  (ArrayList<Worker>) workerList;
	}
	public void addWorkerOfTheDay(Worker worker) {
		this.workerList.add(worker);
	}
	public void removeWorkerOfTheDay(Worker worker){
		this.workerList.remove(worker);
	}
	public ArrayList<Worker> getWorkersCompetence(char a){
		ArrayList<Worker> competenceList = new ArrayList<>();
		for(int i=0; i<this.getWorkersOfTheDay().size();i++){
			if(this.getWorkersOfTheDay().get(i).getCompetence()==a){
			competenceList.add(this.getWorkersOfTheDay().get(i));
			}
			
		}
		return competenceList;
	}
	@Override
	public String toString(){
		ArrayList<Worker> workers=this.getWorkersOfTheDay();
		String result ="These workers are present:\n";
		String responsableString="";
		for(int i=0;i<workers.size();i++){
			String name=workers.get(i).getName();
			char comp=workers.get(i).getCompetence();
			Collection<Patient> patients=workers.get(i).getResponsibility();
			for(int j=0; j<workers.get(i).getResponsibility().size();j++){
				if(j==0){
					String patientName=((ArrayList<Patient>) patients).get(i).getName();
					responsableString+=patientName;
				}else{
					responsableString+="\n"+((ArrayList<Patient>) patients).get(i).getName();
					
				}
				
			}
			result+="Name: "+name+"\nCompetence: "+comp+"\nResponsibility for patientents:\n"+responsableString+"\n\n";
			responsableString="";
		}
		
		return result;
	}
	
	
}

