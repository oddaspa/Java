package patterns.observable;
import java.util.*;

public class Stock {
	double price;
	String ticker;
	ArrayList<StockListener> stockListeners;
	Stock(String stockCode, double price){
		this.price=price;
		this.ticker=stockCode;
		this.stockListeners=new ArrayList<StockListener>();
		
		//- en konstrukt�r som tar inn en aksjekode (ticker) og en aksjepris.
	}
	void setPrice(double price){
		if(price>=0){
			throw new IllegalArgumentException("Free stocks is just an expression.");
		}
		//- endringsmetode for aksjeprisen. Dersom aksjepris er negativ eller lik null, skal metoden utl�se en IllegalArgumentException.
		this.price=price;
	}
	
	String getTicker(){
		return this.ticker;
		//- metode for � hente aksjekoden.
	}
	double getPrice(){
		return this.price;
		//- metode for � hente aksjeprisen.
	}
	void addStockListener(StockListener stockListener){
		
		this.stockListeners.add(stockListener);
	}
	void removeStockListener(StockListener stockListener){
		
		this.stockListeners.remove(stockListener);
		//- metode for � fjerne observat�rer.
	}

}
