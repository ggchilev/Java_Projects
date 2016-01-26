package exam2;

public class PublicProsecutor extends Jurist{

	public PublicProsecutor(String name, int ageOfService, int numberOfCases) {
		super(name, ageOfService, numberOfCases);
	    if(ageOfService<10){
	    	setAgeOfService(10);
	    }
	    setType("Public Prosecutor");
	}

	
	
}
