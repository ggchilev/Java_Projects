package exam2;

public abstract class Citizen {
	
	private String firstName;
	private String secondName;
	private String thirdName;
	private String address;
	private int age;
	
	
	public Citizen(String firstName, String secondName, String thirdName,
			String address, int age) {
		setAddress(address);
		setAge(age);
		setFirstName(firstName);
		setSecondName(secondName);
		setThirdName(thirdName);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null)
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		if(secondName != null)
		this.secondName = secondName;
	}
	public String getThirdName() {
		return thirdName;
	}
	public void setThirdName(String thirdName) {
		if(thirdName != null)
		this.thirdName = thirdName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address != null)
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<120)
		this.age = age;
	}
	
	

}
