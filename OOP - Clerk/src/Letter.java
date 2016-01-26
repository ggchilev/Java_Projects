import java.util.InputMismatchException;


abstract class Letter {
	
	private Client sender;
	private int id;
	private String text;
	protected boolean instanceOfReport;
	
	public Letter(Client sender,int id,String text){
		setSender(sender);
		setId(id);
		setText(text);
	}
	
	public Client getSender() {
		return sender;
	}
	public void setSender(Client sender) {
		this.sender = sender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
	
		return text;
	}
	public void setText(String text) {
		if(text!=null && text.length()>100)
		this.text = text;
		else
			throw new InputMismatchException();
	}
	
	
	
}
