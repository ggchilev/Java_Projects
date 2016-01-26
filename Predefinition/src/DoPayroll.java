
public class DoPayroll {
public static void main(String []args){
	

	
		Employee anEmployee=new Employee();
		FullTimeEmployee aFullTimeEmployee = new FullTimeEmployee();
		PartTimeEmployee aPartTimeEmployee = new PartTimeEmployee();
		anEmployee.setName("Janko");
		anEmployee.setJobTitle("Captain");
		aFullTimeEmployee.setWeeklySalary(333.33);
		aFullTimeEmployee.setBenefitDeduction(23.21);
		aPartTimeEmployee.setHourlyRate(12.21);
		anEmployee.cutCheck(12.00);
		System.out.println();
		System.out.println(aFullTimeEmployee.findPaymentAmount());
		System.out.println();
		System.out.println(aPartTimeEmployee.findPaymentAmount(4));

	}
	
}
