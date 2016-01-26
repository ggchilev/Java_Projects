package hw11;

public class Page {

	private String title;
	private String text;
	
	Page(String title){
		setTitle(title);
	}

	boolean searchWord(String word){
		if(text.contains(word)){
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean containsDigits(){
		for ( int i = 0; i < text.length(); i++ ) {
			char c = text.charAt(i);
			 if (c>='0' && c<='9')
				 return  true;
		}

			return false;
			
	}
	
	String addText(String text){
		if(text != null){
		this.text = text;
		return this.text;
		}
		else{
			return "";
		}
	}
     void deleteText(){
    	 if(this.text != null)
    		 this.text = " ";
     }
     
    String showPage(){
    	return title+"/n"+text;
    }
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != null)
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if(text != null)
		this.text = text;
	}
	
}
