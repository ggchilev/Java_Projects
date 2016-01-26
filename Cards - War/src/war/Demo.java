package war;

public class Demo {

    public static void main(String[] args) {
		
	Card pop = new Card(6);
	Card dama = new Card(2);
	
	System.out.println(pop.compareCards(dama));
	
    }
}