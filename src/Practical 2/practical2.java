/**
 * @(#)practical 2.java
 *
 *
 * @author 
 * @version 1.00 2019/6/8
 */

import java.lang.Math;

public class practical2 {
//	/** Question 1 */
//
//	/** Converts from inches to centimeters */
//	public static double inchtoCentimeter(double in){
//		double cm = in * 2.54;
//		return cm;
//	}
//	
//	/** Converts from centimeters to inches */
//	public static double centimetertoInch(double cm){
//		double in = cm / 2.54;
//		return in;
//	}
//	
//    public static void main(String[] args) {
//		System.out.format("%16s%20s\t%20s%16s\n","Inches","Centimeters","Centimeters","Inches");
//		for(int i=1;i<=10;i++){
//			System.out.format("%16.2f%20.2f\t%20.2f%16.2f\n",(double)i, inchtoCentimeter((double)i), (double)i*5, centimetertoInch((double)i*5));
//		}    	
//    }
//    

//    /**************/    

//	/** Question 2 */	
//	public static void main(String[] args){
//		System.out.println(Calculate.calculateAverage(3,3));
//	} 
//
//	
//	/**************/

//	/** Question 3 */
//	public static void main(String[] args){
//		System.out.format("%15s%15s\n", "Number", "SquareRoot");
//		for(int i=0;i<10;i++){
//			System.out.printf("%15d%15.4f\n", i*2, Math.sqrt((i*2)));
//		}
//	}
//	/**************/
	
	/** Question 4 */
	static double sqrRoot(double num){
		double lower=0, upper=0, midpoint;
		
		if(num>1){
			lower = 1;
			upper = num;
		}
		if(num<0){
			System.out.println("Error square rooting of negative number.");
			System.exit(-1);
		}
		if(num == 0){
			return 0;
		}
		
		midpoint = (lower + upper)/2;
		do{
			
			if(Math.pow(midpoint,2)>num){
				upper = midpoint;
			}
			else{
				lower = midpoint;
			}
			
			midpoint = (lower + upper)/2;
		}while((upper - lower)/lower > (1/Math.pow(10,8)));	
			
		return midpoint;
	}
	
	public static void main(String[] args){
		double midpoint=sqrRoot(49);
		System.out.println("Midpoint is " + midpoint);		
	}
	/**************/
}
	