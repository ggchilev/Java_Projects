public class Report extends Letter {
	
	private Employee employee;

	public Report(Client sender,int id,String text,Employee employee) {
		super(sender,id,text);
		setEmployee(employee);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
