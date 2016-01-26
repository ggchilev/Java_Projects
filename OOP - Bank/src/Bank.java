import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;


public class Bank implements IBank{
	
	private String name;
	private String address;
	private double moneyAmount;
	private TreeSet<Client> clients = new TreeSet<Client>();
	private HashSet<Deposit> bankDeposits = new HashSet<Deposit>();
	private HashSet<Credit> bankCredits = new HashSet<Credit>();
	private double reserve;

	
	public Bank(String name, String address, double moneyAmount) {
		setAddress(address);
		setMoneyAmount(moneyAmount);
		setName(name);
		this.reserve=getMoneyAmount()/10;
	
	}
	
	public void getDeposit(Deposit deposit){
		this.addBankDeposits(deposit);
		this.setMoneyAmount(moneyAmount+deposit.getAmount());
		reserve+=(deposit.getAmount()/10);
	}
	
	public void payInterests(){
		for(Deposit deposit : bankDeposits){
			deposit.setAmount(deposit.getAmount()+deposit.getAmount()*deposit.getInterest()/100);
		}
	}
	
	public void withdrawMoney(Client client, Deposit deposit, double money){
		if(money >= deposit.getAmount()){
			deposit.setAmount(deposit.getAmount()-money);
			client.setMoney(client.getMoney()+money);
		}
		else{
			System.out.println("There is not enought money in the bank"
					+ "");
		}
	}
	
	public void deposeMoney(Client client, Deposit deposit, double money){
		if(money <= client.getMoney()){
			deposit.setAmount(deposit.getAmount()+money);
			client.setMoney(client.getMoney()-money);
		}
		else{
			System.out.println("You do not have enought money");
		}
	}
	
	public void withdrawCredit(Client client, Credit credit){
		
		if(client.getCanIGerCredit()==true){
			if(this.getMoneyAmount()-credit.getAmount() > reserve){
			client.setMoney(client.getMoney() + credit.getAmount());
			credit.setAmount(0);
			this.setMoneyAmount(moneyAmount - credit.getAmount());
		}
			System.out.println("You can not withdraw credit ! The reserve is not enough");
		}
		System.out.println("The client`s salary is not enought");
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if( address != null)
		this.address = address;
	}
	public double getMoneyAmount() {
		return moneyAmount;
	}
	public void setMoneyAmount(double moneyAmount) {
		if(moneyAmount > getReserve()){
			this.moneyAmount = moneyAmount;
		}
	}
	
	public TreeSet<Client> getClients() {
		return clients; //(HashSet<Client>) Collections.unmodifiableSet(clients);
	}

	public void addClients(Client client){
		clients.add(client);
	}
	
	public void removeClients(Client client){
		clients.remove(client);
	}
	
	public HashSet<Credit> getBankCredits() {
		return  (HashSet<Credit>) Collections.unmodifiableSet(bankCredits);
	}

	public void addBankCredits(Credit bankCredit){
		bankCredits.add(bankCredit);
	}
	
	public void removeBankCredits(Credit bankCredit){
		bankCredits.remove(bankCredit);
	}
	
	public HashSet<Deposit> getBankDeposits() {
		return (HashSet<Deposit>) Collections.unmodifiableSet(bankDeposits);
	}

	public void addBankDeposits(Deposit deposit){
		bankDeposits.add(deposit);
	}
	
	public void removeBankDeposits(Deposit deposit){
		bankDeposits.remove(deposit);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name != null)
		this.name = name;
	}

	public double getReserve() {
		return reserve;
	}

	public void setReserve(double reserve) {
		this.reserve = reserve;
	}


	
}
