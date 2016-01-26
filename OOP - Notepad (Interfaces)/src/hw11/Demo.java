package hw11;

public class Demo {

	public static void main(String[] args) {
		
	
	SimpleNotepad k = new SimpleNotepad(4);
	SecuredNotepad p = new SecuredNotepad(5, "Abv123"); 
	ElectronicSecuredNotepad e = new ElectronicSecuredNotepad(3, "Abv123");
	
	Page page1 = new Page("Page 1");
	Page page2 = new Page("Page 2");
	Page page3 = new Page("Page 3");
	Page page4 = new Page("Page 4");

	Page page5 = new Page("Page 5");
	Page page6 = new Page("Page 6");
	Page page7 = new Page("Page 7");
	Page page8 = new Page("Page 8");

	
	
    k.addText("G1", page1, 0);
    k.addText("g", page2, 1);
    k.addText("M", page3, 2);
    k.addText("U", page4, 3);
    k.addText("dwadw",page5,4);
    
    System.out.println(page1.searchWord("G"));
    System.out.println(page1.containsDigits());
    
    k.replaceText("Haha", page2, 1);
    k.deleteText(page3);
    
    System.out.println("Simple Notepd :");
    System.out.println();
    k.showAllPages();
    
    System.out.println(k.searchWord("G"));
    k.printAllPagesWithDigits();
    
    if(p.checkPass() == true)
    p.addText("porew", page2, 1);
    else System.out.println("Wrong password");
    if(p.checkPass() == true)
    p.addText("hhaha", page3, 2);
    else System.out.println("Wrong password");
    if(p.checkPass() == true){
    	System.out.println();
    	System.out.println("Secured Notepad : ");
    	System.out.println();
    p.showAllPages();
    }
    else System.out.println("Wrong password");
    
 e.start();
 if(e.isStarted()){
	 if(e.checkPass() == true)
 e.addText("dawdwa", page1, 0);
	 else System.out.println("Wrong password");
 }
 else System.out.println("The electronic notepad is not started");
 if(e.isStarted()){
	 if(e.checkPass() == true)
 e.addText("rokoko", page2, 1);
	 else System.out.println("Wrong password");
 }
 else System.out.println("The electronic notepad is not started");
 if(e.isStarted()){
	 if(e.checkPass() == true){
	 System.out.println();
	 System.out.println("Electronic secured notepad : ");
	 System.out.println();
  e.showAllPages();
	 }
	 else System.out.println("Wrong password");
 }
 else System.out.println("The electronic notepad is not started");
	}
}
