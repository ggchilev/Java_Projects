package rectangles;



public class Trapezoid extends ConvexQuadrilateral {

	private double height;
	
	public Trapezoid(double a, double b, double c, double d, double height, String name) {
		super(a, b, c, d, name);
		setHeight(height);
	}

	@Override
	public void Area() {
		
		double s = 0;
		s = ((getA() + getB())*height)/2;
		System.out.println("The area of the "+getName()+" is "+s);
		
	}

	@Override
	public void Perimeter() {
		
		double p=0;
		p=(getA()+getB()+getC()+getD());
		System.out.println("The perimeter of the "+getName()+" is "+p);
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0)
		this.height = height;
	}

}
