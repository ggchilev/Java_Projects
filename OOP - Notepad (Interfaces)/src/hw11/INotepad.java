package hw11;

public interface INotepad {

	void addText(String text,Page page,int number);
	void replaceText(String text,Page page,int number);
	void deleteText(Page page);
	void showAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
