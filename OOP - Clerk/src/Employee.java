public class Employee extends Person{
	private String rank;

	public Employee(String rank, long ID, String name) throws Exception{
		super(ID,name);
		setRank(rank);
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) throws Exception {
		if(rank!=null && !rank.equals("")){
			this.rank = rank;
		} else {
			throw new Exception("noname");
		}
	}
	
}
