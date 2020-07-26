public class Outpatient extends PatientBill{
	private double regFees;
    private double consultFees;
	
    public Outpatient(String visitID, String name, double regFees, double consultFees) {
    	super(visitID, name);
    	this.regFees = regFees;
    	this.consultFees = consultFees;
    }
    
    public double calcTotalCharges(){
    	return regFees * consultFees;
    }
    
    public String toString(){
    	return "Visit ID: " + visitID +
    		   "\nName: " + name + 
    		   "\nRegFees: " + regFees +
    		   "\nconsultFees: " +consultFees;
    }
}