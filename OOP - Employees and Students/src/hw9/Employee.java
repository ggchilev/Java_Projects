package hw9;

public class Employee extends Person {

	private static final int MAJORITY_AGE = 18;
	private static final int DAYWORK_HOURS = 8;
	private static final double COEF_OVERTIME = 1.5;
	private static final int MIN_DAYSALARY = 20;
	private double daySalary;
	
	Employee(String name,int age,boolean isMale,double daySalary){
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	double calculateOvertime(double hours){
		if(getAge()<MAJORITY_AGE){
			return 0;
		}
		else{
			return (hours)*((daySalary/DAYWORK_HOURS)*COEF_OVERTIME);
		}
	}
	
	void showEmployeeInfo(){
		System.out.println();
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Is male : "+getIsMale());
		System.out.println("Day salary : "+daySalary);
		
	}
	
	public double getDaySalary(){
		return daySalary;
	}
	public void setDaySalary(double daySalary){
		if(daySalary>MIN_DAYSALARY){
			this.daySalary=daySalary;
		}
		else this.daySalary=MIN_DAYSALARY;
	}
	
}
