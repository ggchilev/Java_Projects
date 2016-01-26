package cars;

import java.io.ObjectInputStream.GetField;

public class CarShopDemo {

	public static void main(String[] args) {
		
		Car bmw = new Car("BMW", "316d", (short)2004);
		Car bmw2 = new Car("BMW", "320d", (short)2006);
		Car mercedes = new Car("Mercedes", "S500", (short)2014);
		Car alfra = new Car("Alfa Romeo", "147", (short)2008);
		
		Business bmwB = new Business("BMW", "Germany", "Munchen", 394324, 3214);
		Business mercedesB = new Business("Mercedes", "Germany", "Stutgard", 31234, 3354);
		Business alfaB = new Business("Alfa Romeo", "Italy", "No idea", 394324, 3214);
		
		Part axis = new Part("B121", "Axis", (byte)1, 400, 200, bmwB);
		Part tire = new Part("B122", "Tire", (byte)2, 200, 50, mercedesB);
		Part engine = new Part("B123", "Engine", (byte)3, 1400, 800, alfaB);
		Part accessories = new Part("B124", "Accessories", (byte)4, 400, 200, bmwB);
		
		axis.addCar(bmw);
		axis.addCar(bmw2);
		axis.addCar(alfra);
		
        axis.showCars();
		
		
	}
	
}
