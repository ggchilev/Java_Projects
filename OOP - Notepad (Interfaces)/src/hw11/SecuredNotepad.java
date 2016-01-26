package hw11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

	Scanner sc = new Scanner(System.in);
	private Page[] pages;
	private String password;

	
	
	SecuredNotepad(int numOfPages,String password) {
		super(numOfPages);
		if(numOfPages > 0){
			pages = new Page[numOfPages];
			}
			else{
				pages = new Page[10];
			}
		if(isPasswordSecured(password)==true)
		setPassword(password);
		else
			setPassword("Abv123");
	}

	
	boolean checkPass(){
		
		System.out.println("Please enter the password : ");
		String pass = sc.next();
		if(pass.equals(this.password)){
			System.out.println("The password is accepted");
			return true;
		}
		else{
			System.out.println("Wrong password");
			System.out.println("The operation is not done");
			return false;
		}
			}

	boolean isPasswordSecured(String password){
		if(password.length() <5 || password == null){
			return false;
		}
		boolean hasLower = false, hasUpper = false, hasNumber = false;
		for ( int i = 0; i < password.length(); i++ ) {
		  char c = password.charAt(i);
		  if (Character.isLowerCase(c))
			  hasLower = true;
		  if (Character.isUpperCase(c))
			  hasUpper = true;
		  if (c>='0' && c<='9')
			  hasNumber = true;
		}
	
		if(hasLower && hasUpper && hasNumber) {
		  return true;
		} 
		else {
		 return false;
		}
	}

	public Page[] getPages() {
		return pages;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
}
