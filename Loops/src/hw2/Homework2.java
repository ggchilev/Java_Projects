package hw2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		// // Task 1 :
		//
		// for(int num=1; num<=100; num++){
		// System.out.println(num);
		// }
		
		// // Task 2 :
		//
		// for(int num=-20; num<=50; num++){
		// System.out.println(num);
		// }

		// // Task 3 :
		//
		// for(int num=-10; num<=10; num++){
		// if(num % 2 != 0){
		// System.out.println(num);
		// }
		// }

		// // Task 4 :
		//
		// for(int num=10; num>=1; num--){
		// System.out.print(num+" ");
		// }

		// // Task 5 :
		//
		// int a, b;
		// int temp;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Input value for a ");
		// a = sc.nextInt();
		// System.out.println("Input value for b ");
		// b = sc.nextInt();
		// if(b<a){
		// temp=a;
		// a=b;
		// b=temp;
		// }
		// while(a<=b){
		// System.out.print(a+" ");
		// a++;
		// }

		// // Task 6 :
		//
		// int num;
		// int sum = 0;
		// Scanner sc = new Scanner(System.in);
		// num = sc.nextInt();
		// for(int a=1; a<=num; a++){
		// sum+=a;
		// }
		// System.out.println(sum);

		// // Task 7 :
		//
		// int n;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Input value for n ");
		// n = sc.nextInt();
		// for(int num=1; num<=n*3; num++){
		// if(num % 3 == 0){
		// System.out.print(num+",");
		// }
		// }

//		 // Task 8 :
//		
//		 int n;
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Input value for n ");
//		 n = sc.nextInt();
//		 int d = n-1;
//		 for(int num=1; num<=n; num++){
//			 for(int c=1; c<=n; c++){
//		  System.out.print(d);
//			 }
//			 System.out.println();
//		  d+=2;
//			   
//		  
//		  }
		
	
		
		
		// // Task 9 :
		//
		// int a, b;
		// int sum = 0;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Input value for a ");
		// a = sc.nextInt();
		// System.out.println("Input value for b ");
		// b = sc.nextInt();
		//
		// for(int num=a; num<=b; num++){
		//
		// int x = (int)(Math.pow(num,2));
		// if(x % 3 == 0){
		// System.out.print("skip "+(int)Math.sqrt(x)+",");
		// }
		// else{
		//
		// System.out.print(x+",");
		// sum+=x;
		// if(sum>200){
		// break;
		// }
		// }
		// }

		// // Task 10 :
		//
		// int number;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Input number ");
		// number = sc.nextInt();
		// if(number == 0 || number == 1){
		// System.out.println("PRIME");
		// }
		// for(int i=2; i<number; i++){
		// if(number % i ==0){
		// System.out.println("NOT PRIME");
		// break;
		// }
		// else{
		// System.out.println("PRIME");
		// break;
		// }
		// }

//		 // Task 11 :
//		
//		 int n;
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Input number");
//		 n = sc.nextInt();
//		 for (int i=0; i<n; i++)
//		 {
//		 for (int k=0; k<n-i; k++)
//		 {
//		 System.out.print(" ");
//		 }
//		 for (int j=0; j<i*2+1; j++)
//		 {
//		 System.out.print("*");
//		 }
//		 System.out.println();
//		 }
		
//		 // Task 11.2 :
//		
//
//        Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//        int x = 1;
//        int y = n ;
//        for(int row = 0; row < n-1; row++){
//
//              for(int s = 0; s < y - 1; s++){
//                    System.out.print(" ");
//             }
//
//            for(int s = 0; s < x ; s++){
//                  if(s == 0 || s == x-1){
//                        System.out.print("*");
//                 }else System.out.print(" "); 
//            } 
//
//           System.out.println();
//           x+=2;
//           y--;
//    }
//
//    for(int s = 0; s < (n *2) - 1; s++){
//          System.out.print("*");
//    }


//		 // Task 12 :
//		
//		 for(int num=100; num<=999; num++){
//		 int firstNumber=num/100;
//		 int secondNumber=num/10%10;
//		 int thirdNumber=num%10;
//		 if(firstNumber != secondNumber && firstNumber != thirdNumber &&
//		 secondNumber != thirdNumber){
//		 System.out.println(num);
//		 }
//		 }

		// Task 13 :
//
//		int sum;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input sum");
//		sum = sc.nextInt();
//		for (int num = 100; num <= 999; num++) {
//			int firstNumber = num / 100;
//			int secondNumber = num / 10 % 10;
//			int thirdNumber = num % 10;
//			if (firstNumber + secondNumber + thirdNumber == sum) {
//				System.out.println(num);
//			}
//   }

//		// Task 14 :
//		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number from 10 to 200 ");
//		n = sc.nextInt();
//		if(n>=10 && n<=200){
//		for(int num=n-1; num>=10; num--){
//			if(num % 7 == 0){
//				System.out.println(num);
//			}
//		}
//		}
//		else{
//			System.out.println("Please input number from 10 to 200");
//		}
		
//		// Task 15 :
//		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number > 1");
//		n = sc.nextInt();
//		if(n>=1){			
//		int sum=0;
//		int num=1;
//		do{		
//			sum+=num;				
//		num++;
//		}
//		while(num<=n);
//		System.out.println(sum);
//		}		
//		else{
//			System.out.println("Input number > 1");
//		}
		
