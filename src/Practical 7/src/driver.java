public class driver {

    public static void main(String[] args) {
    	PatientBill[] o = {new Outpatient("1001", "Abel", 30.00, 50.00), 
    				       new Inpatient("1002", "Aleb", 40.00, 50.00, 'S', 4),
    					   new Outpatient("1003", "Bela", 40.00, 70.00), 
    					   new Inpatient("1004", "Leba", 50.00, 80.00, 'P', 5)};
    	
    	System.out.println((Outpatient)o[0]);
    }
}