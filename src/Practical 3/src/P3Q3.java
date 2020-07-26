/**
 * @(#)P3Q3.java
 *
 *
 * @author 
 * @version 1.00 2019/6/15
 */
import java.util.*;
public class P3Q3 {
        
    /**
     * Creates a new instance of <code>P3Q3</code>.
     */
    public static int[] BankingProgram(int[] denom) {
    	int[] bankNotes = new int[6];
    	int[] values = new int[6];
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.format("%20s%15s\n","Denomination (RM)","Quantity");
    	for(int i = 0; i<denom.length;i++){
    		System.out.format("%15d\t\t\t\t  ",denom[i]);
    		bankNotes[i] = input.nextInt();
    		values[i] = bankNotes[i] * denom[i];
    	}
    	
    	System.out.format("%20s%15s%15s\n","Denomination (RM)","Quantity","Value (RM)");
    	for(int i = 0; i<denom.length;i++){
    		System.out.format("%15d%15d%15d\n",denom[i],bankNotes[i],values[i]);
    	}
    	return values;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] denom = {100,50,20,10,5,1};
        int[] values = BankingProgram(denom);
        int total = 0;
        
        for(int count:values){
        	total += count;
        }
        
        System.out.format("%15s" + total, "Total = RM ");
    }
}
