package exam2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class Case {

	private Judge judge;
	private HashSet<Juror> jurors = new HashSet<Juror>();
	private HashSet<Witness> witnesses = new HashSet<Witness>();
	private Defendant defendant;

	
	
	public Case(Judge judge, Defendant defendant) {
		setDefendant(defendant);
		setJudge(judge);
	}
	
	abstract void conduct();
	
	public Set<Witness> getWitnesses() {
		return Collections.unmodifiableSet(witnesses);
	}
	

	public void addWitnesses(Witness witness){
		witnesses.add(witness);
	}
	
	public void removeWitnesses(Witness witness){
		witnesses.remove(witness);
	}
	
	public Set<Juror> getJurors() {
		return Collections.unmodifiableSet(jurors);
	}
	

	public  void addJurors(Juror juror){
//		if(getWitnesses().size() >= 3){
//			System.out.println("You can not put more than 3 witnesses in Civil case");
//			System.out.println(juror.getName()+" not added");
//			return;
//		}
		jurors.add(juror);
	}
	
	public Judge getJudge() {
		return judge;
	}
	public void setJudge(Judge judge) {
		if(judge != null)
		this.judge = judge;
	}
	public Defendant getDefendant() {
		return defendant;
	}
	public void setDefendant(Defendant defendant) {
		if(defendant != null)
		this.defendant = defendant;
	}


	
}
