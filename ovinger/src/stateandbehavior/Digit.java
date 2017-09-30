package stateandbehavior;

public class Digit {
	int base;
	int digit;

	public Digit(int n){
		base=n;
	}
	public int getValue(){
		return digit;
	}
	public boolean increment(){
		if((digit+1)==base){		
		digit=0;
		return true;
		}
		else {
			digit++;
			return false;

		}
	}
	public int getBase(){
		return base;
	}
	
	public String toString(){
		return Integer.toString(digit,base);
		}
	public static void main(String[] args) {
		Digit digit = new Digit(10);
		digit.getValue();
		digit.increment();
		digit.getBase();

		}
}
