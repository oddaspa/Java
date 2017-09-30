package hjemmesykepleien;

import java.io.IOException;
import java.util.ArrayList;
/**
* The PasientDistributer Class is the "main" class of the Patient Distributing Project.
* It is made to create the most efficient route for the available workers at a given day and delegate patients equally based 
* on time to each worker.
* 
* By making PasientList class and Workers class I want to make a structured and straightforwardly code that simply lets you 
* add workers to an ArrayList and patients to a different ArryList and their time of service and day of service.
* 
* The patients and workers has attributes that describes their competence and demands. The workers competence should always correspond 
* to the patients demand. This is a crucial factor in the program: maintaining service quality. To do this we need to first delegate 
* patients with high demand to workers with high competence. By simply adding the attribute competence to workers and the attribute demand 
* to patients we can compare them to give the right level of service to the patients needed. 
* 
* Logistics:
* 
* Routing:
* I am using Google Maps API and a JSON parser to retrieve information about route distance and route duration. This allows me to make
* the most efficient route for a given number of way points for the workers. This has to keep in mind that the patient has a time of the day 
* they want to be visited, the demand of the patient and the workers lunch/dinner break. 
* 
* Delegation:
* As stated earlier we have to maintain a high level of quality. This makes the delegation algorithm a bit complicated....
* 
*
* 
* @version 1.0
* @since   19.04.2017 
* @author Odd Gunnar Aspaas
*
*/
public class PatientDistributer {

	public PatientDistributer(Workers workers, WorkWeek workWeek){
		
	}
	public static ArrayList<Worker> getWorkerCompetence(Workers workers,char a){
		return workers.getWorkersCompetence(a);
	}
	public static ArrayList<Patient> getPasientDemand(PatientList patients,char a){
		return patients.getDemandedCompetence(a);
	}
	//-------------------------ALGORITME FOR PASIENT FORDELING ------------------------------
	public void firstAttempt(Workers workers,PatientList patientList){
		for(int i=0;i<patientList.getPatientsOfTheDay().size();i++){
			for(int j=0;j<workers.getWorkersOfTheDay().size();j++){
				if(patientList.getPatientsOfTheDay().get(i).getDemand()==workers.getWorkersOfTheDay().get(j).getCompetence()){
					
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		Patient snorre = new Patient("Snorre",50895, "Dovrevegn 296", 'C', 30);
		Patient einar = new Patient("Einar",121195,"Einar+Sandbergsveg+5B,Lillehammer",'B',30);
		Patient gunnar = new Patient("Gunnar",251295,"Ekromskogen+20D,Lillehammer",'A',30);
		Patient andreas = new Patient("Andreas",91189,"Sigrid+Undsetsveg,Lillehammer",'A',30);
		
		
		Worker anita = new Worker("Anita",'A');
		Worker oddg = new Worker("Odd Gunnar",'B');
		Worker erik = new Worker("Erik",'C');
		Worker lene = new Worker("Lene",'A');
		anita.addResponsibility(snorre);
		oddg.addResponsibility(einar);
		PatientList pl = new PatientList("monday");
		pl.addPatientsOfTheDay(snorre);
		pl.addPatientsOfTheDay(andreas);
		pl.addPatientsOfTheDay(gunnar);
		pl.addPatientsOfTheDay(einar);
		PatientRouteMaker prm = new PatientRouteMaker(einar,gunnar,andreas);
		System.out.print("Antall distanser: ");
		System.out.println(prm.routes.size());
		System.out.print("Første rute: ");
		System.out.println(prm.routes.get(0).getInfo());	
		System.out.print("Hele distansen: ");
		System.out.println(prm.getTotalDistance());
		System.out.print("Hele distansetiden: ");
		System.out.println(prm.getDurationRoute());
		System.out.print("Hele arbeidstiden: ");
		System.out.println(prm.getDurationWork());

		WorkWeek ww = new WorkWeek();
		ww.addToDay("tuesday", pl);
		Workers workers = new Workers("monday");
		workers.addWorkerOfTheDay(anita);
		workers.addWorkerOfTheDay(lene);
		workers.addWorkerOfTheDay(erik);
		workers.addWorkerOfTheDay(oddg);
		System.out.println(getWorkerCompetence(workers,'B'));
		System.out.println(getPasientDemand(pl,'B'));
//		System.out.println(workers);
	}
}
