public class Demo {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		
	Employee goshu = new Employee("Goshu",allWork);
	Employee dinko = new Employee("Dinko",allWork);
	Employee minka = new Employee("Minka",allWork);
	
	Task cleaning = new Task("cleaning", 3);
	Task washing = new Task("washing", 5);
	Task watching = new Task("watching", 10);
	Task listening = new Task("listening", 6);
	Task selling = new Task("selling", 3);
	Task buying = new Task("buying", 3);
	Task playingSport = new Task("playing sport", 7);
	Task climbing = new Task("climbing", 8);
	Task singing = new Task("singing", 7);
	Task playingGames = new Task("playing games", 4);
	
	
	allWork.addTask(cleaning);
	allWork.addTask(washing);
	allWork.addTask(watching);
	allWork.addTask(listening);
	allWork.addTask(selling);
	allWork.addTask(buying);
	allWork.addTask(playingSport);
	allWork.addTask(climbing);
	allWork.addTask(singing);
	allWork.addTask(playingGames);
	
	
	while(allWork.isAllWorkDone() == false){
	goshu.startWorkingDay();
	while(goshu.getHoursLeft() != 0)
	goshu.work();
	System.out.println();
	
	dinko.startWorkingDay();
	while(dinko.getHoursLeft() != 0)
	dinko.work();
	System.out.println();
	minka.startWorkingDay();
	while(minka.getHoursLeft() != 0)
	minka.work();
	System.out.println();
	}	
	
	
	System.out.println();
	System.out.println("All tasks are done !!!");
	
}
}