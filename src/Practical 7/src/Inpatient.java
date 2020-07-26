public class Inpatient extends PatientBill{
	private static double standardRate = 100.00;
	private static double privateRate = 200.00;
    private double spclistCharges;
	private double labCharges;
	private char roomType;
	private int durationOfStay;
	
    public Inpatient(String visitID, String name, double spclistCharges, double labCharges, char roomType, int durationOfStay) {
			super(visitID, name);
			this.spclistCharges = spclistCharges;
			this.labCharges = labCharges;
			this.roomType = roomType;
			this.durationOfStay = durationOfStay;
    }
    
    public double calcTotalCharges(){
    	double roomCharges = 0.0;
    	switch(roomType){
    		case 'S':
    			roomCharges = durationOfStay * standardRate;
    			break;
    		case 'P':
    			roomCharges = durationOfStay * privateRate;
    			break;
    	}
    	return spclistCharges + labCharges + roomCharges;
    }
    
	
}