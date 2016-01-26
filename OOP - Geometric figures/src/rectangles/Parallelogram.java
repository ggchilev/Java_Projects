package rectangles;

public class Parallelogram extends Rectangle{
	
	private double height;

	public Parallelogram(double a, double b, double c, double d, double height, String name) {
		super(a, b, c, d, name);
		setHeight(height);
	}

	@Override
	public void Area() {
	
		double s=0;
		s = getA()*height;
		System.out.println("The area of the "+getName()+" is "+s);;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0)
		this.height = height;
	}

}
