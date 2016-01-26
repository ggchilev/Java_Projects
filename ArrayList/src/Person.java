
public class Person {

	private String name;
	private int id;

	
	
   @Override
    public boolean equals(Object person) {
	   if(person instanceof Person){
	Person anotherPerson = (Person) person;
	return (this.name.equals(anotherPerson.name) && this.id==anotherPerson.id);
	   }
	   else return false;
}

	
      @Override
    public int hashCode() {
    	return id * name.hashCode();
    }

	





	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}



	public Person(String name, int id){
		setId(id);
		setName(name);
	
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null)
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0)
		this.id = id;
	}

	
	
	
}
