package stepenNa2;

import java.util.Scanner;

public class Demo {

     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 int x = sc.nextInt();
    	 
    	 if(x==1){
			 System.out.println("Power of 2");
			 return;
		 }
    	 while(x>1){ 
    		 if(x%2 != 0){
    			 System.out.println("Not power of 2");
    			 return;
    		 }
    		 x=x/2;
    	 }
    	 System.out.println("Power of 2");
	}
	
	
}
