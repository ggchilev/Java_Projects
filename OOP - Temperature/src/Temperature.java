
public class Temperature {
	double number;
	String scale;

	public Temperature(){
		number=0.0;
		scale="FARENHEIT";
	}
	public Temperature(double number){
		this.number=number;
		scale="FARENHEIT";
	}
	public Temperature(String scale){
		this.scale=scale;
		number=0.0;
	}
	public Temperature(double number, String scale){
		this.number=number;
		this.scale=scale;
	}
	public void setNumber(double number){
		this.number=number;
	}
	public double getNumber(){
		return number;
	}
	public void setScale(String scale){
		this.scale=scale;
	}
	public String getScale(){
		return scale;
	}
}
