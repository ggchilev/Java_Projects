package war;

public class Card {

	private int cardStrength; 
	private String strength;
	private String color;
	static final String[] CARD_COLOR = {"Clubs", "Diamonds", "Hearts", "Spades"}; 
	static final String[] CARD_STRENGTH =  {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	Card(int cardStrength){
		strength=CARD_STRENGTH[cardStrength];
	}

	int compareCards(Card card){
	if(this.cardStrength>card.cardStrength){
		return 1;
	}
	else return -1;
		
		}
		
	
	
	public int getCardStrength() {
		return cardStrength;
	}

	public void setStrength(int cardStrength) {
		this.cardStrength = cardStrength;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
