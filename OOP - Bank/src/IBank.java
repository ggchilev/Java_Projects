
public interface IBank {

	void getDeposit(Deposit deposit);
	void payInterests();
	void withdrawMoney(Client client, Deposit deposit, double money);
	void deposeMoney(Client client, Deposit deposit, double money);
	void withdrawCredit(Client client, Credit credit);
	
}
