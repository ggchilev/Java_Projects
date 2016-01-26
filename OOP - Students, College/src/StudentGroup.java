
public class StudentGroup {

	String groupSubject;
	Student [] students; 
	int freePlaces;
	
	StudentGroup(){
		
		 students = new Student[5];
		 freePlaces=5;
		 
	}
	
	StudentGroup(String subject){
		
		this();
		groupSubject = "KSI";
		
	}
	
	void addStudent(Student s){
		
		
		if(s.subject.equals(groupSubject)){
			for(int i=0;i<students.length;i++){
				if(students[i]==null){
		         students[i] = s;
		         break;
				}
			}
		freePlaces--;
		}
		
	}
	
	void emptyGroup(){
		
		for(int i=0;i<students.length; i++){
			students[i] = null;
		}
		freePlaces=5;
		
	}
	
	String theBestStudent(){
		
		int maxGradeIndex = -1;
		double maxGrade = Integer.MIN_VALUE;
		for(int i=0;i<students.length;i++){
			if(students[i]!=null){
              if(students[i].grade > maxGrade){
            	  maxGrade = students[i].grade;
            	  maxGradeIndex = i;
              }
			}
			else{
				break;
			}
 		}
		return students[maxGradeIndex].name;
		
	}
	
	void printStudentsInGroup(){
		
		for(int i=0;i<students.length;i++){
			if(students[i]==null){
				continue;
			}
			System.out.println();
			System.out.println("Name : "+students[i].name);
			System.out.println("Subject : "+students[i].subject);
			System.out.println("Age : "+students[i].age);
			System.out.println("Grade : "+students[i].grade);
			System.out.println("Year in college : "+students[i].yearInCollege);
			System.out.println("isDegree : "+students[i].isDegree);
			System.out.println("Money from scholarship : "+students[i].money);
			System.out.println();
			
		}
		
	}
	
}
