package interfaces;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named>{
	public int value;
	
	@Override
	public int compare(Named p1, Named p2) { // COMPARE TO METHOD ONLINE CHECK OUT YALL 
		if (p1.getFamilyName().equals(p2.getFamilyName())){
			if(p1.getGivenName().equals(p2.getGivenName())){
				return 0;
			}else{
				int l1 = p1.getGivenName().length();
				int l2 = p2.getGivenName().length();
				int sl = Math.min(l1,l2);
				for(int i=0;i<sl;i++){
					if (p1.getGivenName().charAt(i)<p2.getGivenName().charAt(i)){
						return -1;
					}else if(p1.getGivenName().charAt(i)>p2.getGivenName().charAt(i)){
						return 1;
					}
				}
				if(sl==l1){
					return -1;
				}else
					return 1;
			}
			
		}else{
			int s1 = p1.getFamilyName().length();
			int s2 = p2.getFamilyName().length();
			int ss = Math.min(s1,s2);
			for(int j=0;j<ss;j++){
				if (p1.getFamilyName().charAt(j)<p2.getFamilyName().charAt(j)){
					return -1;
				}else if(p1.getFamilyName().charAt(j)>p2.getFamilyName().charAt(j)){
					return 1;
				}
			}if(ss==s1){
				return -1;
			}else
				return 1;
		}
	}
	public static void main(String[] args) {
		Person1 p1 = new Person1("Ola", "Normann");
		Person2 p2 = new Person2("Jens Stoltenberg");
		Person1 p3 = new Person1("Jens", "Stoltenberg");
		//NamedComparator nc = new NamedComparator(p1,p3);
		System.out.println(nc.value);
		
	}
}

