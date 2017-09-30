package interfaces;

public class Person1 implements Named{

	
	private String givenName;
	private String familyName;

	Person1(String givenName,String familyName){
		this.givenName=givenName;
		this.familyName=familyName;
	}
	
	@Override
	public void setGivenName(String givenName) {
		this.givenName=givenName;
	}

	@Override
	public String getGivenName() {
		// TODO Auto-generated method stub
		return this.givenName;
	}

	@Override
	public void setFamilyName(String familyName) {
		this.familyName=familyName;
		
	}

	@Override
	public String getFamilyName() {
		// TODO Auto-generated method stub
		return this.familyName;
	}

	@Override
	public void setFullName(String fullName) {
		String[] parts = fullName.split(" ");
		String part1 = parts[0]; // Given name
		String part2 = parts[1]; // Family name
		this.setGivenName(part1);
		this.setFamilyName(part2);
		
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return givenName +" "+ familyName;
	}
	
	

}
