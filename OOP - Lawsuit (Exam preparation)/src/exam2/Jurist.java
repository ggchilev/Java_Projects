package exam2;

public abstract class Jurist {
	

	private String name;
	private int ageOfService;
	private int numberOfCases;
	private String type;
	
	
	
	public Jurist(String name, int ageOfService, int numberOfCases) {
	     setAgeOfService(ageOfService);
	     setName(name);
	     setNumberOfCases(numberOfCases);
	     this.type = "Jurist";
	}
	
	
	void askQuestion(){
		System.out.println("The Jurist asks a question");
	}
    void writeDown(){
		System.out.println("Writing down");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
		
	public int getAgeOfService() {
		return ageOfService;
	}
	public void setAgeOfService(int ageOfService) {
		if(ageOfService >= 0)
		this.ageOfService = ageOfService;
	}
	public int getNumberOfCases() {
		return numberOfCases;
	}
	public void setNumberOfCases(int numberOfCases) {
		if(numberOfCases > 0)
		this.numberOfCases = numberOfCases;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		if(type != null)
		this.type = type;
	}


	@Override
	public String toString() {
		return "Jurist [name=" + name + ", ageOfService=" + ageOfService
				+ ", numberOfCases=" + numberOfCases + ", type=" + type + "]";
	}

}
