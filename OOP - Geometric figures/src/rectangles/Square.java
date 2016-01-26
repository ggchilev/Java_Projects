package rectangles;

public class Square extends Rectangle {

	public Square(double a, double b, double c, double d, String name) {
		super(a, b, c, d, name);
		if(getA()!= getB() || getA()!=getC() || getA() != getD() || getB() != getC() || getB() != getD() || getC() != getD()){
			setA(3);
			setB(3);
			setC(3);
			setD(3);
		}
		
	}

}
