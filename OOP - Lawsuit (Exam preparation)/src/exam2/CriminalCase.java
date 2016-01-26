package exam2;

public class CriminalCase extends Case {

	private PublicProsecutor publicProsecutor;
	
	public CriminalCase(Judge judge, Defendant defendant, PublicProsecutor publicProsecutor) {
		super(judge, defendant);
	}

	public PublicProsecutor getPublicProsecutor() {
		return publicProsecutor;
	}

	public void setPublicProsecutor(PublicProsecutor publicProsecutor) {
		if(publicProsecutor != null)
		this.publicProsecutor = publicProsecutor;
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
		
		
			   for(int i=0;i<5;i++){
				 //   publicProsecutor.askQuestion();
				  // System.out.print(" to the "+getDefendant().getFirstName());
			   }
			   for(Witness witness : getWitnesses()){
				   for(int j=0;j<5;j++){
					//   publicProsecutor.askQuestion();
			       //System.out.println("to the "+witness.getFirstName());
			   }
			   }
			   // }  
			   for(Lawyer lawyer : getDefendant().getDefLawyers()){
				   for(int i=0;i<5;i++){
					   ((Jurist) getDefendant().getDefLawyers()).askQuestion();
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

//	@Override
//	public void addJurors(Juror juror) {
//		if(getWitnesses().size() >= 13){
//			System.out.println("You can not put more than 3 witnesses in Civil case");
//			System.out.println(juror.getName()+" not added");
//			return;
//		}
//		getJurors().add(juror);
//		
//	}
//		
	}


