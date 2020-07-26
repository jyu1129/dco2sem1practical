import java.util.Scanner;
public class P5Q3 {

    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a password : ");
    	String password = input.nextLine();
    	
    	boolean pwValid = checkPW(password);
    	
    	if(pwValid){
    		System.out.println("Valid Password");
    	}else{
    		System.out.println("Invalid Password");
    	}
    }
    
    private static boolean checkPW(String password){
    	boolean validity;
    	boolean cL1 = false;
    	boolean cL2 = false;
    	
    	if(password.length() >= 7){
    		for(int i = 0; i < password.length(); i++){
    			if(Character.isLetter(password.charAt(i))){
    				cL1 = true;
    			}
    			if(Character.isDigit(password.charAt(i))){
    				cL2 = true;
    			}
    		}
    	}
    	
    	validity = cL1 && cL2;
    	return validity;
    }
}