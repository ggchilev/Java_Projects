
public class Task {

   	 private String name;
	 private double workingHours;
	
	Task(String name,int workingHours){
		setName(name);
		setWorkingHours(workingHours);
	}
	

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		if(name != null){
			this.name = name;
		}
	}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours){
		if(workingHours >= 0){
			this.workingHours = workingHours;
		}
	}
	
}