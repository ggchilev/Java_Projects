package hw9;

public class Demo {

	public static void main(String[] args) {

		Person nencho = new Person("Nencho", 30, true);
		Person sashka = new Person("Sashka", 20, false);
		
		Person minka = new Student("Minka", 21 , false, 5.50);
		Person canko = new Student("Canko", 26 , true, 4.40);

		Person genko = new Employee("Genko", 39 , true, 30);
		Person mariika = new Employee("Mariika", 17 , false, 24);
		
		Person[] person = {nencho,sashka,minka,canko,genko,mariika,null,null,null,null};
		
		for(int i=0; i<person.length; i++){
			if(person[i] == null){
				continue;
			}
//                if(!(person[i] instanceof Student || person[i] instanceof Employee)){
//                	person[i].showPersonInfo();
//                }
			if(person[i] instanceof Person){
				person[i].showPersonInfo();
			}
				if(person[i] instanceof Student){
					((Student)person[i]).showStudentInfo();
				}				
				if(person[i] instanceof Employee){
					((Employee)person[i]).showEmployeeInfo();
				}
			}

		for(int i=0; i<person.length; i++){
			if(person[i] == null){
				continue;
			}
			if(person[i] instanceof Employee){
				System.out.println();
				System.out.println("Overtime ("+person[i].getName()+") "+((Employee)person[i]).calculateOvertime(2));
			}		
		}
		
	}
	
}
