import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class ArrList {

	public static void main(String[] args) {
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		// faster than ArrayList in the middle and in the beggining of the list but slower in the end
//				LinkedList<Integer> linkedlist = new LinkedList<Integer>();
//		
//		numbers.add(1);
//		numbers.add(10);
//		numbers.add(2);
//		numbers.add(4);
//		numbers.add(0, 200);
//		
//		numbers.remove(1);
		
//		System.out.println(numbers.contains(10));
//		
//		for(Integer nums : numbers){
//			System.out.println(nums);
//		}
//		
//		Iterator it =  numbers.iterator();
//		while(it.hasNext()){
//			System.out.println("\n"+it.next());
//		}
		
	 // LinkedHashMap - not sorted ( remembers the order you added ) 
		// HashMap - sometimes is sorted but not always
		// treeMap - always sorted
//		HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
//		
//		map.put(1, "One");
//		map.put(10, "Ten");
//		map.put(5, "Five");
//		map.put(2, "Two");
//		
//		System.out.println(map.get(11));
//		
//		for( Map.Entry<Integer, String> hashMap : map.entrySet()){
//			System.out.println(hashMap.getKey() +": "+hashMap.getValue());
//		}
		

		// HashSet - Not ordered , LinkedHashSet - remembers the order you added , Alphabetic order
		
//		Set<String> set = new HashSet<String>();
//		
//		set.add("Rooney");
//		set.add("Canko");
//		set.add("Ronaldo");
//		set.add("Yanko");
//		
//		Set<String> set2 = new HashSet<String>();
//		
//		set2.add("Rooney");
//		set2.add("Canko");
//		set2.add("Messi");
//		set2.add("Jose");
//		
//		Set<String> gaga = new HashSet<String>(set);
//		
//		gaga.retainAll(set2);
//		System.out.println(gaga);
//		
		
		 
          Set<Person> people = new HashSet<Person>();
		
		people.add(new Person("Sasho", 1));
		people.add(new Person("Ancho", 2));
		people.add(new Person("Mite", 3));
		people.add(new Person("Viki", 4));
		people.add(new Person("Minka", 5));
		people.add(new Person("Sasho", 1));
		
		System.out.println(people);
	
//	     Collections.sort(people, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person p1, Person p2) {
//				if(p1.getId()>p2.getId()){
//					return 1;
//				}
//				if(p1.getId()<p2.getId()){
//					return -1;
//				}
//				return 0;
//			}
//	    	
//	     });
         System.out.println("By id");	
	     System.out.println(people);
	     
	     
//	     Collections.sort(people, new Comparator<Person>() {
//
//				@Override
//				public int compare(Person p1, Person p2) {
//					return p1.getName().compareTo(p2.getName());
//				}
//		    	
//		     });
	         System.out.println("By name");	
		     System.out.println(people);
	}
	
}
