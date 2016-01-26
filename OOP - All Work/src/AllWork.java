
public class AllWork {

	private static final int MAX_FREEPLACES = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassaignedTask;
	
	public AllWork() {
		freePlacesForTasks = MAX_FREEPLACES;
		currentUnassaignedTask = 0;
		tasks = new Task[freePlacesForTasks];
		
	}
	
	void addTask(Task task){
		for(int i=0;i<tasks.length;i++){
			if(tasks[i] == null){
				tasks[i] = task;
				freePlacesForTasks--;
				break;
			}
		}
	}
	
	Task getNextTask(){
			return tasks[currentUnassaignedTask++];		
	}
	boolean isAllWorkDone(){
		
		for(int i=0;i<tasks.length;i++){
			if(tasks[i].getWorkingHours() !=0 )
			   return false;
		}
	   return true;

	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public int getCurrentUnassaignedTask() {
		return currentUnassaignedTask;
	}

	
}
