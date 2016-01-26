
public class College {

	public static void main(String[] args) {
		
		Student canko = new Student();
		Student conka = new Student("Conka", "KSI", 20);
		Student mincho = new Student("Mincho", "KSI", 20);
		Student shenka = new Student();
		Student qvcho = new Student("Qvcho", "KSI", 21);
		
		StudentGroup maths = new StudentGroup();
		StudentGroup ksi = new StudentGroup("KSI");
		
		canko.grade= 4.50;
		mincho.grade = 5.20;
		canko.name = "Canko";
		shenka.name = "Sehnka";
		canko.age=21;
		shenka.age=23;
        maths.groupSubject = "Maths";
		
		canko.receiveScholarship(4.50, 50);
		mincho.receiveScholarship(5.0, 100);
		shenka.upYear();
		canko.upYear();
		
		maths.addStudent(canko);
		maths.addStudent(shenka);
		ksi.addStudent(conka);
		ksi.addStudent(mincho);
		ksi.addStudent(qvcho);
		
		System.out.println("Group Maths :");
	    maths.printStudentsInGroup();
	    System.out.println("The best student from Maths : "+maths.theBestStudent());
	    System.out.println();
	    System.out.println("Group KSI :");
	    ksi.printStudentsInGroup();
	    System.out.println("The best student from KSI : "+ksi.theBestStudent());
	}
	
}
