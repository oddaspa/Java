package hjemmesykepleien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This class allows the input of n<21 number of patients and then creates a route for the patient with way points in the same order as
 * the patients are inserted. Keep in mind that this class uses the RouteMaker class which has the arguments (origin,destination, waypoints..).
 * The program is made for a workplace where you would start and stop at the same place, therefore we simply put the same address in both of the
 * first slots of RouteMaker.
 * 
 * @author Odd Gunnar Aspaas
 *
 */
public class PatientRouteMaker {
	private List<Patient> pasientList;
	List<Route> routes;
	public PatientRouteMaker(Patient...pasients) throws IOException{
		List<Patient> pasientList = new ArrayList<>();
		String[] addressList=new String[pasients.length];
		this.pasientList=pasientList;
		for(int i=0;i<pasients.length;i++){
			pasientList.add(pasients[i]);
			String homeAddress=pasients[i].getHomeAddress();
			addressList[i]=homeAddress;
		}
		RouteMaker rm = new RouteMaker("Dovrevegen+296,Oppdal","Dovrevegen+296,Oppdal",addressList);
		this.routes=rm.getAddressList();
	}
	
	//----------------------------TOTAL DISTANCE------------------------------------------------
	public double getTotalDistance(){
		int totalDistance = 0;
		for(int i =0;i<this.routes.size();i++){
			String distance = this.routes.get(i).getDistance();
			String pureDistance="";
			for(int j=0;j<distance.length();j++){
				if(distance.charAt(j)==','||distance.charAt(j)=='.'){
					pureDistance +=".";					
				}else if(distance.charAt(j)=='k'||distance.charAt(j)==' '||distance.charAt(j)=='m'){
					pureDistance+="";
				}else{
					pureDistance+=distance.charAt(j);
				}
			}
			totalDistance+=Float.parseFloat(pureDistance);
		}
		return totalDistance;
		
		
	}
	//----------------------------DURATION OF ROUTE------------------------------------------------
	public double getDurationRoute(){
		int totalDuration = 0;
		int hours=0;
		int mins=0;
		for(int i =0;i<this.routes.size();i++){
			String duration = this.routes.get(i).getDuration();
			if(duration.contains("hours")){
				int index =duration.indexOf('h');
				hours=Integer.parseInt((String) duration.subSequence(0,index-1));	
			
				if(duration.contains("min")){
					int index2 =duration.indexOf('m');
					mins=Integer.parseInt((String) duration.subSequence(index+6,index2-1));
				}
			}
			totalDuration += hours*60 + mins;
			
		}
		return totalDuration;
		
		
	}
	//----------------------------DURATION OF WORK------------------------------------------------
	public int getDurationWork(){
		int duration=0;
		for(int i=0; i<this.pasientList.size();i++){
			duration+=this.pasientList.get(i).getDuration();
		}
		return duration;
	}
	
	
	//-----------------------------TOTAL VISITS-------------------------------------------------
	
	public static void main(String[] args) throws IOException {
		
		Patient einar = new Patient("Einar",121195,"Togvollan,Oppdal",'B',30);
		Patient gunnar = new Patient("Gunnar",241295,"Driva,Oppdal",'A',30);
		Patient andreas = new Patient("Andreas",91191,"Mjøen,Oppdal",'A',30);
		
		PatientRouteMaker prm = new PatientRouteMaker(einar,gunnar, andreas);
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

		


		
	}

}
