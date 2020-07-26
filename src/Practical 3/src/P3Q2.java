///**
// * @(#)P3Q2.java
// *
// *
// * @author Yu
// * @version 1.00 2019/6/8
// */
//
//import java.lang.Math;
//public class P3Q2{	
//	static int smallest(int[] list){
//		int smallest = list[0];
//		int smallestIndex=0;
//
//		for (int i=0; i<list.length; i++){
//			smallest = Math.min(smallest,list[i]);
//			if(smallest == list[i]){
//				smallestIndex = i;
//			}
//		}
//		
//		return smallestIndex;
//	}
//	
//    public static void main(String[] args) {
//    	int []list = {1,2,4,5,10,100,2,-22};
//    	int smallestIndex;
//    	smallestIndex = smallest(list);
//    	
//    	System.out.println("Smallest index is " + smallestIndex + ".");
//    }
//    
//    
//}