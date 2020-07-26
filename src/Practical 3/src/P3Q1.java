///**
// * @(#)P3Q1.java
// *
// * P3Q1 application
// *
// * @author Yu
// * @version 1.00 2019/6/8
// */
// 
//import java.util.*;
// 
//class P3Q1{
//    
//    static double avgCalc(int x[], int n){
//    	double total = 0;
//    	for(int i=0;i<n;i++){
//    		total += (double)x[i];
//    	}
//    	
//    	
//    	return total/(double)n;
//    }
//    
//    public static void main(String[] args) {
//		int n;
//
//    	Scanner scan = new Scanner(System.in);
//    	
//    	System.out.print("Enter number of quiz scores to process: ");
//    	n = scan.nextInt();
//    	
//    	int i;
//    	int[] score = new int[n];
//    	
//    	for(i=0;i<n;i++){
//    		System.out.print("\nScore " + (i+1) + ": ");
//    		score[i] = scan.nextInt();
//    	}
//    	
//    	double avg = avgCalc(score, n);	
//    	int eqAbove = 0;
//    	int below = 0;
//    	
//    	for(i=0;i<n;i++){
//    		if((double)score[i]>=avg){
//    			eqAbove++;
//    		}
//    		else{
//    			below++;
//    		}
//    	}
//    	
//    	System.out.println("Results");
//    	System.out.println("=======");
//        System.out.println("Average is " + avg);
//        System.out.println("Number of scores above or equal to the average is " + eqAbove);
//        System.out.println("Number of scores below to the average is " + below);
//    }
//}
