package rectangles;

public abstract class ConvexQuadrilateral extends Quadrilateral {

	public ConvexQuadrilateral(double a, double b, double c, double d, String name) {
		super(a, b, c, d, name);
		
	}

	@Override
	public abstract void Area();

	@Override
	public abstract void Perimeter();




}
