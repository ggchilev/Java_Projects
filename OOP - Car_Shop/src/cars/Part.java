package cars;

import java.util.ArrayList;
import java.util.Iterator;

public class Part {

	private String code;
	private String name;
	private byte category;
	private double buyPrice;
	private double sellPrice;
	private ArrayList<Car> cars = new ArrayList<Car>();
	private Business business;
	
	
	public Part(String code, String name, byte category, double buyPrice,
			double sellPrice,  Business business) {
		setBusiness(business);
		setBuyPrice(buyPrice);
		setCars(cars);
		setCategory(category);
		setCode(code);
		setName(name);
		setSellPrice(sellPrice);
	}
	
	void addCar(Car car){
		if(this.business.getName().equals(car.getBrand())){
			cars.add(car);
		}
	}
		void showCars(){
		Iterator<Car> it = cars.iterator();
	    while(it.hasNext()){
	     	System.out.println(it.next());
	    		    }
	
	}
	
	@Override
		public String toString() {
			return "Part [code=" + code + ", name=" + name + ", category="
					+ category + ", buyPrice=" + buyPrice + ", sellPrice="
					+ sellPrice + ", cars=" + cars + ", business=" + business
					+ "]";
		}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		if(code != null)
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		this.name = name;
	}
	public byte getCategory() {
		return category;
	}
	public void setCategory(byte category) {
		if(category >=0 && category <= 4)
		this.category = category;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		if(buyPrice > 0)
		this.buyPrice = buyPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		if(sellPrice > 0)
		this.sellPrice = sellPrice;
	}
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		if(cars != null)
		this.cars = cars;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		if(business != null)
		this.business = business;
	}
	
	
}
