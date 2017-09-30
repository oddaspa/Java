package encapsulation;


/*
 * 	Forklar hvorfor metodene over kan sies å være en komplett innkapsling av tilstanden?
 *  - Fordi de alle har 
 *  Er denne klassen data-orientert eller tjeneste-orientert? Begrunn svaret!
 *  - 
*/

public class Account {
	private double balance;			// Eclipse ville endre til static?
	private double  interestRate;

	public Account(double balance, double interestRate) {
		if (balance<0|| interestRate<0){
			throw new IllegalArgumentException("Values can not be negative, but was balance: "+balance +" Interest rate: " + interestRate);
		}
		this.balance=balance;
		this.interestRate=interestRate;
	}
	
	double getBalance(){
		return balance;
	}
	
	double getInterestRate(){
		return interestRate;
	}
	
	void setInterestRate(double rate){
		if(rate<0){
			throw new IllegalArgumentException("Negative rate.");
		}
		interestRate=rate;
	}
	
	void deposit(double dmoney){
		if(dmoney<0){
			throw new IllegalArgumentException("Deposit value can't be negative yet it was "+dmoney);
		}
		balance+=dmoney;
	}
	
	void withdraw(double wmoney){
		if(wmoney>0){
			if (balance-wmoney<0){
				throw new IllegalArgumentException("Account balance can't be negative yet it was "+balance);
			}
		balance-=wmoney;
		}
	}
	void addInterest(){
		balance=balance + balance*interestRate/100;
	}
	public static void main(String[] args){
		Account account = new Account(10000.0, 5.0);
		account.deposit(5000.0);
		account.addInterest();
		account.getBalance();
		account.getInterestRate();
		account.withdraw(5000.0);	
		
}
}
