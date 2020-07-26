import java.util.Scanner;
public class P5Q2 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a string: ");
    	String str = input.nextLine();

 		System.out.println("Modified string: " + str.toUpperCase().replaceAll("[AEIOU]","x"));
    }
    
}