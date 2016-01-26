
public abstract class BankAccount {
	
	private String name;
	private double interest;
	private int period;
	private double amount;
	
	
	public BankAccount(String name, double interest, int period, double amount) {
	setAmount(amount);
	setInterest(interest);
	setName(name);
	setPeriod(period);
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", interest=" + interest + ", period=" + period + ", amount=" + amount
				+ "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
        if(interest > 0)
		this.interest = interest;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		if(period >= 1 && period <= 60)
		this.period = period;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
