package patterns.observable;

public class StockIndex implements StockListener{
	StockIndex(String name, Stock... ){
		//- konstruktør som tar inn ingen, én eller flere aksjer (Stock-objekter). Stock-parameteret defineres som et såkalt varargs-parameter.  NB: StockIndex-objektet skal holdes oppdatert på aksjeprisene allerede fra det er instansiert. Dersom en indeks instansieres uten Stock-objekter, skal aksjeindeksen være 0.
	}
	void addStock(Stock ticker){
		//- metode for å legge til en aksjepris i indeksen.
	}
	void removeStock(Stock ticker){
		//- metode for å fjerne en aksjepris fra indeksen.
	}
	double getIndex(){
		//- hentemetode for indeksen.
	}
	@Override
	public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {
		// TODO Auto-generated method stub
		
	}
}
