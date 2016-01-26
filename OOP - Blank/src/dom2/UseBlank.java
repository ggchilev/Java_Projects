package dom2;

import java.util.Scanner;

public class UseBlank {
	public static void main(String[] args){
	
		boolean check=false;
		String var1="gramota1";
		String var2="gramota2";
		String var3=null;
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("Choose gramota 1 or gramota2 ");
		var3=keyboard.nextLine();
		Blank blank = new Blank();
		blank.setReceiver("Georgi");
		blank.setSender("Stois");
		blank.setFreeText("qwdioahsionkdqawQNASKLHUBDG");
		try {
			
			blank.setType(var3);
			check=true;
		} catch (TypeException e) {
		
		}
		if (check){
		
		System.out.println(blank.display());
	}
		else {
			System.out.println("Error");
		}
	}
}

