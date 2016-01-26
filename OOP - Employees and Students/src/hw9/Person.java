package hw9;

public class Person {
	
	private static final int MAX_AGE = 120;
	private static final int MIN_AGE = 0;
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name,int age,boolean isMale){
		setName(name);
		setAge(age);
		this.isMale=isMale;
	}
	
	void showPersonInfo(){
		System.out.println();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Is male : "+isMale);
		System.out.println();
	}
	
	
	
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name != null){
			this.name = name;
		}
		else{
			this.name = "Mincho";
		}
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age>MIN_AGE && age<MAX_AGE){
			this.age = age;
		}
		else{
			this.age = MIN_AGE;
		}
	}
	public boolean getIsMale(){
		return isMale;
	}
	public void setIsMale(boolean isMale){
		this.isMale=isMale;
	}

}
