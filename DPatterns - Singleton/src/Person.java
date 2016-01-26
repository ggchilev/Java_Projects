
public class Person {

	public static class Pesho {
		static int x = 0;
		int g = 9;
	}
	public class Gosho {
		int k = 2;
	}
	
	int g=9;
	static int f = 2;
	
	private static Person instance = null;
	
	private Person(){
		//System.out.println("Ei go be");
	}
	
	public static Person getInstance(){
		if(instance == null){
			System.out.println("ei go be");
			instance = new Person();
		}
		System.out.println("nene");
		return instance;
	}
	
}
