package stateandbehavior;
public class Account {

	
	private double balance;
	private double interestRate;
	
	public void deposit(double amount){
		if (amount>0){
			balance+=amount;
		}
	}
	public void addInterest(){
		balance+=balance*interestRate/100;
	}
	public double getBalance(){
		return balance;
	}
	public double getInterestRate(){
		return interestRate;
	}
	public void setInterestRate(double rate){
		interestRate=rate;
	}
	public String toString(){
		return ("Balance: "+balance+"Interest Rate: "+interestRate);
	}
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000.0);
		account.setInterestRate(4);
		account.addInterest();
		account.getInterestRate();
		account.getBalance();
		
	}
}
