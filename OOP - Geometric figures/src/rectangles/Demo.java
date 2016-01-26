package rectangles;

public class Demo {

	public static void main(String[] args) {
		
		Trapezoid tr = new Trapezoid(2, 3, 4, 5, 6,"Trapezoid");
		tr.Area();
		tr.Perimeter();
		
		Parallelogram par = new Parallelogram(4, 4, 3, 3, 5,"Parallelogram");
		par.Area();
		par.Perimeter();
	
		Rhombus rho = new Rhombus(4, 4, 4, 4, 5,"Rhombus");
		rho.Area();
		rho.Perimeter();		
		
		Rectangle rec = new Rectangle(5, 5, 3, 3,"Rectangle");
		rec.Area();
		rec.Perimeter();
		
		Square sq = new Square(4, 4, 4, 4,"Square");
		sq.Area();
		sq.Perimeter();
		
		
	}
	
}
