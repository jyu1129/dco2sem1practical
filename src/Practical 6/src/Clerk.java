class Clerk extends Employee{
	
	private double allowance;
	private int overtimeHours;
	private static double overtimeRate;
	
    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours, double overtimeRate) {
    	super(name, yearJoined, basicSalary);
    	this.allowance = allowance;
    	this.overtimeHours = overtimeHours;
    	this.overtimeRate = overtimeRate;
    }
    
    public double calculateSalary(){
    	double overtimePay = overtimeHours * overtimeRate;
    	double salary = basicSalary + allowance + overtimePay;
    	return salary;
    }
    
    public void setAllowance(double allowance){
    	this.allowance = allowance;
    }
    
    public void setOvertimeHours(int overtimeHours){
    	this.overtimeHours = overtimeHours;
    }
    
    public static void setOvertimeRate(double overtimeRate){
    	Clerk.overtimeRate = overtimeRate;
    }
    
    public double getAllowance(){
    	return allowance;
    }
    
    public int getOvertimeHours(){
    	return overtimeHours;
    }
    
    public static double getOvertimeRate(){
    	return overtimeRate;
    }
    
    public String toString(){
    	return super.toString() +
    		   "\nEmployee Type: Clerk" +
    		   "\nAllowance: RM" + allowance +
    		   "\nOvertime Hours: " + overtimeHours +
    		   "\nOvertime Rate: " + overtimeRate;
    }
}