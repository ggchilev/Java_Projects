
public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
		if(subject == null){
			subject = "Maths";
		}
	}
	
	Student(String name,String subject,int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		
		if(!isDegree && yearInCollege < 4){
			yearInCollege++;
		}
		else{
			System.out.println("The student is graduated");
		}
		if(yearInCollege == 4){
			isDegree = true;
		}
	}
	
	double receiveScholarship(double min,double amount){
		
		if(grade >= min && age < 30){
			money+=amount;
		}
		return money;
	
	}
	
	
	
}
