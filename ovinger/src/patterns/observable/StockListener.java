package patterns.observable;

public interface StockListener {

	void stockPriceChanged(Stock stock, double oldPrice, double newPrice);
	
	//- lyttermetode for å holde lytteren oppdatert på aksjeprisen. Metoden skal ta inn et Stock-objekt, samt gammel og ny pris. Alle lyttere må implementere denne metoden.

}
