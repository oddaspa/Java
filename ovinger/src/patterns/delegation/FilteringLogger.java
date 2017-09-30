package patterns.delegation;

import java.util.ArrayList;

public class FilteringLogger implements ILogger{

	private ArrayList<String> VALUES = new ArrayList<>();
	private ILogger logger;
	
	public FilteringLogger(ILogger logger, String...severities){
		this.logger=logger;
		for (int i = 0; i < severities.length; i++) {
			this.VALUES.add(severities[i]);
		}
		
		
		
	}
	void setIsLogging(String severity, boolean value){
		if(value){
			this.VALUES.add(severity); // hvordan adder jeg ?
		}else{
			this.VALUES.remove(severity); // Hvordan fjerner jeg?
		}
	}
	public boolean isLogging(String severity){
		return(this.VALUES.contains(severity)); // Sjekker om severity er i VALUES?
	}
	
	@Override
	public void log(String severity, String message, Exception exception) {
		if (VALUES.contains(severity)) {
			logger.log(severity, message, exception);
		}
		
	}


}
