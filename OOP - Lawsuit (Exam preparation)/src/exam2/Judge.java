package exam2;

public class Judge extends Jurist {

	public Judge(String name, int ageOfService, int numberOfCases) {
		super(name, ageOfService, numberOfCases);
		if(ageOfService<5){
			setAgeOfService(5);
		}
		setType("Judge");
	}

}
