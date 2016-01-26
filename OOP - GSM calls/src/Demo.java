
public class Demo {

	
	
	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		GSM samsung = new GSM();		
		
		Call lastOutgoingCall = new Call();
		Call lastIncomingCall = new Call();
		
		
		nokia.insertSimCard("0835861122");
		samsung.insertSimCard("0886543222");
		
	    nokia.hasSimCard=true;
		samsung.hasSimCard=true;
		
		nokia.call("0812345673", 12);
        samsung.call("0894141456", 21);

        lastOutgoingCall.receiver = nokia.receiver;
        lastOutgoingCall.duration = nokia.duration;
        
        lastIncomingCall.receiver = samsung.receiver;
        lastIncomingCall.duration = samsung.duration;
        
        nokia.outgoingCallsDuration+=lastOutgoingCall.duration;
        samsung.outgoingCallsDuration+=lastIncomingCall.duration;
 
          nokia.getSumForCall(12);
          samsung.getSumForCall(21);

          //nokia.removeSimCard();
          //samsung.removeSimCard();
          
        System.out.println("Outgoing call :");
        nokia.printForTheLastOutgoingCall();
        System.out.println();
        System.out.println("Incomming call : ");
        samsung.printForTheLastIncomingCall();
		
	}
	
}
