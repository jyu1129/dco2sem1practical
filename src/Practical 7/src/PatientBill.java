public abstract class PatientBill {
	protected String visitID;
	protected String name;
	
    public PatientBill(String visitID, String name) {
    	this.visitID = visitID;
    	this.name = name;
    }
    
    public abstract double calcTotalCharges();
}