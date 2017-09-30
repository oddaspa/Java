package inheritance;

public abstract class AbstractAccount {
	protected double balance;
	abstract void deposit(double deposit);
	//- �ker kontobalansen med innskutt bel�p. Merk at det innskutte bel�pet m� v�re positivt. 
	// Ved ulovlig innskudd skal en IllegalArgumentException utl�ses.
	abstract void withdraw(double withdrawal);
	//-  Metoden kaller internalWithdraw(uttaksbel�p), som implementeres i hver subklasse. 
	// Hvis uttaksbel�pet er negativt skal metoden utl�se en IllegalArgumentException. 
	abstract void internalWithdraw(double withdrawal);
	//- minsker kontobalansen med bel�pet som blir tatt ut. Merk at reglene for uttak er ulik
	// for klassene som implementerer AbstractAccount, og m� derfor implementeres i hver klasse. Hvis det ikke er mulig � ta ut det angitte bel�pet skal metoden utl�se en IllegalStateException.
	 double getBalance(){
	 return balance;
	 }
	//- returnerer kontobalansen.

}
