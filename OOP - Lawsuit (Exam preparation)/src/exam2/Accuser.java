package exam2;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Accuser extends Citizen{

	private HashSet<Lawyer> lawyers2 = new HashSet<Lawyer>();
	
	public Accuser(String firstName, String secondName, String thirdName,
			String address, int age) {
		super(firstName, secondName, thirdName, address, age);
		
	}

	public Set<Lawyer> getLawyers() {
		return Collections.unmodifiableSet(lawyers2);
	}
	

	public void addLawyers(Lawyer lawyer){
		lawyers2.add(lawyer);
	}
	
	public void removeLawyers(Lawyer lawyer){
		lawyers2.remove(lawyer);
	}
	
}
