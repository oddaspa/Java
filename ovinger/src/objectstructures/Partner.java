package objectstructures;

public class Partner {

	private String name;
	public Partner partner;
	public Partner(String name){
		this.name=name;
		this.partner=null;
		
	}
	public String getName(){
		return this.name;
	}
	public Partner getPartner(){
		return this.partner;
	}
	public void setPartner(Partner partner){
		if(partner==null){									// hvis input er null
			if(!(this.getPartner()==null)){					// sjekk om this har partner 
				this.getPartner().partner=null;			// hvis this har partner sett partners partner til null
				this.partner=null;						// sett this partner til null
			}
		}else{
			if(!(partner.getPartner()==null)){				// hvis ny partners har partner fra før
				partner.getPartner().partner=null;
				this.getPartner().partner=null;											// sett ny partners partner til null 
				this.partner=partner;					// så this partner er ny partner
				partner.partner=this;					// sett så ny partners partner til å være this
			}else{
				this.partner=partner;
				partner.partner=this;					// ellers bare link partnerene
			}
			
			
		}
	}
	public static void main(String [] args){
		Partner p1 = new Partner("Ola");
		Partner p2 = new Partner("Kari");
		Partner p3 = new Partner("Trine");
		Partner p4 = new Partner("Truls");
		p1.setPartner(p2);
		p3.setPartner(p4);
		p2.setPartner(p4);
		System.out.println(p3.partner);
		
		char a = 'A';
		char b = 'B';
		System.out.println(a>b);
		System.out.println(Math.max(a, b));
		
		
	}
}
