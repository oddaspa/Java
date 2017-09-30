package inheritance;

public abstract class AbstractAccount {
	protected double balance;
	abstract void deposit(double deposit);
	//- øker kontobalansen med innskutt beløp. Merk at det innskutte beløpet må være positivt. 
	// Ved ulovlig innskudd skal en IllegalArgumentException utløses.
	abstract void withdraw(double withdrawal);
	//-  Metoden kaller internalWithdraw(uttaksbeløp), som implementeres i hver subklasse. 
	// Hvis uttaksbeløpet er negativt skal metoden utløse en IllegalArgumentException. 
	abstract void internalWithdraw(double withdrawal);
	//- minsker kontobalansen med beløpet som blir tatt ut. Merk at reglene for uttak er ulik
	// for klassene som implementerer AbstractAccount, og må derfor implementeres i hver klasse. Hvis det ikke er mulig å ta ut det angitte beløpet skal metoden utløse en IllegalStateException.
	 double getBalance(){
	 return balance;
	 }
	//- returnerer kontobalansen.

}
