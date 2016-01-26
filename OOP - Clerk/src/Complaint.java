
public class Complaint extends Letter {

	boolean isDone;
	
	public Complaint(Client sender,int id,String text,boolean isDone){
		
		super(sender,id,text);
		setDone(isDone);
	}

	public boolean getIsDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
}
