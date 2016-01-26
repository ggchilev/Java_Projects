
public class TemperatureNice extends Temperature {

	public TemperatureNice(){
		super();
	}
	public TemperatureNice(double number){
		super(number);
	}
	public TemperatureNice(String scale){
	 super(scale);
	}
	public TemperatureNice(double number, String scale){
		super(number,scale);
	}
	
	public void display(){
		System.out.printf("%5.2f degrees %s\n",getNumber(),getScale());
	}
}
 