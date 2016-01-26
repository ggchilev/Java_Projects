
public class MagareThread extends Thread{

	Thread dependant;
	
	public Thread getDependant() {
		return dependant;
	}

	public void setDependant(Thread dependant) {
		this.dependant = dependant;
	}

	@Override
	public void run() {
		try {
			dependant.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
		System.out.println("Magare "+i);
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
	}
	
}
