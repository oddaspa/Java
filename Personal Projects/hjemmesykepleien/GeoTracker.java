package hjemmesykepleien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONObject;
/**
 * 
 * @author Odd Gunnar Aspaas
 *
 */
public class GeoTracker {
	private final String key="AIzaSyBx7EmthoQudwt1U8ZUQEAb_yve-ugQuJk";
	private double[] location;
	public double[] getLocation() {
		return this.location;
	}

	String info="";
	JSONObject jo;
	private JSONObject importURL(String url) throws IOException{
		URL webSite = new URL(url); 						
		BufferedReader in = new BufferedReader(				
		new InputStreamReader((InputStream) webSite.getContent()));		
		String inputLine ="";
				while ((inputLine = in.readLine()) != null){
				this.info+=inputLine;
				}
		    in.close();
	
	
		this.jo = new JSONObject(this.info);
		    if (! jo.getString("status").equals("OK"))
		        throw new IllegalStateException();
			return jo;

	}
	public GeoTracker(String homeAddress) throws IOException{
		String trimAddress=homeAddress.replaceAll(" ", "+");
		JSONObject oj=importURL("https://maps.googleapis.com/maps/api/geocode/json?address="+trimAddress+"&key="+key);
		double lat = oj.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lat");
		double lng = oj.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lng");
		double[] location = {lat,lng};
		this.location = location;
	}
	
	public static void main(String[] args) throws IOException {
		Patient oddg = new Patient("Odd Gunnar",50895,"Dovrevegen296+Oppdal",'C',30);
		GeoTracker gt = new GeoTracker(oddg.getHomeAddress());
		System.out.println(gt.location[0]);
	}
}
