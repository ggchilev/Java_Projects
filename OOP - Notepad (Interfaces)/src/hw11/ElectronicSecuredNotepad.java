package hw11;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{

	private boolean isStarted = false;
	ElectronicSecuredNotepad(int numOfPages, String password) {
		super(numOfPages, password);

	}

	@Override
	public void start() {
		this.isStarted = true;
		
	}

	@Override
	public void stop() {
		this.isStarted = false;
		
	}

	@Override
	public boolean isStarted() {
		if(isStarted){
			return true;
		}
		else{
			return false;
		}
	}
		

}
