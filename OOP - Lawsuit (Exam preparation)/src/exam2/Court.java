package exam2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Court {

	private String name;
	private String address;
	private HashSet<Jurist> jurists = new HashSet<Jurist>();
	private HashSet<Case> cases = new HashSet<Case>();
		
	public Court(String name, String address) {
		setAddress(address);
		setName(name);
	}
	
	void showAllJurists(){
		for(Jurist jurist : jurists){
			System.out.println(jurist+" has "+jurist.getNumberOfCases()+" number of cases");
		}
	}
	
	public Set<Jurist> getJurists(){
		return Collections.unmodifiableSet(jurists);
	}
	
	public void addJurists(Jurist jurist){
		jurists.add(jurist);
	}
	
	public void removeJurists(Jurist jurist){
		jurists.remove(jurist);
	}
	
	public Set<Case> getCases(){
		return Collections.unmodifiableSet(cases);
	}
	
	public void addCases(Case case1){
		cases.add(case1);
	}
	
	public void removeCases(Case case1){
		cases.remove(case1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
	    if(address != null)
		this.address = address;
	}
	
	
	
}
