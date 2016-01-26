import java.util.Scanner;

public class Demo {

	static char[][] board = new char[3][3];
	static char playerMark = 'x';
	
	static void board(){
		
		System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
            System.out.print(board[i][j]+" | ");
            }		
            System.out.println();		
            System.out.println("-------------");	
        }
	}
        static void playerMark(int x,int y){
        	      
        	if(board[x-1][y-1]!= 'x' && board[x-1][y-1] != 'o'){
        		board[x-1][y-1] = playerMark;       	
        	}        	
        	else
        	{System.out.println("The slot is occupied");
        	 changePlayer();
        	}        	 	
        }
        
        static void changePlayer(){
        	
        	if(playerMark == 'x'){
        		playerMark='o';
        	}
        	else{
        		playerMark='x';
        	}
        	
        }
        
        static boolean checkRows(){
        	
        	for(int row=0;row<board.length; row++){
        		if(board[row][0] == playerMark && board[row][1]== playerMark && board[row][2]==playerMark){
        			if(playerMark == 'x'){
        			System.out.println("Player one wins");
        			}
        			if(playerMark == 'o'){
        				System.out.println("Player two wins");
        			}
        			return true;
        		}
        	}
        	return false;
        	
        }
       
        static boolean checkCols(){
        	
        	for(int col=0;col<board[0].length; col++){
        		
        		if(board[0][col]==playerMark && board[1][col]==playerMark && board[2][col]==playerMark){
        			if(playerMark == 'x'){
            			System.out.println("Player one wins");
            			}
            			if(playerMark == 'o'){
            				System.out.println("Player two wins");
            			}
        			return true;
        		}
        		
        	}
        	return false;
        }
	
        static boolean checkDiagonals(){
        	
        	for(int row=0;row<board.length;row++){
        		if(board[0][0]==playerMark && board[1][1]==playerMark && board[2][2]==playerMark){
        			if(playerMark == 'x'){
            			System.out.println("Player one wins");
            			}
            			if(playerMark == 'o'){
            				System.out.println("Player two wins");
            			}
        			return true;
        		}
        		if(board[2][0]==playerMark && board[1][1]==playerMark && board[0][2]==playerMark){
        			if(playerMark == 'x'){
            			System.out.println("Player one wins");
            			}
            			if(playerMark == 'o'){
            				System.out.println("Player two wins");
            			}
        			return true;
        		}
        		
        	}
        	return false;
        }
        
    static boolean isBoardFull(){
    	boolean isBoardFull = true;
    	for(int row=0;row<board.length;row++){
    		for(int col=0;col<board[row].length;col++){
    			if(board[row][col]!='x' && board[row][col]!='o'){
    				isBoardFull = false;
    			}
    		}
    		
    	}
    	return isBoardFull;
    }
        
    static void clearBoard(){
    	
    	for(int row=0;row<3;row++){
    		for(int col=0;col<3;col++){
    			board[row][col] = ' ';
    		}
    	}
      }
    
	public static void main(String[] args) {
		
		System.out.println("Let`s play a game ");
		System.out.println("Player one is x");
		System.out.println("Player two is o");
		Scanner sc = new Scanner(System.in);
		String answer = "";
             board();
           
             while(!isBoardFull()){ 
            	 if(playerMark=='x'){
            		 System.out.println("Player one`s turn ");
            	 }
            	 if(playerMark=='o'){
            		 System.out.println("Player two`s turn ");
            	 }
             System.out.println("Choose row");
             int row=sc.nextInt();
             System.out.println("Choose col");
             int col=sc.nextInt();
             playerMark(row,col);	 
         	 board();	
             if(checkRows()==true){
            	 System.out.println("Type YES if you want to play again ");
            	 answer=sc.next();
            	 if(answer.equals("YES")){
            		clearBoard(); 
            		board();
             continue;
            	 }
            	 else{
            		 return;
            	 }
            	 
             }
             if(checkCols()==true){
            	 System.out.println("Type YES if you want to play again ");
            	 answer=sc.next();
            	 if(answer.equals("YES")){
            		clearBoard(); 
            		board();
             continue;
            	 }
            	 else{
            		 return;
            	 }
             }
             if(checkDiagonals()==true){
            	 System.out.println("Type YES if you want to play again ");
            	 answer=sc.next();
            	 if(answer.equals("YES")){
            		clearBoard(); 
            		board();
             continue;
            	 }
            	 else{
            		 return;
            	 }
             }
             changePlayer(); 
             }
                System.out.println("No winners in the game");
                System.out.println("Type YES if you want to play again ");
           	 answer=sc.next();
           	 if(answer.equals("YES")){
           		clearBoard(); 
           		board();
           	 }
		    }
	}
