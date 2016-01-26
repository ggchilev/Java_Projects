
public class Demo {

	public static void main(String[] args) {
		
		Employee pesho = new Employee("Pesho");
		Employee mincho = new Employee("Mincho");
		
		Task cleaner = new Task();
		Task footballer = new Task();
		
		pesho.setCurrentTask(cleaner);
		mincho.setCurrentTask(footballer);
		
		
		pesho.setHoursLeft(6);
		mincho.setHoursLeft(4);
	
		cleaner.setName("Cleaner");
		footballer.setName("Fooballer");
		
		cleaner.setWorkingHours(12);
		footballer.setWorkingHours(2);
		
		mincho.showReport();
		pesho.showReport();
		
		
	}
	
}
