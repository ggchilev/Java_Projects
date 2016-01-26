
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook=false;
		operationSystem="Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
	}
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
	
        this.year=year;
        this.price = price;
        this.hardDiskMemory=hardDiskMemory;
        this.freeMemory=freeMemory;
		this.isNotebook=isNotebook;
		this.operationSystem=operationSystem;	
	}
	
	int comparePrice(Computer c){
	
		if(this.price > c.price){
			return -1;
		}
		if(this.price < c.price){
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
	void changeOperationSystem(String newOperationSystem){
		
         String temp = "";
         temp = newOperationSystem;
         newOperationSystem = operationSystem;
         operationSystem = temp;
		
	}
	
	void useMemory(int memory){
		
		if(freeMemory>memory){
		freeMemory-=memory;
		}
		else{
			System.out.println("Not free enough memory");
		}
		
	}
	
	


}
