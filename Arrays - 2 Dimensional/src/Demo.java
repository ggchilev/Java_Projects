import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
		
//		// Task 1 :
//		
//		int[][] a = { 
//				{18,23,31,14,15,24},
//				{45,12,43,67,32,12},
//				{65,21,34,12,52,43},
//				{90,89,34,21,45,67},
//				{78,43,26,99,61,61}
//		};
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		for(int row=0; row<a.length; row++){
//			for(int col=0; col<a[0].length; col++){
//				if(a[row][col]<min){
//					min=a[row][col];
//				}
//				if(a[row][col]>max){
//					max=a[row][col];
//				}
//			}
//		}
//		System.out.println("Max element "+max);
//		System.out.println("Min element "+min);

		// Task 2 :
		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number for n ");
//		n = sc.nextInt();
//		int[][] a = new int[n][n];
//		
//		for(int row=0; row<a.length; row++){
//			for(int col=0; col<a[0].length; col++){
//				System.out.println("Input number for row "+row+" and col "+col);
//				a[row][col]=sc.nextInt();
//			}
//		}
//		System.out.println("The top right to left down ");
//		for(int i=0; i<a.length; i++){
//	    System.out.print(a[i][i]+" ");
//		}
//		System.out.println();
//		System.out.println("The down left to top right ");
//		for(int i=0; i<a.length; i++){
//			System.out.print(a[a.length-1-i][i]+" ");
//		}
		
		// Task 3 :
		
//		Scanner sc = new Scanner(System.in);		
//		System.out.println("Input number for n ");
//		int n = sc.nextInt();
//		System.out.println("Input number for m ");
//		int m = sc.nextInt();
//		int[][] a = new int[n][m];
//		int sum=0;
//		for(int row=0; row<a.length; row++){
//			for(int col=0; col<a[0].length; col++){
//				System.out.println("Input number for row "+row+" and col "+col);
//				a[row][col]=sc.nextInt();
//				sum+=a[row][col];
//			}
//		}
//		System.out.println("The sum is "+sum);
//		System.out.println("Average : "+((double)sum/(m*n)));
		
		// Task 4 : 
		
//		int[][] array = { 
//				{1,2,3,4,5},
//				{6,7,8,9,1},
//				{2,3,4,5,6},
//				{7,8,9,10,11}
//		};
//		
//		for(int col=0; col<array[0].length; col++){
//			for(int row=array.length-1; row>=0; row--){
//				System.out.print(array[row][col]);
//			}
//			System.out.println();
//		}
		
		// Task 5 :
		
//int[][] a = {		
//		{1,2,3,4},
//		{5,6,7,8},
//		{13,14,15,16},  
//		{9,10,11,12},
//        };
//        int temp=0;
//        int temp1=0;
//        int sum=0;
//        int n =0;
//        for(int i=0; i<4; i++){
//          for(int row=0;row<a.length; row++){
//        	  sum+=a[row][n];
//          }
//         if(sum>=temp){
//          temp=sum;
//         }
//          sum=0;
//          n++;
//          }
//      System.out.println("The biggest sum:col is "+temp);
//            
//      n=0;
//      
//            for(int j=0; j<4; j++){
//        for(int col=0;col<a[j].length; col++){
//      	  sum+=a[n][col];      	 
//        }        
//       if(sum>=temp1){
//        temp1=sum;
//       }
//        sum=0;
//        n++;
//        }
//    System.out.println("The biggest sum:row is "+temp1);

		// Task 6 :
		
//		int[][] a = {
//				{11,12,13,14,15,16},
//				{21,22,23,24,25,26},
//				{31,32,33,34,35,36},
//				{41,42,43,44,45,46},
//				{51,52,53,54,55,56},
//				{61,62,63,64,65,66}
//
//		};
//		 int n=0;
//		 int sum=0;
//		 int temp=0;
//		 for(int j=0; j<6; j++){
//	        for(int col=0;col<a[j].length; col++){
//	        	if(n%2!=0){
//	      	  sum+=a[n][col];
//	      	 	}
//	        	
//	        }     
//	        if(sum!=0){
//	        System.out.println(sum);	        
//	        }
//	        temp+=sum;
//	        sum=0;
//	        n++;
//	        }
//          System.out.println("Sum of the elements = "+temp);
      
		// Task 7 :
		
//		int[][] a = {
//				{11,12,13,14,15,16,},
//				{21,22,23,24,25,26,},
//				{31,32,33,34,35,36,},
//				{41,42,43,44,45,46,},
//				{51,52,53,54,55,56,},
//				{61,62,63,64,65,66}
//
//		};
//		int sum=0;
//		int temp=0;
//		int n=0;
//		
//				 for(int row=0; row<6; row++){
//					 for(int col=0;col<a[row].length; col++){
//				      if((row+col)%2==0){
//					   sum+=a[row][col];						
//				}
//			}
//					 System.out.println("Sum of row N"+(row+1)+" is "+sum);
//						temp+=sum;
//						sum=0;
//		}
//				 System.out.println("Sum of the elements = "+temp);
		
		}
}
