import java.util.Scanner;
import java.lang.*;
public class Q5 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter your name: ");
    	String name = scanner.nextLine();
    	String newName = "";
    	
    	name = name.toLowerCase();
    	String[] modName = name.split(" ");
    	String title = modName[modName.length-1];
    	title = title.replace(title.charAt(0),Character.toUpperCase(title.charAt(0)));
		for(int i = 0; i < modName.length-1; i++){
			if(modName[i].charAt(0) == '['){
				modName[i] = modName[i].replace(modName[i].charAt(1),Character.toUpperCase(modName[i].charAt(1)));
			}else{
				modName[i] = modName[i].replace(modName[i].charAt(0),Character.toUpperCase(modName[i].charAt(0)));
			}
			newName = newName + modName[i];
		}	    	
			
		String surname = newName.substring(newName.indexOf("[")+1,newName.indexOf("]"));
		
		newName = newName.replaceAll("\\["," ").replaceAll("\\]"," ");
		
		System.out.println("To: " + newName + "\nWishing you a Merry Christmas, " + title + " " + surname + ".");
    }
}