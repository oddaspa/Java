package patterns.delegation;

import java.io.IOException;
import java.io.OutputStream;

public class StreamLogger implements ILogger{
	String formatString = "%s: %s (%s)";
	private OutputStream stream;
	
	public StreamLogger(OutputStream stream){
		this.formatString=formatString;
		this.stream=stream;
		
	}

	public void setFormatString(String formatString){
		this.formatString=formatString;
	}
	public String format(String formatString, String severity, String message, Exception exception){
		String formatedMessage=String.format(formatString,severity,message,exception);
		return formatedMessage;
		
	}
	@Override
	public void log(String severity, String message, Exception exception) {
		String logMessage = format(this.formatString,  severity, message, exception);
		try {
			this.stream.write(logMessage.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
	ILogger logger = new StreamLogger(System.out);
	logger.log(ILogger.INFO, "Denne meldingen er til informasjon og skrives til System.out", null);
	
	}
}
