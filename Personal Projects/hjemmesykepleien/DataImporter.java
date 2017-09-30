package hjemmesykepleien;

	import java.net.*;
	import java.io.*;
	import org.json.JSONObject;


	/**
	 * -----DATAIMPORTER--------
	 * @author Odd Gunnar Aspaas
	 *	By using the java.net application and JSON objects jar I am simply using URLs to import data to a string format.
	 *  For experimenting measures I made a string called "info" and a JSON object called "jo" and storing them in the constructor.
	 *
	 */
	public class DataImporter {
		String info="";
		JSONObject jo;
		public DataImporter(String url) throws IOException{
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
			    
		}
		//----------------- SJEKKER ETTER RIKTIG ORD -------------------------------
		
		private String checkForWord(String input, String word){ // tar inn linje og ord jeg leter etter.
			if(input.contains(word)){							// Hvis linjen inneholder ordet jeg leter etter
				System.out.println("Found word in string!");	// så skrives det ut at jeg harfunnet ordet.
				int indexOfWord=input.indexOf(word);			// da finner jeg index i strengen. 
				return input.substring(indexOfWord, indexOfWord+8); // og returnerer en substring som starter med ordet og slutter med 8 char etter
			}else{
				return "";										// ellers fant jeg ikke ordet og fortsetter og lete.
			}
		}

		
		
	    public static void main(String[] args) throws Exception {
	    	DataImporter di = new DataImporter("https://maps.googleapis.com/maps/api/directions/json?origin=Lerkendal+Studentby,Trondheim&destination=Nidaros+domkirke,Trondheim&key=AIzaSyCHX81E6ImOriUlgsWDgqh8qBu1AmQ_AO0");
	    }
	}
