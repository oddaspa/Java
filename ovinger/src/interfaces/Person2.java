package interfaces;

public class Person2 implements Named {

	private String fullName;
	
	public Person2(String fullName){
		this.fullName=fullName;
	}
	
	@Override
	public void setGivenName(String givenName) {
		String[] parts = fullName.split(" ");
		String part1 = parts[0]; // Given name
		String part2 = parts[1]; // Family name
		part1=givenName;
		this.fullName=part1+" "+part2;
	}

	@Override
	public String getGivenName() {
		String[] parts = fullName.split(" ");
		String part1 = parts[0]; // Given name
		//String part2 = parts[1]; // Family name
		return part1;
	}

	@Override
	public void setFamilyName(String familyName) {
		String[] parts = fullName.split(" ");
		String part1 = parts[0]; // Given name
		String part2 = parts[1]; // Family name
		part2=familyName;
		this.fullName=part1+" "+part2;
	}

	@Override
	public String getFamilyName() {
		String[] parts = fullName.split(" ");
		//String part1 = parts[0]; // Given name
		String part2 = parts[1]; // Family name
		return part2;
	}

	@Override
	public void setFullName(String fullName) {
		this.fullName=fullName;
		
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return this.fullName;
	}
	

}
