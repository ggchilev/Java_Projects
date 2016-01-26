import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Demo {
	

	
	public static void main(String[] args) {

		
		// Task 1 :
		
		Scanner sc = new Scanner(System.in);		
//		System.out.println("Enter String");
//		String prefix = sc.nextLine();
//		System.out.println("Enter another String");
//		String text = sc.nextLine();
//		
//		if(text.startsWith(prefix)){
//			System.out.println("YES");
//		}
//		else{
//			System.out.println("NO");
//		}
		
		// Task 2 : 
		
		
//		System.out.println("Enter your  first name ");
//		String name = sc.next();
//		System.out.println("Enter your familly ");
//		String familly = sc.next();
//		System.out.print(name.charAt(0)+" ");
//		System.out.println(familly.charAt(0));
		
		// Task 3 :
					 
//	      System.out.println("Enter a string to check if it is a palindrome");
//	      String original = sc.nextLine();
//	      String  reverse = "";	 
//	      for ( int i = original.length() - 1; i >= 0; i-- ){
//	         reverse = reverse + original.charAt(i);
//	      }
//	      if (original.equals(reverse)){
//	         System.out.println("Palindrome");
//	      }
//	         else{
//	         System.out.println("Not palindrome");
//	         }
			
			// Task 4 :
		
//		int[] mas = new int[1];
//		System.out.println("Please input some text ");
//		String text = sc.nextLine();
//		int counter = 0;
//		for(int i=0; i<text.length(); i++){	
//			if(text.charAt(i)>='a'&& text.charAt(i)<='z'){
//				counter++;			
//				
//			}			
//		}
//		for(int j=0; j<mas.length; j++){
//		     mas[j]=counter;
//		     System.out.println(mas[j]);
//		}
		
		// Task 5 :
		
//		boolean isFound=true;
//		System.out.println("Input first string");
//		String text=sc.nextLine();
//		System.out.println("Input second string");
//		String anagram=sc.nextLine();
//		
//		if(text.length()==anagram.length())
//		{
//		for(int i=0;i<text.length();i++)
//		{
//		for(int j=0;j<anagram.length();j++)
//		{
//		if(text.charAt(i)==anagram.charAt(j))
//		{
//		isFound=true;
//		break;
//		}
//		else{
//		isFound=false;
//		}
//		}
//		}
//		}
//		else{
//		isFound=false;
//		}
//		if(isFound){
//		System.out.println("ANAGRAMS");
//		}
//		else{
//		System.out.println("NOT ANAGRAMS");
//		}
		
		// Task 6 :
		
//		String[] mas = { "Glory", "glory", "Man", "United" };
//		String text = "";
//		for(int i=0;i<mas.length; i++){
//			text+=mas[i];
//		}
//		System.out.println(text);
		
		// Task 7 :
		
//		double[][] matrix = {
//				{12.345,23.2,34.23,46.001},
//				{51,62.223,73.21,21.32},
//				{93,10,11.111,12},
//				{13,14.23,15,16},				
//		};
//		String str = "";
//		DecimalFormat df = new DecimalFormat("####0.00");
//		String k="";
//		for(int i=0;i<matrix.length;i++){
//			for(int j=0;j<matrix[i].length;j++){
//				 k+=matrix[i][j];
//				k = df.format(matrix[i][j]);
//			 str+=k+" ";			 
//			}
//			System.out.printf(str);
//			str="";
//			System.out.println();
//		}
		
		

		// Task 8 :
		
//		String[] txt = {"ABC" , "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
//		System.out.println("Input number");
//		int num= sc.nextInt();
//		int num1=num%10;
//			
//		if(num!=2 && num!=22 && num!=222 && num!=3 && num!=33 && num!=333 && num!=4 && num!=44 && num!=444
//				 && num!=5 && num!=55 && num!=555 && num!=6 && num!=66 && num!=666 && num!=7 && num!=77
//				 && num!=777 && num!=7777 && num!=8 && num!=88 && num!=888 && num!=888 && num!=9 && num!=99
//				 && num!=999 && num!=9999){
//			System.out.println("Wrong number");
//			return;
//		}
//		
//		for(int i=0; i<txt.length; i++){
//			if(i+2==num1){
//				if(num/1000==num1){
//					System.out.println(txt[i].charAt(3));
//					break;
//				}
//			if(num/100==num1){
//			System.out.println(txt[i].charAt(2));
//			break;
//		}
//		if(num/10%10==num1){
//			System.out.println(txt[i].charAt(1));
//			break;
//		}
//		if(num%10==num1){
//			System.out.println(txt[i].charAt(0));
//			break;
//		}
//		break;
//		}
//		}
		
		// Task 9 :
		
//		String text = "";
//		System.out.println("Input positive number n");
//		int n = sc.nextInt();
//		if(n<0){
//			System.out.println("Wrong number");
//			return;
//		}
//			for(int i=0;i<=n;i++){
//				text+=i;
//			}
//			for(int j=0; j<text.length();j++){
//				System.out.print(j+" ");
//			}
		
		// Task 10 :
		
//		String text = "";
//		System.out.println("Input positive number n");
//		int n = sc.nextInt();
//		if(n<0){
//			System.out.println("Wrong number");
//			return;
//		}
//			for(int i=0;i<=n;i++){
//				text+=i;
//			}
//			for(int j=0; j<text.length();j++){
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		    System.out.println("Now choose one of the numbers from the String ");
//		    String m=sc.next();
//		    System.out.println("Index of m is ");
//		    System.out.println(text.indexOf(m));
		
		// Task 11 :
				
		
//		String word = "united" ; 
//		String letter = "";
//		int br=0;
//		int countOfMistakes=4;
//		String[] yourWord = new String[6];
//		int attempts=9;
//		boolean isFound=false;	
//		int i,j;
//		    while(attempts!=0){
//		    System.out.println(" Input a letter ");
//		    letter=sc.next();
//		    attempts--;
//		    
//		    for( i=0;i<word.length();i++){
//		    	
//		    	if(letter.charAt(0)==(word.charAt(i))){
//		    		isFound=true;
//		    		yourWord[i]=letter;			    		
//		    	  			    	}
//		    	else{
//		    		if(yourWord[i]==null)
//		    		yourWord[i]="_";
//		    		
//		    	}
//		   
//		    		    		 
//		    }
//		    
//			letter="";
//		    if(!isFound){
//		    	System.out.println("Wrong letter");    	
//		    	countOfMistakes--;
//		    }
//		    if(countOfMistakes==0){
//		    	System.out.println("You loose - the word is "+word);
//		    	return;
//		    }
//		    for( j=0;j<yourWord.length; j++){
//		    	System.out.print(yourWord[j]+" ");
//		    	
//		    }
//		    for( j=0;j<yourWord.length; j++){
//		    	if(yourWord[j]!="_"){
//		    		br++;
//		    	}		    	
//		    }
//		    if(br==word.length()){
//		    	System.out.println("Congratulations - you WIN");
//		    	return;
//		    }
//		    br=0;
//		    System.out.println("You have "+attempts+" more attempts ");
//		    System.out.println("You have "+countOfMistakes+" more mistakes");
//		    System.out.println();
//		    isFound=false;
//		    }
//		 
//		    if(attempts==0){
//		    	System.out.println("you loose - LOOSER :D");
//		    	System.out.println("The word is "+word);
//		    }
		
		
		// Recursion
		
		// Task 1 :		
		// System.out.println(fibonacci(5));
		// Task 2 :
		// System.out.println(multiplication(4,5));
		// Task 3 :
        // System.out.println("Input number");
        // int a =sc.nextInt();
        // System.out.println(isPrime(a, a-1));
		// Task 4 :
		// triangle(1, 9, 0);
 	    // Task 5 :
		// int x=0;
 	    // reverseNumber(121,x);
		
		
		}
	
             // Recursion :

            // Task 1 :

//           static int fibonacci(int n){
//        	
//        	   if(n<0){
//        		return 0;
//        	}
//        	   if(n==0){
//        		   return 1;
//        	   }           		   
//        	   return fibonacci(n-1) + fibonacci(n-2);
//           }
	
	           // Task 2 :
	
//	         static int multiplication(int x,int y){
//	        	 if(x==0){
//	        		 return 0;
//	        	 }
//	        	 if(y==0){
//	        		 return 0;
//	        	 }
//	        	 if(x==1){
//	        		 return y;
//	        	 }
//	        	 if(y==1){
//	        		 return x;
//	        	 }
//	        	 return multiplication(x,(y-1)) + x;
//	         }
	 
	          // Task 3 :
	
            	  
//	static boolean isPrime(int n,int div){
//	
//		if(n==1){
//			return true;
//		}
//		if(div==1){
//			return true;
//		}
//		
//		if(n%div == 0){
//			return false;
//		}
//		return isPrime(n,div-1);
//	}
	
	
	
         
	         // Task 4 :
  
//	       static void triangle(int x, int y,int k){
//	    	   int[] tr = new int[x];
//	    	   if(x<=y){
//	    		 
//	    		   for(int i=x;i<=x+k;i++){
//	    			   System.out.print(i+" ");	    			   
//	    			   }	    		  
//	    	   }	    	 
//	    	   System.out.println();
//	    	   k++;  
//	    	   if(x+k==y+1){
//	    		   return;
//	    	   }
//	    	   triangle(x,y,k);	    	   
//	       }
	

	         // Task 5 :
	
//        static void reverseNumber(int n,int m){
//	           if(n==0){
//	        	   System.out.print(m);
//	        	   int num=m;
//	        	   int rev = 0;
//	        	   int dig=0;
//	        	   while (num > 0)
//	        	   {
//	        	        dig = num % 10;
//	        	        rev = rev * 10 + dig;
//	        	        num = num / 10;
//	        	   }
//	        	   if(rev==m){
//	        		   System.out.println(" yes");
//	        	   }
//	        	   else{
//	        		   System.out.println(" no");
//	        	   }
//	        	   return;
//                      }	
//	           reverseNumber(n/10, m*10 + n%10);	        	   
//	           }
//	           
	  	 
	        	
	        	 
	         
	
}
