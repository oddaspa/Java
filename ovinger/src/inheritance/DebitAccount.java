package inheritance;

public class DebitAccount extends AbstractAccount{
double balance;
	@Override
	void deposit(double deposit) {
		if(deposit>0){
			balance+=deposit;
		}else{
			throw new IllegalArgumentException();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	void withdraw(double withdrawal) {
		if(withdrawal>=0){
			internalWithdraw(withdrawal);
		}else{
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	void internalWithdraw(double withdrawal) {
		if(withdrawal<=balance){
			balance-=withdrawal;			
		}else{
			throw new IllegalStateException();
		}
	}


	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	public static void main(String[] args) {
		DebitAccount db = new DebitAccount();
		db.deposit(5000);
		db.withdraw(4000);
		System.out.println(db.getBalance());
		db.withdraw(1000);
		System.out.println(db.getBalance());
		db.withdraw(1000);
	}

}
