package hjemmesykepleien;

public class Route {
	private String startAddress;
	private String endAddress;
	private String distance;
	private String duration;
	
	
	public Route(String startAddress,String endAddress, String distance, String duration){
		this.setStartAddress(startAddress);
		this.setEndAddress(endAddress);
		this.distance=distance;
		this.setDuration(duration);
	}
	
	public String getStartAddress() {
		return startAddress;
	}
	
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}
	
	public String getEndAddress() {
		return endAddress;
	}
	
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}
	
	public String getDistance() {
		return distance;
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getInfo(){
		return startAddress +"\n"+endAddress+"\n"+distance+"\n"+duration;
	}
}
