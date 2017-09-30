package stockAnalyzer;

import java.io.IOException;

public class TickerStringMaker {

	
	public static void main(String[] args) throws IOException {
		TickerBrowser tb = new TickerBrowser("STL.OL","APPL");
		System.out.println(tb.getTickerList());
	
	}
}
