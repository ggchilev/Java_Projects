import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;


public class Demo {

	public static void main(String[] args) {
		
		Set<Person> set = new TreeSet<Person>();
		Queue<Person> per = new ArrayBlockingQueue<Person>(5);
		
		set.add(new Person("Goshu",20));
		set.add(new Person("Anq",2));
		set.add(new Person("Minka",22));
		set.add(new Person("Geri",23));
		set.add(new Person("Anq",25));
		

		
		for(Person people : set){
			System.out.println(people.getName()+" "+people.getAge());
		}
		
	}
	
}
