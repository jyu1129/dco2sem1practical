import java.util.*;
public class P5Q5 {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	for(int i = 0; i<args.length; i++){
    		System.out.println("Please enter your name: ");
	    	String name = scanner.nextLine();
	    	name = name.charAt(0).toUpperCase();
	    	
	    	System.out.println(args[i]);
    	}
    	
    }
}