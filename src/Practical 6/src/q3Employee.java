class q3Employee {
	
	protected String name;
	protected int yearJoined;
	protected double basicSalary;
	
    public q3Employee(String name, int yearJoined, double basicSalary) {
    	this.name = name;
    	this.yearJoined = yearJoined;
    	this.basicSalary = basicSalary;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public void setYearJoined(int yearJoined){
    	this.yearJoined = yearJoined;
    }
    
    public void setBasicSalary(double basicSalary){
    	this.basicSalary = basicSalary;
    }
    
    public String getName(){
    	return name;
    }
    
    public int getYearJoined(){
    	return yearJoined;
    }
    
    public double getBasicSalary(){
    	return basicSalary;
    }
    
    public String toString(){
    	return "Name: " + name +
    		   "\nYear Joined: " + yearJoined +
    		   "\nBasic Salary: " + basicSalary;
    }
    
    public boolean equals(q3Employee o){
    	if(o.name == this.name){
    		return true;
    	}else{
    		return false;
    	}
    }
    
}