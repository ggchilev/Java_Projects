package exam2;

public class CivilCase extends Case {

	private Accuser accuser;
	
	public CivilCase(Judge judge, Defendant defendant, Accuser accuser) {
		super(judge, defendant);
		setAccuser(accuser);
	}

	public Accuser getAccuser() {
		return accuser;
	}

	public void setAccuser(Accuser accuser) {
		if(accuser != null)
		this.accuser = accuser;
	}

	@Override
	void conduct() {
		
		int counter1=0;
		int counter0=0;
		int judgment=0;
		
		for(Jurist jurist : getJurors()){
			int numOfCases = jurist.getNumberOfCases();
			numOfCases++;
	        jurist.setNumberOfCases(numOfCases);
	       // System.out.println(jurist+" has "+jurist.getNumberOfCases()+" cases");
		}
	
		for(Lawyer lawyers : accuser.getLawyers()){
			   for(int i=0;i<3;i++){
				   ((Jurist) accuser.getLawyers()).askQuestion();
				   System.out.print(" to the "+accuser.getFirstName());
			   }
			   for(Witness witness : getWitnesses()){
				   for(int j=0;j<2;j++){
					   ((Jurist) accuser.getLawyers()).askQuestion();
			       System.out.println("to the "+witness.getFirstName());
			   }
			   }  
			   for(Lawyer lawyer : getDefendant().getDefLawyers()){
				   for(int i=0;i<5;i++){
					   lawyer.askQuestion();
				   }  
		   }
	   
		}
		
		for(Juror juror : getJurors()){
			juror.setValue((int)(Math.random()+0.5));
			if(juror.getValue() == 1){
				counter1++;		
			}
			else{
				counter0++;
			}
		}
		if(counter1<counter0){
			System.out.println(getDefendant().getFirstName()+" is Guity");
			judgment = (int)(Math.random()*37+3);
			System.out.println("Judgment : "+judgment+" years in prison");
			return;
		}
		if(counter1>counter0){
			System.out.println(getDefendant().getFirstName()+" is Innoscent");
			return;
		}
	
	}
		
}
