package hjemmesykepleien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;



public class RouteMaker {
	private JSONObject jo;
	private List<Route> addressList;
	private String routeString="";
	private String origin;
	private String destination;
	
	
	/**
	 * 
	 * @param origin		Startaddresse for rute
	 * @param destination	Sluttaddresse for rute
	 * @param addresses		Mellompunktene for ruten
	 * @throws IOException
	 * 
	 * 
	 * RouteMaker forms a route from the origin to the destination through waypoints.
	 * 
	 * Using google maps api and string manipulation to make a URL.
	 * 
	 * Then using JSON.jar to extract just the info i need.
	 * 
	 * 
	 */
	public RouteMaker(String origin, String destination, String...addresses) throws IOException{
		this.origin=origin;
		this.destination=destination;
		this.setAddressList(new ArrayList<>());
		this.setRouteString("https://maps.googleapis.com/maps/api/directions/json?origin="+origin+"&destination="+destination+"&waypoints=");

		for(int i=0;i<addresses.length;i++){
			if(i==(addresses.length-1)){
				this.routeString+=(String) addresses[i];
			}else{
				this.routeString+=(String) addresses[i] +"|";
			}
			
		}
		
		this.routeString+="&key=AIzaSyCHX81E6ImOriUlgsWDgqh8qBu1AmQ_AO0";
		this.jo=new DataImporter(routeString).jo;
		List<Route> infoString = new ArrayList<>();
		JSONArray routes = this.jo.getJSONArray("routes"); // Går inn på routes array i JSON objectet
		// now get the first element:
		JSONArray legArray = routes.getJSONObject(0).getJSONArray("legs"); // LegArray
		// and so on
		
		for (int i = 0; i < legArray.length(); i++)
		{
		   	String distance =legArray.getJSONObject(i).getJSONObject("distance").getString("text");
			String duration =legArray.getJSONObject(i).getJSONObject("duration").getString("text");
		   	String startAddress = legArray.getJSONObject(i).getString("start_address");
		   	String endAddress = legArray.getJSONObject(i).getString("end_address");
		    Route r = new Route(startAddress,endAddress,distance,duration);
		    infoString.add(r);
		}
		this.setAddressList(infoString);
		}
	
	private void setRouteString(String routeString) {
		this.routeString=routeString;
		
	}
//-------------------------------------------MAIN TESTING------------------------------------------------------
	public static void main(String[] args) throws IOException {
		RouteMaker rm = new RouteMaker("Einar+Sandbergsveg+5B,Lillehammer","Ishavskattedralen,Tromso","Oppdal,Norway");
		System.out.println(rm.addressList.get(0).getStartAddress());
		System.out.println(rm.addressList.get(1).getStartAddress());
		System.out.println(rm.addressList.get(0).getDistance());
		System.out.println(rm.addressList.get(1).getDistance());
		
		
		
	}
	
	public List<Route> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(List<Route> addressList) {
		this.addressList = addressList;
	}
}


