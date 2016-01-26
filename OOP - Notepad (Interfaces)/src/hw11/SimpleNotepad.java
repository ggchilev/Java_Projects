package hw11;

public class SimpleNotepad  implements INotepad{
	
	private Page[] pages;

	SimpleNotepad(int numOfPages){
		if(numOfPages > 0){
		pages = new Page[numOfPages];
		}
		else{
			pages = new Page[10];
		}
		
	}
	
	@Override
	public void addText(String text, Page page, int number) {
	
	if(number <0 || number >=pages.length){
		System.out.println("Wrong number for page");
		return;
	}
			if(pages[number] == null){
				pages[number] = page;
		    pages[number].setText(text);
		    System.out.println("Text to "+pages[number].getTitle()+" is added");
		}
			else{
				replaceText(text, page, number);
				System.out.println("Text to "+pages[number].getTitle()+" is added");
			}
	}

	@Override
	public void replaceText(String text, Page page, int number) {
		
		if(number <0 || number >pages.length){
			System.out.println("Wrong number for page");
			return;
		}
		  pages[number] = page;
		  pages[number].setText(text);
		  System.out.println("Text is replaced");
	}

	@Override
	public void deleteText(Page page) {

		if(page.getText() != null){
			page.setText("");
			System.out.println("Text is deleted");
		}
		
	}

	@Override
	public void showAllPages() {
		for(int i=0;i<pages.length;i++){
			if(pages[i] != null){
			System.out.println(pages[i].getTitle());
			System.out.println();
			System.out.println(pages[i].getText());
			System.out.println();
		}
		}
	}

	@Override
	public boolean searchWord(String word) {
		for(int i=0;i<pages.length;i++){
			if(pages[i] != null && pages[i].getText().contains(word)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i=0;i<pages.length;i++){
			if(pages[i] != null && pages[i].getText().matches(".*\\d.*")){
				System.out.println(pages[i].getText());
			}
		}
	}

}
