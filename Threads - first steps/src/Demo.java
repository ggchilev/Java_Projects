
public class Demo {

	
	
	public static void main(String[] args) {
		
		 Mutex mutexA = new Mutex(false);    
		
		KonThread k = new KonThread(mutexA);
		KonThread p = new KonThread(mutexA);
		KonThread l = new KonThread(mutexA);
		
		
		
		MagareThread h = new MagareThread();
		
		
		k.setName("Qnko");
		p.setName("Misho");
		l.setName("Lilcho Arsov");
		
	//	l.setDependant(h);
		h.setDependant(l);
		
		
		k.start();
		p.start();
		l.start();
//		h.start();
		
		
		
		
	}
	
}
