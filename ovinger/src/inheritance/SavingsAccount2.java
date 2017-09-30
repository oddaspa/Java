package inheritance;

public class SavingsAccount2 extends AbstractAccount{

	
	private int withdrawalLine;
	private double fee;
	double balance;
	public SavingsAccount2(int withdrawals, double fee){
		this.withdrawalLine=withdrawals;
		this.fee=fee;
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
		if(withdrawal>=0){
			this.withdrawalLine--;
			if(withdrawalLine<0){
			withdrawal+=this.fee;
			}
			if(balance-withdrawal<0){
				throw new IllegalStateException();
			}else{
			internalWithdraw(withdrawal);
			}
		}else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	void internalWithdraw(double withdrawal) {
		if(balance>=withdrawal){
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

}
