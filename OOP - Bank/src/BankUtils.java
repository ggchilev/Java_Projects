
public class BankUtils {

		public BankUtils() {
		}

		static double calculateDepositMontlyPayment(Deposit deposit){
			return 	deposit.getAmount()*deposit.getInterest()/100;		
		}
		
		static double calculateCreditMontlyPayment(Credit credit){
		      
			return credit.getAmount() + credit.getAmount()*credit.getInterest();
		
		}
	}



