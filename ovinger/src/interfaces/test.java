package interfaces;

public class test {
	
	
	
	public static int Test(int a, int b, char operator){
		if('*'==operator){
			return a*b;
			}
		else if('+'==operator){
			return a+b;
		}else if('-'==operator){
			return a-b;
		}else if('/'==operator){
			return a/b;
		}else
			throw new IllegalArgumentException("Cant do that");
	}
	
	
public static void main(String[] args) {
	char x='*';
	int a=2;
	int b =3;
	
	System.out.println(Test(a,b,x));
}
}