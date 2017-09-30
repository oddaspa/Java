package stockAnalyzer;

	import java.net.*;
	import java.io.*;

	public class DataImporter {
		
		
		
		//-----------------------------Need a HTML to Text parser ------------------------------------------------
		String info="";
		public DataImporter(String url) throws IOException{
			URL webSite = new URL(url); 						
			BufferedReader in = new BufferedReader(				
			new InputStreamReader((InputStream) webSite.getContent()));		
			String inputLine;
			String infoString = "";
				while ((inputLine = in.readLine()) != null){
					for(int i=0;i<inputLine.length();i++){
						if(inputLine.charAt(i)==','){
							infoString+="\n";
						}else{
							infoString+=inputLine.charAt(i);
						}
					}
					this.info=infoString;
				}
			    in.close();
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
	    	DataImporter di = new DataImporter("https://maps.googleapis.com/maps/api/directions/json?origin=Disneyland&destination=Universal+Studios+Hollywood4&key=AIzaSyCHX81E6ImOriUlgsWDgqh8qBu1AmQ_AO0");
//	    	String info=di.info;
	    	System.out.println(di.info);
//	    	di.infoScanner(info);
	    	
	    }
	}

