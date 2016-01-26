package exam2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Defendant extends Citizen {

private HashSet<Lawyer> defLawyers = new HashSet<Lawyer>();
	
	public Defendant(String firstName, String secondName, String thirdName,
			String address, int age) {
		super(firstName, secondName, thirdName, address, age);
		
	}

	public Set<Lawyer> getDefLawyers() {
		return Collections.unmodifiableSet(defLawyers);
	}
	

	public void addLawyers(Lawyer lawyer){
		defLawyers.add(lawyer);
	}
	
	public void removeLawyers(Lawyer lawyer){
		defLawyers.remove(lawyer);
	}
	
	

}
