class CommissionEmployee extends Employee {

	private double grossSale;
	private double commissionRate;
	
    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
    	super(name, yearJoined, basicSalary);
    	this.grossSale = grossSale;
    	this.commissionRate = commissionRate;
    }
    
    public double calculateSalary(){
    	double salary = basicSalary + grossSale * commissionRate;
    	return salary;
    }
    
    public void setGrossSale(double grossSale){
    	this.grossSale = grossSale;
    }
    
    public void setCommissionRate(double commissionRate){
    	this.commissionRate = commissionRate;
    }
    
    public double getGrossSale(){
    	return grossSale;
    }
    
    public double getCommissionRate(){
    	return commissionRate;
    }
    
    public String toString(){
    	return super.toString() + 
    			"\nEmployee Type: Commission Employee" +
    		   "\nGross Sale: RM" + grossSale +
    		   "\nCommission Rate: RM" + commissionRate;
    }
    
    
}