package hjemmesykepleien;

import java.io.IOException;

public class GeoPatientCluster {
	
	public GeoPatientCluster(PatientList patientList,double limit){
		PatientList cluster1;
		for(int i = 0; i < patientList.getPatientsOfTheDay().size(); i++) {
			    for (int k = i + 1; k < patientList.getPatientsOfTheDay().size(); k++) {
			        if (Math.abs((patientList.getPatientsOfTheDay().get(i).getLatitude()-
			        		patientList.getPatientsOfTheDay().get(k).getLatitude()))<
			        		limit){
			        	if(Math.abs((patientList.getPatientsOfTheDay().get(i).getLongitude()-
			        		patientList.getPatientsOfTheDay().get(k).getLongitude()))<
			        		limit){
			        	System.out.println("works out");
			        	}
			       	}
			        		
			    }
		}
	}
	public static void main(String[] args) throws IOException {
		Patient oddg = new Patient("Odd Gunnar",50895,"Dovrevegen+Oppdal",'C',30);
		Patient oddg1 = new Patient("Odd Gunnar",50895,"GorsetVegen+Oppdal",'C',30);
		Patient oddg2 = new Patient("Odd Gunnar",50895,"Havstadvegen+11c+Trondheim",'C',30);
		PatientList pl = new PatientList("monday");
		pl.addPatientsOfTheDay(oddg);
		pl.addPatientsOfTheDay(oddg1);
		pl.addPatientsOfTheDay(oddg2);
		GeoPatientCluster gpc = new GeoPatientCluster(pl,0.01);
		
	}

}
