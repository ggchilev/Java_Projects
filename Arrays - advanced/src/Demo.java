import java.util.Scanner;


public class Demo {

	// Task 5 :
	
//	static void array(int[] b, int m){
//		   
//		   if(m==0){
//			     return;			
//			 }
//
//			for(int i=0;i<b.length-1;i++){
//				if(b[i]>b[i+1]){
//					int temp = b[i];
//					b[i] = b[i+1];
//					b[i+1] = temp;
//				
//				}
//				
//			}
//			
//			array(b,m-1);
//	}
//		
				
	public static void main(String[] args) {
	
		// Task 5 :
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Input number ");
//		int n = sc.nextInt();
//		int[] a = { 5,3,2,3,15,30 };
//		int[] b = new int[a.length+1];
//		int x=b.length;
//		int i;
//		for( i=0;i<a.length;i++){
//			b[i]=a[i];
//		}
//		b[a.length]=n;
//		for(int j=0;j<b.length;j++){
//		array(b,x);
//		System.out.print(b[j]+" ");
//		}
		
		
		
		
		
		// Task 1 :
		
//		int[][] a = {
//				{15, 16, 8, 1},        
//				{2,  3,  4, 7},           
//				{9,  11, 19, 6}        
//		};
//		int temp;
//        for(int row=0;row<a.length;row++)
//        {
//            for(int col=0;col<a[row].length;col++)
//            {
//                for(int i=0;i<a.length;i++)
//                {
//                    for(int j=0;j<a[row].length;j++)
//                    {
//                        if(a[i][j]>a[row][col])
//                        {
//                            temp=a[row][col];
//                            a[row][col]=a[i][j];
//                            a[i][j]=temp;
//                        }
//                    }
//                }
//            }
//        }
//		
//        for(int row=0;row<a.length;row++)
//        {
//            for(int col=0;col<a[row].length;col++)
//            {
//				System.out.print(a[row][col]+" ");
//			}
//			System.out.println();
//		}
		
		// Task 2 :
		
//		int k=0;
//		int numberOfSquares=0;
//		int[] a = {1,1,1,1,2,2,3,3,3,4};
//		int count = 1;		
//		for(int i=0; i<a.length-1; i++){
//		if(a[i]==a[i+1]){
//			count++;
//		}
//		if(i==a.length-2 && count>k){
//			k=count;
//		}
//		if(a[i]!=a[i+1]){
//			if(count>k){
//			 k=count;			
//			count=1;
//		}
//			else{
//				count=1;
//			}
//		}
//		}
//		for(int i=0; i<a.length-2; i++){
//			if(a[i]==a[i+1] && a[i+1]!=a[i+2]){
//				numberOfSquares++;
//			}			
//		}
//		if(a[a.length-1]==a[a.length-2]){
//			numberOfSquares++;
//		}
//		System.out.println("The longest squre is "+k+" elements");
//		System.out.println("Number of squares : "+numberOfSquares);


						
		// Task 3 :
		
//		int[] a = { 1,2,3,4,5,11,6,7,9 } ;
//		int i;
//		for( i=0; i<a.length-1; i++){
//			if(a[i]>a[i+1]){
//				System.out.println(a[i]+">"+i);
//				System.out.println("Elements are not sorted");
//				break;
//			}
//			if (i==a.length-2){
//				System.out.println("Elements are sorted");
//				}
//		}
		
		// Task 4 :
		
//		int[] a = { 1, 3, 5, 7, 9, 11, 45 };
//        int[] newArray = new int[a.length+1];
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=0;i<a.length;i++){
//		newArray[i]=a[i];
//		}
//		newArray[newArray.length-1]=n;
//		
//		
//		for(int j=0; j<newArray.length;j++){
//		for(int i=0;i<newArray.length-1-j;i++){
//			if(newArray[i]>newArray[i+1]){
//				int temp=newArray[i];
//				newArray[i]=newArray[i+1];
//				newArray[i+1]=temp;
//			}
//		}
//		}
//		for(int i=0;i<newArray.length;i++){
//			System.out.print(newArray[i]+" ");
//		}
		
}				
}

		
