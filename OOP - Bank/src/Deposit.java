
public class Deposit extends BankAccount{

	
	public Deposit(String name, double interest, int period, double amount) {
		super(name, interest, period, amount);
		if(amount < 0){
			setAmount(100);
		}
	}

}
