package inheritance;

public class CreditAccount extends AbstractAccount{
	double credit;
	double balance;
	public CreditAccount(double credit){
		this.credit=credit;
			
	}
	double getCreditLine(){
		return this.credit;
	}
	void setCreditLine(double credit){
		if(credit>=0){
			if(credit>=Math.abs(balance)){
				this.credit=credit;						
			}else{
				throw new IllegalStateException();
			}
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	void deposit(double deposit) {
		if(deposit>=0){
			balance+=deposit;			
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	void withdraw(double withdrawal) {
		if(withdrawal>=0){								// hvis uttakk er positivt
			if(withdrawal<=balance){					// og hvis uttak er mindre enn konto
				balance-=withdrawal;					// da tar vi bort uttak fra konto
			}else if(withdrawal<=credit+balance){		// ellers hvis uttak er mindre enn credit og konto  
				if(balance>0){							// hvis konto er over null
				withdrawal-=balance;
				balance=0;								// da tar vi bort uttak med kontosum					// og setter kontoen til negativt bløp tilsvarende rest
				internalWithdraw(withdrawal);			// kjører internalWithdraw
				}else{
					internalWithdraw(withdrawal);
				}
				}else{
				throw new IllegalStateException();
			}
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	void internalWithdraw(double withdrawal) {		// Tar inn uttak
		if(withdrawal<=credit+balance){				// hvis uttak er mindre enn creditLine + konto
			balance=-withdrawal;					// da tar vi bort uttak fra konto
		}else{										// Kommer vel aldri hit da.
			throw new IllegalStateException();
		}
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
public static void main(String[] args) {
	CreditAccount ca = new CreditAccount(10000);
	ca.deposit(20000);
	System.out.println(ca.balance);
	ca.withdraw(5000);
	System.out.println(ca.balance);
	ca.withdraw(20000);
	System.out.println(ca.balance);
	
}
}
