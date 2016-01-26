import java.util.Arrays;
import java.util.Comparator;


public class Test {

	public static void main(String[] args) {
		Letter [] letters = { new Report(new Client(1232, "Goshu", 312), 2, "jiji", new Employee("dada", 12131, "asa")),
				new Complaint(new Client(12, "dada", 312321), 3213, "dawd", true)};
		try{
				Report dailyReport =  new Report(new Client(121, "gaga", 4321), 321, "dawdwa", new Employee("dada", 321321, "dwaee"));
				Report dailyReport2 =  new Report(new Client(121, "gaga", 4321), 321, "dawdwa", new Employee("dada", 321321, "dwaee"));
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		 Comparator<Letter> cmp = new Comparator<Letter>(){
			 public int compare(Letter dailyReport,Letter dailyReport2){
				if(dailyReport.instanceOfReport && dailyReport2.instanceOfReport){ 
					Report r1=(Report)dailyReport;
					Report r2=(Report)dailyReport2;
				}
			 }
		 };
		 Arrays.sort(list,cmp);
	}

}
