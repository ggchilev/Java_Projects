package hw9;

//Възможно е да се извика конструктор Student() без параметри , само ако
//се извика super() и в него се зададат стойности на параметрите на бащиния конструктор Person ! 


public class Student extends Person {

	private static final int MAX_SCORE = 6;
	private static final int MIN_SCORE = 2;
	private double score;
	
	    Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		setName(name);
        setScore(score);
	}
	
	void showStudentInfo(){
		System.out.println();
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Is male : "+getIsMale());
		System.out.println("Score : "+score);
		System.out.println();
	}
	
	
	public double getScore(){
		return score;
	}
	public void setScore(double score){
		if(score>=MIN_SCORE && score <=MAX_SCORE){
			this.score = score;
		}
		else{
			this.score = MIN_SCORE;
		}
	}

}
