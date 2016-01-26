package rectangles;

public class Rectangle extends ConvexQuadrilateral {

	public Rectangle(double a, double b, double c, double d, String name) {
		super(a, b, c, d, name);
		if(a!=b || c!=d){
			setA(2);
			setB(2);
			setC(3);
			setD(3);
			}
	}

	@Override
	public void Area() {
		double s=0;
		s = getA()*getC();
		System.out.println("The area of the "+getName()+" is "+s);
	}

	@Override
	public void Perimeter() {
		double p=0;
		p=getA()+getB()+getC()+getD();
		System.out.println("The perimeter of the "+getName()+" is "+p);
	}

}
