import java.util.*;
public class P5Q1 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a word: ");
    	String word = scanner.nextLine();
    	
    	System.out.print("Enter the letter you want to count: ");
    	char ch = scanner.next().charAt(0);
    		
    	int counter = countLetter(word, ch);	
    	
    	System.out.println(word + " contains " + counter + " " + ch);
    	
    }
    
    public static int countLetter(String str, char ch){
    	int counter = 0; 
    	for(int i = 0; i < str.length(); i++){
    		if(str.charAt(i) == 'p'){
    			counter++;
    		}
    	}
    	return counter;
    }
}