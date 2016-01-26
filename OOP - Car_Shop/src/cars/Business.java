package cars;

public class Business {

	private String name;
	private String country;
	private String address;
	private long phone;
	private int fax;
	
	
	
	public Business(String name, String country, String address, long phone,
			int fax) {
		setAddress(address);
		setCountry(country);
		setFax(fax);
		setName(name);
		setPhone(phone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		if(country != null)
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address != null)
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		if(phone > 0)
		this.phone = phone;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		if(fax > 0)
		this.fax = fax;
	}
	
	
	
}
