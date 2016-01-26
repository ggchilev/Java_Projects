
public class UseTemperature {

	public static void main(String[] args) {
		Temperature temp = new Temperature();
		temp.setNumber(90);
		temp.setScale("FARENHEIT");
		System.out.println(temp.getNumber()+" "+temp.getScale());
		
	    temp=new Temperature(21.2);
	    System.out.println(temp.getNumber()+" "+temp.getScale());
	    
	    temp=new Temperature("FARENHEIT");
	    System.out.println(temp.getNumber()+" "+temp.getScale() );
	    
	    temp=new Temperature(32,"FARENHEIT");
	    System.out.println(temp.getNumber()+" "+temp.getScale());
	    
	    TemperatureNice temp1 = new TemperatureNice();
		temp1.setNumber(90);
		temp1.setScale("FARENHEIT");
		temp1.display();
		
	    temp1=new TemperatureNice(21.2);
	    temp1.display();
	    
	    temp1=new TemperatureNice("FARENHEIT");
	    temp1.display();
	    
	    temp1=new TemperatureNice(32,"FARENHEIT");
	    temp1.display();
	}

}
