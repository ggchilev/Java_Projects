
public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null)
		this.name = name;
	}

//	@Override
//	public boolean equals(Object person) {
//		if(person instanceof Person){
//			Person anotherPerson = (Person) person;
//			return (this.getName().equals(anotherPerson.getName()) && this.getAge()==anotherPerson.getAge());
//		}
//		else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		
//		return age*name.hashCode();
//	
//	}
	
	
	@Override
	public int compareTo(Person person) {
	
					
		if(this.getName().equals(person.getName())){
			if(this.age>person.age){
				return 1;
			}
			if(this.age<person.age){
				return -1;
			}
			return 0;
		}
		else {
			return this.getName().compareTo(person.getName());
		}
		
		
	}
	
	
	
}
