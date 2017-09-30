package stockAnalyzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class TickerBrowser {
	private List<DataImporter> tickerList;
	
	private DataImporter tickerParser(String ticker) throws IOException{
		
		return new DataImporter("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22"+ticker+"%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");
		
	}
	public TickerBrowser(String...tickers) throws IOException{
			this.tickerList = new ArrayList<>();
			for(int i=0;i<tickers.length;i++){
				this.tickerList.add(tickerParser(tickers[i]));
			}
		}
	//------------------------------------RETURNS ALL TICKERINFO IN A SINGLE STRING------------------------------
	public String getTickerList(){
		String tickerListings="";
		for(int i =0; i<this.tickerList.size();i++){
			tickerListings+=((DataImporter) this.tickerList.get(i)).info;
		}
		return tickerListings;
	}
	// --------------------------------RETURNS ONLY ONE DESIRED PIECE OF INFORMATION----------------------------
	public String getInfo(String word){
		String desiredInfo="";
		for(int i = 0;i<this.tickerList.size();i++){
			String partialInfo=this.tickerList.get(i).info;
			int wordIndex=partialInfo.indexOf(word);
			int stopIndex=partialInfo.indexOf("\n", wordIndex);
			desiredInfo += partialInfo.substring(wordIndex-1, stopIndex);
		}
		return desiredInfo;
	}
	//---------------------------RETURNS CHUNK OF INFORMATION RELEVANT TO SUBJECT-------------------------------
	public String getMainInfo(){
		return this.getInfo("Name")+"\n" +this.getInfo("Currency")+"\n" +this.getInfo("EarningsShare")+"\n";
	}
	public String getDividendInfo(){
		return this.getInfo("Name")+"\n" +this.getInfo("DividendShare")+"\n" +this.getInfo("ExDividendDate")+"\n"+this.getInfo("DividendPayDate")+"\n"+this.getInfo("DividendYield")+"\n";
	}
public static void main(String[] args) throws IOException {
	TickerBrowser tb = new TickerBrowser("AAPL","YHOO");
	System.out.println(((DataImporter) tb.tickerList.get(0)).info);
	System.out.println(((DataImporter) tb.tickerList.get(1)).info);
}		
	}



