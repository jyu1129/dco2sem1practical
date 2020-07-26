class Account {
	protected String accNo;
	protected double balance;
    protected Date dateCreated;
    
    public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;				
    }
    
    public boolean equals(Account o){
    	if(o.accNo == this.accNo){
    		return true;
    	}else{
    		return false;
    	}
    }
	
	public void deposit(double amount){
		balance += amount;
	}	
	
	public boolean withdraw(double amount){
		if(amount > balance){
			return false;
		}else{
			balance -= amount;
			return true;
		}
	} 
}