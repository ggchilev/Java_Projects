package exam2;

public class Juror extends Jurist {

	private int value;
	
	public Juror( String name, int ageOfService, int numberOfCases) {
		super(name, ageOfService, numberOfCases);
		setType("Juror");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value >= 0)
		this.value = value;
	}

}
