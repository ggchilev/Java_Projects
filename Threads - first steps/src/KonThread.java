
public class KonThread extends Thread{

	Thread dependant;
	//Object mutexa = new Object();
	boolean isFinished = false;
	
	Mutex mutex;
	
	public KonThread(Mutex mutex){
		this.mutex=mutex;
	}
	
	public Thread getDependant() {
		return dependant;
	}

	public void setDependant(Thread dependant) {
		this.dependant = dependant;
	}
	

	
	
	void running()
	{
		
		
            
			for(int i=0;i<100;i++){
				if(!mutex.isFinished){	
				//System.out.println(Thread.currentThread().getName()+" e na "+i+" meter ");				
				if(i==99)
				{	
					System.out.println(Thread.currentThread().getName()+" zavurshi");
					mutex.isFinished=true;
					return;
				}
				else{
					System.out.println(Thread.currentThread().getName()+" e na "+i+" meter ");
			}
		}
            else{
            	return;
            }
			}

	}

	@Override
	 public void run() {
//		try {
//			dependant.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		running();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
	}
	
}
