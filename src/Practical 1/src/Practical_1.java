/**
 * @(#)Practical_1.java
 *
 * Practical_1 application
 *
 * @author 
 * @version 1.00 2019/6/1
 */
 
 import java.util.*;
 
public class Practical_1 {
    
    public static void main(String[] args) {
    	
    	question1();
    	question2();
    	question3();
    }
    
    public static void question1(){
    	System.out.println("This is question 1");
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter name: ");
    	String name = scanner.nextLine();
    	System.out.println("Enter your year of study: ");
    	int yearOfStudy = scanner.nextInt();
    	System.out.println("What is your target GPA for this semester?");
    	double gpa = scanner.nextDouble();
    	
    	System.out.println("Welcome " + name + "!");
    	System.out.println("Work hard to achieve your target GPA of " + gpa + " this semester of your Year " + yearOfStudy);
    }
    
	public static void question2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is question 2");
		System.out.println("Enter your age (years): ");
		int age = scanner.nextInt();
		int ageInDays = age * 365;
		int ageInSeconds = ageInDays * 86400;
		System.out.println("Age in years : " + age + " years");
		System.out.println("Age in days : " + ageInDays + " days");
		System.out.println("Age in seconds : " + ageInSeconds + " seconds");
		System.out.println("\nProcess completed");
	}
	
	public static void question3(){
		int sumRightMostDigit = 0;
		int sumOtherDigit = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("This is question 3");
		System.out.println("Enter your 8-digit credit card number : ");
		int creditCardNum = scanner.nextInt();
		int tempNum = creditCardNum;
		
		//This is to calculate the sum from the right most digit
		for(int i=1; i<=4; i++){
			sumRightMostDigit += tempNum % 10;
			tempNum /= 100;
		}
		
		tempNum = creditCardNum;
		tempNum /= 10;
		for(int i=1; i<=4; i++){
			int tempDoubleNumber = (tempNum % 10) * 2;
			sumOtherDigit += tempDoubleNumber % 10;
			tempDoubleNumber /= 10;
			sumOtherDigit += tempDoubleNumber;
			tempNum /= 100;
		}
		
		System.out.println("Sum Rightmost Digit > " + sumRightMostDigit );
		System.out.println("Sum of other digit > " + sumOtherDigit);
		sum = sumRightMostDigit + sumOtherDigit;
		
		if(sum % 10 == 0){
			System.out.println("This Credit card number is valid.");
		}
		else{
			System.out.println("This Credit card number is invalid.");
		}
	}
}
