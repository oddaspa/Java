package patterns.observable;

public interface StockListener {

	void stockPriceChanged(Stock stock, double oldPrice, double newPrice);
	
	//- lyttermetode for � holde lytteren oppdatert p� aksjeprisen. Metoden skal ta inn et Stock-objekt, samt gammel og ny pris. Alle lyttere m� implementere denne metoden.

}
