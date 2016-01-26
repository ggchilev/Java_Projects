
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	String receiver;
	int duration;
	int priceForAminute;
 
	GSM(){
		model = "nokia";
		hasSimCard=true;
		simMobileNumber="0883586111";
		outgoingCallsDuration = 0;
		
		
	}
	
	void insertSimCard(String simMobileNumber){
		
		if(simMobileNumber.length() == 10  && simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1)== '8'){ 
			hasSimCard=true;
		    this.simMobileNumber = simMobileNumber;			
		}

		
	}
	
	void removeSimCard(){
		if(hasSimCard){
		hasSimCard=false;
		}
		
	}
  
	void call(String receiver,int duration){
		this.receiver=receiver;
		this.duration = duration;
		
		if(duration<0){
			System.out.println("Invalid duration");
		 return;
		}
		if(simMobileNumber.equals(receiver)){
			System.out.println("Numbers are the same");
			
		}
		if(receiver.length() !=10){
			System.out.println("Number must be 10 numbers");
			return;
		}
		
		if(!hasSimCard){
			System.out.println("No sim card");
			return;
		
		}

	}
	
	int getSumForCall(int priceForAminute){
		this.priceForAminute=priceForAminute;
		
		return outgoingCallsDuration*priceForAminute;
	}
	void printForTheLastOutgoingCall(){
		
		if(hasSimCard == true){
		System.out.println("Duration "+duration);
		System.out.print("Sum for call : ");
		System.out.println(getSumForCall(priceForAminute));
		System.out.println("Receiver : "+receiver);
		System.out.println("Has sim card ? : "+hasSimCard);
		}
		else{
			System.out.println("There is no outgoing calls");
		}
	}
	
void printForTheLastIncomingCall(){
		
		if(hasSimCard == true){
		System.out.println("Duration "+duration);
		System.out.print("Sum for call : ");
		System.out.println(getSumForCall(priceForAminute));
		System.out.println("Receiver : "+receiver);
		System.out.println("Has sim card ? : "+hasSimCard);
		}
		else{
			System.out.println("There is no incoming calls ");
		}
	}
	
	
}
