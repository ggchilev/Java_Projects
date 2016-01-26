package rectangles;

public abstract class Quadrilateral {
	
   private String name;
	private double a;
	private double b;
	private double c;
	private double d;
	
//	private double alfa;
//	private double beta;
//	private double gama;
//	private double delta;
	
	
	public Quadrilateral(double a, double b, double c, double d, String name) {
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setName(name);
	}
	public abstract void Area();
	public abstract void Perimeter();

	public double getA() {
		return a;
	}
	public void setA(double a) {
		if(a>0)
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		if(b>0)
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		if(c>0)
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		if(d>0)
		this.d = d;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null)
		this.name = name;
	}

}
