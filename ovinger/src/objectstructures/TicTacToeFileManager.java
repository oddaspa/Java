package objectstructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TicTacToeFileManager implements SaveGameInterface {
	
	@Override
	public void exportText(String gameFile,TicTacToe tb) throws FileNotFoundException {		// savefunksjon ( Export toString til txt fil)
		String fileName="C:\\Users\\Odd Gunnar Aspaas\\tdt4100-2017-master2\\git\\tdt4100-2017\\ovinger\\src\\objectstructures\\" +gameFile+ ".txt";
		File file = new File (fileName);
		PrintWriter out=null;
//		try {
			out = new PrintWriter(file); // får ikke ny txt fil
//		} catch (FileNotFoundException e) {
//			System.out.println("File not created.");
//			e.printStackTrace();
//		}
		out.println(tb.toString()); // Her er feilen vil jeg tro.
		out.close();
	}
	
	@Override
	public String importText(String gameFile) throws IOException {  // import txt fil til toString??
		String fileName = "C:\\Users\\Odd Gunnar Aspaas\\tdt4100-2017-master2\\git\\tdt4100-2017\\ovinger\\src\\objectstructures\\"+gameFile+".txt";
		
		String everything="";
		BufferedReader br = null;
		try{
			br=new BufferedReader(new FileReader(fileName));
			while(br.ready()){
				everything += br.readLine();
				everything += "\n";
			}
		}catch(FileNotFoundException fnfe){
			System.err.println("Feil, fant ikke filen.");
			fnfe.printStackTrace();
		}catch(IOException ioe){
			System.err.println("Det skjeddeen annen IO-feil.");
		}finally{
			try{
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}return everything;
	}
public static void main(String[] args) throws IOException {
	TicTacToeFileManager fm = new TicTacToeFileManager();
	
	fm.exportText("testing12", new TicTacToe());
	
}
}
