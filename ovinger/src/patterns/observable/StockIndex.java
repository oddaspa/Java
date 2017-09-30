package patterns.observable;

public class StockIndex implements StockListener{
	StockIndex(String name, Stock... ){
		//- konstrukt�r som tar inn ingen, �n eller flere aksjer (Stock-objekter). Stock-parameteret defineres som et s�kalt varargs-parameter.  NB: StockIndex-objektet skal holdes oppdatert p� aksjeprisene allerede fra det er instansiert. Dersom en indeks instansieres uten Stock-objekter, skal aksjeindeksen v�re 0.
	}
	void addStock(Stock ticker){
		//- metode for � legge til en aksjepris i indeksen.
	}
	void removeStock(Stock ticker){
		//- metode for � fjerne en aksjepris fra indeksen.
	}
	double getIndex(){
		//- hentemetode for indeksen.
	}
	@Override
	public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {
		// TODO Auto-generated method stub
		
	}
}
