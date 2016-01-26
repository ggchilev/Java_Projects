package sum;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String[] text = {"dobre","de","Willy"};
     int n=0;
     for(int row=0; row<x; row++)
     {
    	 for(int col=0; col<x; col++)
    	 {
    		 if(row==0 || row==x-1 || col==0 || col==x-1)
    		 {
    			 System.out.print("*");
    		 }
    		 else
    		 {
    			 if(n<3){
    			 System.out.print(text[n]);
    			 }
//    			 else{
//    				 System.out.println(" ");
//    			 }
    		 }
    		 n++; 
    	 }
    	 
    	 System.out.println();
     }
     
		
	}
}