//		// Task 16 :
//		
//		short n;
//		short m;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number from 10 to 5555 for n ");
//		n=sc.nextShort();
//		if(n<10 && n>5555){
//			System.out.println("Wrong value for n");
//			return;
//		}
//		System.out.println("Input number from 10 to 5555 for m ");
//		m=sc.nextShort();
//		if(m<10 && m>5555){
//			System.out.println("Wrong value");
//			return;
//		}
//		if(n>m){
//			short temp=n;
//			n=m;
//			m=temp;
//		}
//			for(int num=m; num>=n; num--){
//				if(num % 50 == 0){
//					System.out.println(num);
//				}
//			}
		
		// Task 17 :
				
//		int a;
//		String symbol;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input length ");
//		a = sc.nextInt();
//		System.out.println("Input symbol");
//		symbol = sc.next();
//		for(int row=0; row<a; row++)
//	    {
//	        for(int col=0; col<a; col++)
//	        {
//	            if (col==0 || col==a-1 || row==0 || row==a-1 )
//	            System.out.print("*");
//	            else
//	                System.out.print(symbol);
//	        }
//	        System.out.println();
//	    }

		
		// Task 18 :
//		
//		byte a;
//		byte b;
//		int multiplication=1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input value for a ");
//		a = sc.nextByte();
//		if(a<1 || a>9){
//			System.out.println("Wrong value for a");
//			return;
//		}
//		System.out.println("Input value for b ");
//		b = sc.nextByte();
//		if(b<0 || b>9){
//			System.out.println("Wrong value for b");
//			return;
//		}
//		if(a>b){
//			byte temp=a;
//			a=b;
//			b=temp;
//		}
//		
//          for(int num1=1; num1<=b; num1++){
//        	  for(int num2=1; num2<=b; num2++){
//        		  System.out.println(num1+"*"+num2+"="+num1*num2);
//        	  }
//           	  
//        	   }

//		// Task 19 :
//		
//		byte n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number from 10 to 99");
//		n = sc.nextByte();
//		if(n<10 || n>99){
//			System.out.println("Wrong number");
//			return;
//		}
//			while(n!=1){
//				
//				if(n % 2 == 0){
//					n=(byte)(n*0.5);
//					System.out.println(n);
//			}
//				else{
//					n=(byte)((n*3)+1);
//					System.out.println(n);
//				}
//				
//		}
		
//		// Task 20 :
//		
//		int row;
//		int col;
//	int n=0;
//	int m=0;
//	int c=0;
//		for( row=0; row<=9; row++){
//			for(col=n; col<=9; col++){
//				System.out.print(col);
//			}
//				for(c=0; c<row; c++){
//					System.out.print(c);
//				}
//			
//			
//			n++;
//			System.out.println();
//		}
		

//		// Task 21 :
          
		// 11 is jack
				// 12 is queen
				//13 is king
				// 14 is ace
//		
//      int n;
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Which card do you want ");
//      n = sc.nextInt();
//      
//      int card=2;
//      //for(int card=1; card<=13; card++){
//      while(card!=15){
//    	  for(int num=1; num<=4; num++){
//    	 
//    		  if(card>=n){
//    		  System.out.print(card+" ");
//    		  
//    		  if(num==1)
//  		        System.out.println("spatiq");
//    		  if(num==2)
//    			  System.out.println("karo");
//    		  if(num==3)
//    			  System.out.println("kupa");
//    		  if(num==4)
//    			  System.out.println("pika");
//    		  }
//    		  }
//    	  card++;
//    	  }
 
//			// Task 22 :
//		
//		int a;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input value from 1 to 999 ");
//		a = sc.nextInt();
//		if(a<1 || a>999){
//			System.out.println("Wrong value");
//			return;
//		}
//		int br=1;
//		while(br!=11){
//			if(a % 2 == 0 || a % 3 == 0 || a % 5 == 0){
//				System.out.print(br+":"+a+" ");
//				a++;
//				br++;
//			}
//			else{
//				a++;
//			}
//		}
		
//	
		// Task 23 :
		
//       
//		int num1=1;
//		int num2=1;
//		while(num1!=10){
//			while(num2!=10){
//				if(num2>=num1){
//			System.out.print(num1+"*"+num2+" = "+num1*num2+" ");
//				}
//			num2++;
//			}
//			num2=1;
//			num1++;
//			System.out.println();
//		}
		
////		// Task 24 :		
////			
//		System.out.print("Enter Number: ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int n = num;
//		int rev=0;
//		int rmd; 
//		while(num > 0) 
//		{ 
//		rmd = num % 10; 
//		rev =rev*10 + rmd; 
//		num = num / 10; 
//		} 
//		if(rev == n) 
//		System.out.println(n+" is a Palindrome Number!"); 
//		else 
//		System.out.println(n+" is not a Palindrome Number!"); 
		
 
//		// Task 25 :
//
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input number ");
//		n = sc.nextInt();
//		int factorial=1;
//		for(int num=1; num<=n; num++){
//			factorial*=num;
//					}
//		System.out.println(factorial);
		
		
		
	}
		    }
		
		
	

