import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		// Task 1.1 :

		// Scanner sc = new Scanner(System.in);
		// String[] name = new String[10];
		// int i;
		// System.out.println("Input 10 names for employees ");
		// for (i = 0; i<name.length ; i++) {
		// name[i] = sc.nextLine();
		//
		// }
		// for(String c : name){
		// System.out.println(c);
		// }

		// Task 1.2 :

		// Scanner sc = new Scanner(System.in);
		// String[] name = new String[10];
		// int i;
		// System.out.println("Input 10 names for employees ");
		// for (i = name.length-1; i >= 0; i--) {
		// name[i] = sc.nextLine();
		//
		// }
		// for(String c : name){
		// System.out.println(c);
		// }

		// // Task 2 :
		//
//		 String[] names = new String[3];
//		 int[] salaries = new int[3];
//		 int min = Integer.MAX_VALUE;
//		 int max = Integer.MIN_VALUE;
//		 Scanner sc = new Scanner(System.in);
//		 int sum=0;
//		 int i=0,j=0;
//		 int k=0;
//		 int c=0;
//		 while(i != names.length || j != salaries.length){
//		 System.out.println("Enter name for employee "+(i+1));
//		 names[i]=sc.next();
//		 System.out.println("Enter salary for "+names[i]);
//		 salaries[j]=sc.nextInt();
//		 if(salaries[j]<min){
//		 min=salaries[j];
//		 c=i;
//		
//		 }
//		 if(salaries[j]>max){
//		 max=salaries[j];
//		 k=i;
//		
//		 }
//		 sum+=salaries[j];
//		
//		
//		 i++;
//		 j++;
//		 }
//		
//		 System.out.println("The min salary is "+min+" - Employee N"+(c+1));
//		 System.out.println("The max salar is "+max+" - Employee N"+(k+1));
//		 System.out.println("The Sum of all salaries is "+sum);
//		 System.out.println("The average salary is "+(sum/salaries.length));

		// Task 3 :

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of days ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		double avrg = 0;
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Please enter temperature for day " + (i + 1));
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//		avrg = sum / arr.length;
//		int startIndex = 0, maxIndex = 0;
//		int length = 0, maxLength = 0;
//		boolean hasFailed = false;
//		for (int i = 0; i < arr.length; i++) {
//			if (hasFailed) {
//				startIndex = i;
//				hasFailed = false;
//			}
//			if (arr[i] < avrg) {
//				length++;
//			} else {
//				length = 0;
//				hasFailed = true;
//			}
//			if (length > maxLength) {
//				maxLength = length;
//				maxIndex = startIndex;
//			}
//		}
//		for (int i = maxIndex; i < maxIndex + maxLength; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// Task 3.3

		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter number of days ");
//		int n = sc.nextInt();
//		int[] segment = new int[n];
//		int[] length = new int[n];   
//
//		int maxIndex = 0;
//		int lastIndex = 0;
//
//		for (int i = 1; i < segment.length; i++) {
//			System.out.println("Enter temperature for day "+i);
//                  segment[i]=sc.nextInt();
//			if (segment[i] < segment[i - 1]) {
//
//				length[i] = length[i - 1] + 1;
//
//				if (length[i] > length[lastIndex]) {
//					lastIndex = i;
//					maxIndex = lastIndex - length[lastIndex];
//				}
//			} else
//			{
//				length[i] = 0;
//			}
//		}
//
//		for (int i = maxIndex; i <= lastIndex; i++) {
//			System.out.print(segment[i] + ", ");
//		}
//
//	
	    
	    
		// Task 4 :
		 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number of holidays for month 1");
//		int k=sc.nextInt();
//		int[][] month = new int[2][k]; //{ new int[] { 5, 10, 21, 28 },
//				new int[] { 2, 3, 12, 14, 15, 23 }, new int[] { 1, 2, 3 },
//				new int[] { 5, 10 },
//				new int[] { 1, 2, 3, 4, 18, 19, 20, 21, 22, 24 },
//				new int[] { 9 }, new int[] { 5, 10, 12, 13 },
//				new int[] { 2, 11, 12, 13, 14 },
//				new int[] { 21, 22, 23, 24, 25, 26, 29 }, new int[] { 1, 2 },
//				new int[] { 4 }, new int[] { 11, 12, 23, 24 }, };
//
//		
//		for (int i = 0; i < month.length; i++) {
//			for (int j = 0; j < k; j++) {
//				System.out.println("Input holiday N"+(j+1));				
//				month[i][j]=sc.nextInt();
//			}
//			System.out.println("Input number of holidays"+(i+1));
//			k=sc.nextInt();
//		}
//
//		for (int i = 0; i < month.length; i++) {
//			for (int j = 0; j < month[i].length; j++) {
//				System.out.print(month[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		

	}
}
