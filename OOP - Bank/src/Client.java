import java.util.Collections;
import java.util.HashSet;


public class Client implements IClient,Comparable<Client>{

	private String name;
	private String address;
	private double money;
	private double salary;
	private HashSet<Deposit> deposits = new HashSet<Deposit>();
	private HashSet<Credit> credits = new HashSet<Credit>();
	private boolean canIGerCredit;

	
	
	public Client(String name, String address, double money, double salary) {
		setAddress(address);
		setMoney(money);
		setName(name);
		setSalary(salary);
	}

	
	public void askForCredit(BankUtils bankutil, Credit credit){
		if(this.getSalary() > BankUtils.calculateCreditMontlyPayment(credit)){
			canIGerCredit = true;
		}
		else {
			canIGerCredit = false;
			System.out.println();
			System.out.println(name+"`s salary is too small to get credit");
			System.out.println();
		}
	}
	
	void getCredit(Credit credit){
		if(this.canIGerCredit==true){
			credits.add(credit);
		}
	}
	
	public void importMoneyForCredit(BankUtils bankutil, Credit credit){
		
		if(canIGerCredit = true){
		if(this.money > BankUtils.calculateCreditMontlyPayment(credit))
		this.money-=BankUtils.calculateCreditMontlyPayment(credit);
		}
		else{
			System.out.println("You have not enought money to pay the credit");
		}
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name != null)
		this.name = name;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		if(money > 0)
		this.money = money;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary > 0)
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		if(address != null)
		this.address = address;
	}

	public HashSet<Deposit> getDeposits() {
		return deposits; //(HashSet<Deposit>) Collections.unmodifiableSet(deposits);
	}

	public  void addDeposits(Deposit deposit, double money, int period, Bank bank){
		if(this.money > money)
		deposits.add(deposit);
		deposit.setAmount(money);
		deposit.setPeriod(period);
		this.money-=money;
		bank.setMoneyAmount(bank.getMoneyAmount()+money);
		bank.setReserve(bank.getMoneyAmount()/10);				
	}
	
	public void removeDeposits(Deposit deposit){
		deposits.remove(deposit);
	}
	
	public HashSet<Credit> getCredits() {
		return credits; //(HashSet<Credit>) Collections.unmodifiableSet(credits);
	}

	public void addCredits(Credit credit){
		credits.add(credit);
	}
	
	public void removeCredits(Credit credit){
		credits.remove(credit);
	}


	public boolean getCanIGerCredit() {
		return canIGerCredit;
	}


	public void setCanIGerCredit(boolean canIGerCredit) {
		this.canIGerCredit = canIGerCredit;
	}


	@Override
	public int compareTo(Client client) {
		return this.name.compareTo(client.name);
		
	}
	
}
