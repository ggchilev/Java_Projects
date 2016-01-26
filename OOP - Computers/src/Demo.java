
public class Demo {

	public static void main(String[] args) {
		
		Computer acer = new Computer();
		Computer lenovo = new Computer(2013, 900, 500, 350);
		Computer macBook = new Computer(2011, 2000, true, 500, 100, "MAC");
		Computer asus = new Computer();
		
		acer.price = 1750.25;
		asus.price = 900;
		
        
        System.out.println(acer.comparePrice(lenovo));
        System.out.println(lenovo.comparePrice(macBook));
        System.out.println(asus.comparePrice(lenovo));
        

        
	}

}
