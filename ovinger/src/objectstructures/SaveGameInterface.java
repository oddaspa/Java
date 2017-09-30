package objectstructures;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface SaveGameInterface {
	
	public String importText(String gameFile) throws IOException;
	
	public void exportText(String gameFile,TicTacToe tb) throws FileNotFoundException;
	
	
}
