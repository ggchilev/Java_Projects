package cars;

import java.util.ArrayList;

public class Car {

	private String brand;
	private String model;
	private short year;
	private ArrayList<Part> parts = new ArrayList<Part>();
	
	public Car(String brand, String model, short year) {
		setBrand(brand);
		setModel(model);
		setYear(year);
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if(brand != null)
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year+"]";
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model != null)
		this.model = model;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		if(year > 1900 && year < 2015 )
		this.year = year;
	}
	
	
	
}
