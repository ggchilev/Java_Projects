package exam2;

public class Lawyer extends Jurist{

	public Lawyer( String name, int ageOfService, int numberOfCases) {
		super(name, ageOfService, numberOfCases);
		if(numberOfCases<10){
			setNumberOfCases(10);
		}
		setType("Lawyer");
	}
	

}
