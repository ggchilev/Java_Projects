abstract class Person {
	private long ID;
	private String name;
	
	public Person(long id, String name){
		setID(id);
		setName(name);
	}
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
