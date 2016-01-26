import java.io.ObjectInputStream.GetField;


public class Demo {

	public static void main(String[] args) {
		
		BankUtils bankUtil = new BankUtils();
		
		Deposit shortDeposit = new Deposit("Short Deposit", 3, 3, 120);
		Deposit longDeposit = new Deposit("Long Deposit", 5, 12, 200);
		
		Credit homeCredit = new Credit("Home Credit", 6, 6, 320, 20);
		Credit ConsumerCredit = new Credit("Consumer Credit", 10, 13, 540, 40);
		
		Bank bank = new Bank("KTB", "Bulgaria", 120000);
		
		Client gosho = new Client("Goshu", "Simitli", 1000, 4000);
		Client pesho = new Client("Pesho", "Ventren", 2000, 3500);
		Client ganka = new Client("Ganka", "Simitli", 3000, 4700);
		Client cenka = new Client("Cenka", "Simitli", 1500, 6000);
		Client marcheto = new Client("Marcheto", "Simitli", 1600, 7000);
		Client mircheto = new Client("Mircheto", "Simitli", 1700, 8000);
		Client moshko = new Client("Moshko", "Simitli", 1800, 2000);
		Client toshko = new Client("Toshko", "Simitli", 1900, 2000);
		Client geri = new Client("Geri", "Simitli", 2100, 5000);
		Client peri = new Client("Peri", "Simitli", 1100, 6000);
		
		bank.addClients(gosho);      bank.addClients(pesho);
		bank.addClients(ganka);      bank.addClients(cenka);
		bank.addClients(marcheto);   bank.addClients(mircheto);
		bank.addClients(moshko);     bank.addClients(toshko);
		bank.addClients(geri);       bank.addClients(peri);
		
	
			for(Client client : bank.getClients()){
			client.addDeposits(shortDeposit, client.getMoney()*(Math.random()*80/100+20/100) , 10, bank);	
		}
		System.out.println("The moneyAmount of the bank is "+bank.getMoneyAmount()+" leva");
		System.out.println();
		System.out.println("The reserve of the bank is "+bank.getReserve()+" leva");
	
		for(Client client : bank.getClients()){
			client.askForCredit(bankUtil, homeCredit);
			client.getCredit(homeCredit);
		}
		
		for(Client client : bank.getClients()){
		System.out.println(client.getName()+" from "+client.getAddress()+" has credits : "+client.getCredits()+" and deposits : "+client.getDeposits());
		System.out.println();
		}
		
		System.out.println("After all");
		for(Client client : bank.getClients()){
			System.out.println(client.getName()+" has "+client.getMoney()+" leva ");
			System.out.println();
		}
		
	}
	
}
