package gaga;

import java.util.Scanner;

public class gaga {
	public static void main(String[] args) {

		
		
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input number of holidays in mnth 1");
		 int b=sc.nextInt();
		 int[] m = new int[3];
		 int[] holiday = new int[b];
		 
		 for(int i=1; i<=m.length; i++){
			 for(int j=0; j<b; j++){
				 System.out.println("Input holiday N"+(j+1));
				 holiday[j]=sc.nextInt();
			 }
			 System.out.println("Input number of holidays in mnth "+(i+1));
			 b=sc.nextInt();
		 }
		 
		 for(int i=0; i<=m.length-1; i++){
			 for(int j=0; j<b; j++){
				 System.out.println("Holiday N"+(j+1)+" e "+holiday[j]);
			 }
			 System.out.println();
		 }	
	
}
}
